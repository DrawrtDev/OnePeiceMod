
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
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.onepeicemod.OnePeiceModModElements;

import java.util.List;

@OnePeiceModModElements.ModElement.Tag
public class GumGumFruitItem extends OnePeiceModModElements.ModElement {
	@ObjectHolder("one_peice_mod:gum_gum_fruit")
	public static final Item block = null;
	public GumGumFruitItem(OnePeiceModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ItemGroup.FOOD).maxStackSize(1).rarity(Rarity.EPIC)
					.food((new Food.Builder()).hunger(-1).saturation(0.3f).build()));
			setRegistryName("gum_gum_fruit");
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
	}
}
