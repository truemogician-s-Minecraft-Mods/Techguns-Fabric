package techguns.plugins.rei;

import com.google.common.collect.Lists;
import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import techguns.TGBlocks;

import java.util.List;

public class AmmoBenchCategory implements DisplayCategory<AmmoBenchDisplay> {
    public AmmoBenchCategory() {
    }

    public CategoryIdentifier<? extends AmmoBenchDisplay> getCategoryIdentifier() {
        return TGREIPlugin.AMMO_BENCH;
    }

    public Renderer getIcon() {
        return EntryStacks.of(TGBlocks.AMMO_BENCH);
    }

    public Text getTitle() {
        return Text.translatable("block.techguns.ammo_bench");
    }

    @Override
    public List<Widget> setupDisplay(AmmoBenchDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 41, bounds.getCenterY() - 13);
        List<Widget> widgets = Lists.newArrayList();
        widgets.add(Widgets.createRecipeBase(bounds));
        widgets.add(Widgets.createArrow(new Point(startPoint.x + 27, startPoint.y + 4)));
        widgets.add(Widgets.createResultSlotBackground(new Point(startPoint.x + 61, startPoint.y + 5)));
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 61, startPoint.y + 5)).entries(display.getOutputEntries().get(0)).disableBackground().markOutput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 4, startPoint.y + 5-20)).entries(display.getInputEntries().get(0)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 4, startPoint.y + 5)).entries(display.getInputEntries().get(1)).markInput());
        widgets.add(Widgets.createSlot(new Point(startPoint.x + 4, startPoint.y + 5+20)).entries(display.getInputEntries().get(2)).markInput());
        return widgets;
    }

    public int getDisplayHeight() {
        return 36+40;
    }
}
