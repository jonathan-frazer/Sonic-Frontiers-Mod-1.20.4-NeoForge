package net.sonicrushxii.beyondthehorizon.attachments;

import net.minecraft.nbt.CompoundTag;
import net.neoforged.neoforge.common.util.INBTSerializable;

public class PlayerSonicData implements INBTSerializable<CompoundTag>
{
    public boolean isSonic;

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        nbt.putBoolean("isSonic", isSonic);

        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        isSonic = nbt.getBoolean("isSonic");
    }
}