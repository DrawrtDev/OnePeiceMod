
package net.mcreator.onepeicemod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.onepeicemod.procedures.SmokeSmokeFruitFoodEatenProcedure;
import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.Map;
import java.util.List;
import java.util.HashMap;

@OnePeiceModModElements.ModElement.Tag
public class SmokeSmokeFruitItem extends OnePeiceModModElements.ModElement {
	@ObjectHolder("one_peice_mod:smoke_smoke_fruit")
	public static final Item block = null;
	public SmokeSmokeFruitItem(OnePeiceModModElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(-1).saturation(0.3f).build()));
			setRegistryName("smoke_smoke_fruit");
		}

		@Override
		public int getUseDuration(ItemStack stack) {
			return 64;
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Devil Fruit"));
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				SmokeSmokeFruitFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
