package net.sonicrushxii.beyondthehorizon.baseform.events;

import net.minecraft.server.level.ServerPlayer;
import net.sonicrushxii.beyondthehorizon.attachments.PlayerSonicData;
import net.sonicrushxii.beyondthehorizon.modded.ModAttachments;

public class BaseformActivate
{
    public static void onBaseformActivate(ServerPlayer player)
    {
        //Extract Players Sonic Data
        PlayerSonicData playerSonicData = player.getData(ModAttachments.SONIC_DATA);

        playerSonicData.isSonic = true;
    }
}
