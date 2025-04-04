package net.sonicrushxii.beyondthehorizon.event_handlers;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.neoforge.event.TickEvent;
import net.sonicrushxii.beyondthehorizon.event_handlers.client.ClientPlayerTickHandler;
import net.sonicrushxii.beyondthehorizon.event_handlers.server.ServerPlayerTickHandler;

public class PlayerTickHandler {
    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event)
    {
        //Next
        if(event.player.level().isClientSide && FMLEnvironment.dist == Dist.CLIENT)
            ClientPlayerTickHandler.handleTick(event.player);
        else
            ServerPlayerTickHandler.handleTick(event.player);
    }
}
