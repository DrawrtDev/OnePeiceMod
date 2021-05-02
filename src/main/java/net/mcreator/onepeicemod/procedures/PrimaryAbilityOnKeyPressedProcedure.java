package net.mcreator.onepeicemod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.onepeicemod.OnePeiceModModVariables;
import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.Map;

@OnePeiceModModElements.ModElement.Tag
public class PrimaryAbilityOnKeyPressedProcedure extends OnePeiceModModElements.ModElement {
	public PrimaryAbilityOnKeyPressedProcedure(OnePeiceModModElements instance) {
		super(instance, 6);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure PrimaryAbilityOnKeyPressed!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				System.err.println("Failed to load dependency world for procedure PrimaryAbilityOnKeyPressed!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		IWorld world = (IWorld) dependencies.get("world");
		if (((entity.getPersistentData().getBoolean("SmokeSmoke")) == (true))) {
			OnePeiceModModVariables.WorldVariables.get(world).SmokeSmokeActive = (boolean) (true);
			OnePeiceModModVariables.WorldVariables.get(world).syncData(world);
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.INVISIBILITY, (int) 99999999, (int) 1, (false), (false)));
			if (entity instanceof LivingEntity)
				((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 99999999, (int) 100, (false), (false)));
		}
	}
}
