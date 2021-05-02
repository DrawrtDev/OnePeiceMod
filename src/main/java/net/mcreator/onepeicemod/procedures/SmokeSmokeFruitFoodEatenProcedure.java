package net.mcreator.onepeicemod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.Map;

@OnePeiceModModElements.ModElement.Tag
public class SmokeSmokeFruitFoodEatenProcedure extends OnePeiceModModElements.ModElement {
	public SmokeSmokeFruitFoodEatenProcedure(OnePeiceModModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure SmokeSmokeFruitFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("SmokeSmoke", (true));
	}
}
