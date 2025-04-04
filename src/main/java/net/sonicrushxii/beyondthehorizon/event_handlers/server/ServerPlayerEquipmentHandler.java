package net.sonicrushxii.beyondthehorizon.event_handlers.server;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.event.entity.living.LivingEquipmentChangeEvent;

public class ServerPlayerEquipmentHandler {
    public static void onEquipmentChange(Player pPlayer, LivingEquipmentChangeEvent event)
    {
        //Extract Server Player
        if(!(pPlayer instanceof ServerPlayer player)) return;

        //Check Sonic Head
        if(event.getSlot() == EquipmentSlot.HEAD)
        {

            ItemStack headItem = player.getItemBySlot(EquipmentSlot.HEAD);

            try {
                if (headItem.getItem() == Items.PLAYER_HEAD) {
                    if(headItem.getTag() == null) throw new NullPointerException();
                    if (headItem.getTag().getByte("BeyondTheHorizon") == (byte) 2) {
                        System.out.println("Transform");
                    }
                }
            }catch(NullPointerException ignored){}
        }
    }
}
