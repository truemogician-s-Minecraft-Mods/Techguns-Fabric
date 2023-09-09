package devutil;

import net.fabricmc.loader.api.FabricLoader;

public class Debug {
	private static final boolean devMode = FabricLoader.getInstance().isDevelopmentEnvironment();
	
	public static void log(String message, Object... args) {
		if (!devMode)
			return;
		if (args != null && args.length > 0)
			System.out.printf(message, args);
		else
			System.out.println(message);
	}
}
