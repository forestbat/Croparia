package com.croparia.mod.Item.Fruit;

import com.croparia.mod.Reference;
import com.croparia.mod.Item.ItemModFood;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class RawRabbit extends ItemModFood{

	public RawRabbit(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
	}
	
	protected void func_77849_c(ItemStack stack, World worldIn, EntityPlayer player)
    {
        if (!worldIn.field_72995_K)
        {           
        	player.func_70690_d(new PotionEffect(MobEffects.field_76431_k, Reference.normal, 1));
        	player.func_70690_d(new PotionEffect(MobEffects.field_76430_j, Reference.normal, 1));
        	player.func_70690_d(new PotionEffect(MobEffects.field_76443_y, Reference.trespeu, 4));
        }
    }
}