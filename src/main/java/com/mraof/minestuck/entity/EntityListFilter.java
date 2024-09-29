package com.mraof.minestuck.entity;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

import java.util.List;
import java.util.function.Predicate;

public class EntityListFilter implements Predicate<Entity>
{
	public List<EntityType<?>> entityList;

	public boolean isEntityApplicable(Entity entity)
	{
	    for(EntityType<?> type : entityList) {
	    	if(entity.getType() == type) {
	    		return true;
		    }
	    }
		return false;
	}

	public EntityListFilter(List<EntityType<?>> entityList)
	{
		this.entityList = entityList;
	}
	
	@Override
	public boolean test(Entity entity)
	{
		return isEntityApplicable(entity);
	}
}