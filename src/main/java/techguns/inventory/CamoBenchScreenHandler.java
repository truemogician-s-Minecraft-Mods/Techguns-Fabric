package techguns.inventory;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.CraftingResultInventory;
import net.minecraft.inventory.Inventory;
import net.minecraft.inventory.SimpleInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.screen.slot.Slot;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import techguns.TGBlocks;
import techguns.TGCamos;
import techguns.TGRecipes;
import techguns.api.ICamoChangeable;
import techguns.recipes.CamoChangeRecipe;

import java.util.ArrayList;
import java.util.List;

public class CamoBenchScreenHandler extends StoneCutterStyleScreenHandler<ItemStack> {

    public CamoBenchScreenHandler(int syncId, PlayerInventory playerInventory) {
        this(syncId, playerInventory, ScreenHandlerContext.EMPTY);
    }

    public CamoBenchScreenHandler(int syncId, PlayerInventory playerInventory, final ScreenHandlerContext context) {
        super(TGBlocks.CAMO_BENCH_SCREEN_HANDLER, syncId, playerInventory, context);

        this.input = new SimpleInventory(1) {
            public void markDirty() {
                super.markDirty();
                CamoBenchScreenHandler.this.onContentChanged(this);
                CamoBenchScreenHandler.this.contentsChangedListener.run();
            }
        };
        this.output = new CraftingResultInventory();

        this.inputSlot = this.addSlot(new Slot(this.input, 0, 20, 33));
        this.outputSlot = this.addSlot(new Slot(this.output, 1, 143, 33) {
            public boolean canInsert(ItemStack stack) {
                return false;
            }

            public void onTakeItem(PlayerEntity player, ItemStack stack) {
                stack.onCraft(player.world, player, stack.getCount());
                ItemStack itemStack = CamoBenchScreenHandler.this.inputSlot.takeStack(1);
                if (!itemStack.isEmpty()) {
                    CamoBenchScreenHandler.this.populateResult();
                }

                context.run((world, blockPos) -> {
                    long l = world.getTime();
                    if (CamoBenchScreenHandler.this.lastTakeTime != l) {
                        world.playSound((PlayerEntity)null, blockPos, SoundEvents.UI_STONECUTTER_TAKE_RESULT, SoundCategory.BLOCKS, 1.0F, 1.0F);
                        CamoBenchScreenHandler.this.lastTakeTime = l;
                    }

                });
                super.onTakeItem(player, stack);
            }
        });

        addPlayerInventorySlots(playerInventory);
    }

    @Override
    protected void populateResult() {
        if (this.hasCamoRecipe(this.inputStack) && this.selctionWithinBounds(this.selectedRecipe.get())) {
            this.outputSlot.setStack(this.availableRecipes.get(this.selectedRecipe.get()).copy());
        } else {
            this.outputSlot.setStack(ItemStack.EMPTY);
        }

        this.sendContentUpdates();
    }

    @Override
    public void onContentChanged(Inventory inventory) {
        ItemStack itemStack = this.inputSlot.getStack();
        if (!itemStack.isOf(this.inputStack.getItem())) {
            this.inputStack = itemStack.copy();
            this.updateInput(inventory, itemStack);
        }
    }

    protected void updateInput(Inventory input, ItemStack stack) {
        this.availableRecipes.clear();
        this.selectedRecipe.set(-1);
        this.outputSlot.setStack(ItemStack.EMPTY);
        List<ItemStack> available_camos = new ArrayList<ItemStack>();
        if (!stack.isEmpty() && stack.getItem() instanceof ICamoChangeable) {
            ICamoChangeable camo = (ICamoChangeable) stack.getItem();
            Identifier currentcamo = new Identifier(camo.getCurrentCamoName(stack));
            for (Identifier camoname: TGCamos.getCamosFor(camo)){
                if (!camoname.equals(currentcamo)) {
                    ItemStack newStack = stack.copy();
                    if (ICamoChangeable.setCamo(newStack, camoname)){
                        available_camos.add(newStack);
                    }
                }
            }
        } else {
            List<CamoChangeRecipe> recipes = this.world.getRecipeManager().getAllMatches(TGRecipes.CAMO_CHANGE_RECIPE_TYPE, input, this.world);
            if (!recipes.isEmpty()){
                for(var recipe : recipes){
                    for (var item : recipe.getAllItems()){
                        if (item.getItem() != stack.getItem()){
                            available_camos.add(item.copy());
                        }
                    }
                }
            }
        }
        this.availableRecipes = available_camos;

    }

    @Override
    public ScreenHandlerType<?> getType() {
        return TGBlocks.CAMO_BENCH_SCREEN_HANDLER;
    }

    protected boolean hasCamoRecipe(ItemStack item){

        if (!item.isEmpty()) {
            if (item.getItem() instanceof ICamoChangeable) return true;

            Inventory tmp = new SimpleInventory(item);
            return this.world.getRecipeManager().getFirstMatch(TGRecipes.CAMO_CHANGE_RECIPE_TYPE, tmp, this.world).isPresent();
        }
        return false;
    }

    @Override
    public ItemStack transferSlot(PlayerEntity player, int index) {
        ItemStack itemStack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasStack()) {
            ItemStack itemStack2 = slot.getStack();
            Item item = itemStack2.getItem();
            itemStack = itemStack2.copy();
            if (index == 1) {
                item.onCraft(itemStack2, player.world, player);
                if (!this.insertItem(itemStack2, 2, 38, true)) {
                    return ItemStack.EMPTY;
                }

                slot.onQuickTransfer(itemStack2, itemStack);
            } else if (index == 0) {
                if (!this.insertItem(itemStack2, 2, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (hasCamoRecipe(itemStack2)) {
                if (!this.insertItem(itemStack2, 0, 1, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 2 && index < 29) {
                if (!this.insertItem(itemStack2, 29, 38, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (index >= 29 && index < 38 && !this.insertItem(itemStack2, 2, 29, false)) {
                return ItemStack.EMPTY;
            }

            if (itemStack2.isEmpty()) {
                slot.setStack(ItemStack.EMPTY);
            }

            slot.markDirty();
            if (itemStack2.getCount() == itemStack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTakeItem(player, itemStack2);
            this.sendContentUpdates();
        }

        return itemStack;
    }

    @Override
    public void close(PlayerEntity player) {
        super.close(player);
        this.output.removeStack(1);
        this.context.run((world, blockPos) -> {
            this.dropInventory(player, this.input);
        });
    }

    @Override
    public boolean canUse(PlayerEntity player) {
        return true;
    }
}
