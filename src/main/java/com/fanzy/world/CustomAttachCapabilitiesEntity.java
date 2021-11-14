package com.fanzy.world;

import net.minecraft.world.entity.Entity;
import net.minecraftforge.event.AttachCapabilitiesEvent;

public class CustomAttachCapabilitiesEntity extends AttachCapabilitiesEvent<Entity> {

    public CustomAttachCapabilitiesEntity(Class<Entity> type, Entity obj) {
        super(type, obj);
        // TODO Auto-generated constructor stub
    }

}
