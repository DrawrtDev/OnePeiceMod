package net.mcreator.onepeicemod.procedures;

import net.minecraft.entity.Entity;

import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.Map;

@OnePeiceModModElements.ModElement.Tag
public class ChopChopFruitFoodEatenProcedure extends OnePeiceModModElements.ModElement {
	public ChopChopFruitFoodEatenProcedure(OnePeiceModModElements instance) {
		super(instance, 4);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ChopChopFruitFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.getPersistentData().putBoolean("ChopChop", (true));
	}
}
