package net.mcreator.onepeicemod.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.Map;
import java.util.HashMap;

@OnePeiceModModElements.ModElement.Tag
public class ChopChopImmuneProcedure extends OnePeiceModModElements.ModElement {
	public ChopChopImmuneProcedure(OnePeiceModModElements instance) {
		super(instance, 2);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure ChopChopImmune!");
			return;
		}
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				System.err.println("Failed to load dependency sourceentity for procedure ChopChopImmune!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		if (((entity.getPersistentData().getBoolean("ChopChop")) == (true))) {
			if (((((((((((((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.WOODEN_SWORD, (int) (1)).getItem()) == (true))
					|| ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.STONE_SWORD, (int) (1)).getItem()) == (true)))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.IRON_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.GOLDEN_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.WOODEN_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.STONE_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.IRON_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.GOLDEN_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemMainhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_PICKAXE, (int) (1)).getItem()))) {
				if (dependencies.get("event") != null) {
					Object _obj = dependencies.get("event");
					if (_obj instanceof Event) {
						Event _evt = (Event) _obj;
						if (_evt.isCancelable())
							_evt.setCanceled(true);
					}
				}
			}
		}
		if (((entity.getPersistentData().getBoolean("ChopChop")) == (true))) {
			if (((((((((((((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
					.getItem() == new ItemStack(Items.WOODEN_SWORD, (int) (1)).getItem()) == (true))
					|| ((((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.STONE_SWORD, (int) (1)).getItem()) == (true)))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.IRON_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.GOLDEN_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_SWORD, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.WOODEN_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.STONE_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.IRON_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.GOLDEN_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_AXE, (int) (1)).getItem()))
					|| (((sourceentity instanceof LivingEntity) ? ((LivingEntity) sourceentity).getHeldItemOffhand() : ItemStack.EMPTY)
							.getItem() == new ItemStack(Items.DIAMOND_PICKAXE, (int) (1)).getItem()))) {
				if (dependencies.get("event") != null) {
					Object _obj = dependencies.get("event");
					if (_obj instanceof Event) {
						Event _evt = (Event) _obj;
						if (_evt.isCancelable())
							_evt.setCanceled(true);
					}
				}
			}
		}
	}

	@SubscribeEvent
	public void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			Entity entity = event.getEntity();
			Entity sourceentity = event.getSource().getTrueSource();
			Entity imediatesourceentity = event.getSource().getImmediateSource();
			double i = entity.getPosX();
			double j = entity.getPosY();
			double k = entity.getPosZ();
			double amount = event.getAmount();
			World world = entity.world;
			Map<String, Object> dependencies = new HashMap<>();
			dependencies.put("x", i);
			dependencies.put("y", j);
			dependencies.put("z", k);
			dependencies.put("amount", amount);
			dependencies.put("world", world);
			dependencies.put("entity", entity);
			dependencies.put("sourceentity", sourceentity);
			dependencies.put("imediatesourceentity", imediatesourceentity);
			dependencies.put("event", event);
			this.executeProcedure(dependencies);
		}
	}
}
