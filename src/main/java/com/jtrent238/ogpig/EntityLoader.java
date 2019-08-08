package com.jtrent238.ogpig;

import com.jtrent238.ogpig.entity.EntityOGPig;

import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class EntityLoader {


	public static void loadEntities() {

	    //OGPig Registry
	    EntityRegistry.registerGlobalEntityID(EntityOGPig.class, "EntityOGPig",EntityRegistry.findGlobalUniqueEntityId(), 0xff9999, 0xff6666);
	    EntityRegistry.addSpawn(EntityOGPig.class, 2, 1, 3, EnumCreatureType.creature, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.forest, BiomeGenBase.plains, BiomeGenBase.beach, BiomeGenBase.mesa, BiomeGenBase.savanna, BiomeGenBase.desert, BiomeGenBase.desertHills);
	    
	}

}