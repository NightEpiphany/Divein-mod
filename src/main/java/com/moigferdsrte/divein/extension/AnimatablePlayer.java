package com.moigferdsrte.divein.extension;

import com.moigferdsrte.divein.event.DiveinEvent;
import net.minecraft.world.phys.Vec3;

public interface AnimatablePlayer {
    @DiveinEvent.SyncForServer
    void divein$playDiveAnimation(String animationName, Vec3 direction);
}
