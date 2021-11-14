package com.fanzy.world;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;

public class CustomEntityJoinWorldEvent extends EntityJoinWorldEvent {

    public CustomEntityJoinWorldEvent(Entity entity, Level world) {
        super(entity, world);
        // TODO Auto-generated constructor stub
    }

}
