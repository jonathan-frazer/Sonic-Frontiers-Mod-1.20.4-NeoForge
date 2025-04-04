package net.sonicrushxii.beyondthehorizon.baseform.data;

import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.StringTag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

public class BaseformNBTData
{
    public static CompoundTag baseformArmorNBTTag; static {
        baseformArmorNBTTag = new CompoundTag();
        ListTag enchantmentList = new ListTag();
        CompoundTag enchantment = new CompoundTag();
        enchantment.putString("id", "minecraft:binding_curse");
        enchantment.putShort("lvl", (short) 1);
        enchantmentList.add(enchantment);
        baseformArmorNBTTag.put("Enchantments", enchantmentList);
        baseformArmorNBTTag.putInt("HideFlags", 127);
        baseformArmorNBTTag.putByte("Unbreakable", (byte) 1);
        baseformArmorNBTTag.putByte("BeyondTheHorizon", (byte) 1);
    }

    public static ItemStack baseformSonicHead; static {
        baseformSonicHead = new ItemStack(Items.PLAYER_HEAD);
        CompoundTag nbt = new CompoundTag();

        // Custom NBT data
        nbt.putByte("BeyondTheHorizon", (byte) 2);

        // SkullOwner tag
        CompoundTag skullOwner = new CompoundTag();
        CompoundTag properties = new CompoundTag();
        ListTag textures = new ListTag();
        CompoundTag texture = new CompoundTag();
        texture.putString("Value", "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTBjN2NlZWNjODliNTY0MjNhOWU4YWFiMTE3NjRkZTI5MDIyNjU4MzA5YTUyNjY2M2JmMzQyNGY0N2NhZDlmOCJ9fX0=");
        textures.add(texture);
        properties.put("textures", textures);
        skullOwner.put("Properties", properties);
        skullOwner.putIntArray("Id", new int[]{512370214, -95272899, -2003262887, 1067375885});
        nbt.put("SkullOwner", skullOwner);

        // Display tag
        CompoundTag display = new CompoundTag();
        ListTag lore = new ListTag();
        lore.add(StringTag.valueOf("{\"text\":\"Adapted from Sonic Frontiers\",\"color\": \"light_purple\"}"));
        display.put("Lore", lore);
        display.putString("Name", "{\"text\":\"Sonic Head\",\"color\": \"blue\",\"italic\": false}");
        nbt.put("display", display);

        baseformSonicHead.setTag(nbt);
    }

    public static ItemStack baseformLSSonicHead; static {
        baseformLSSonicHead = new ItemStack(Items.PLAYER_HEAD);
        CompoundTag nbt = new CompoundTag();

        // Custom NBT data
        nbt.putByte("BeyondTheHorizon", (byte) 2);

        // SkullOwner tag
        CompoundTag skullOwner = new CompoundTag();
        CompoundTag properties = new CompoundTag();
        ListTag textures = new ListTag();
        CompoundTag texture = new CompoundTag();
        texture.putString("Value", "ewogICJ0aW1lc3RhbXAiIDogMTcyNjkyNzYxNjIxNSwKICAicHJvZmlsZUlkIiA6ICI2OTBmOTAwMTczZmQ0MDA5OGE2ZDc3Nzc2MWUwY2U4YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTb25pY1J1c2hYMTIiLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvY2QyNzZmMGExMTBkMGEzNzhiNzdlNzk3OTBiZDc0ZjNiOWEzMmNhNzgyYWQ2MTQ2NjhhYWE1ZmM4MDg5MWIwMCIKICAgIH0KICB9Cn0=");
        textures.add(texture);
        properties.put("textures", textures);
        skullOwner.put("Properties", properties);
        skullOwner.putIntArray("Id", new int[]{1762627585, 1945976841, -1972537481, 1642122891});
        nbt.put("SkullOwner", skullOwner);

        // Display tag
        CompoundTag display = new CompoundTag();
        ListTag lore = new ListTag();
        lore.add(StringTag.valueOf("{\"text\":\"Light Speed Mode\",\"color\": \"aqua\"}"));
        display.put("Lore", lore);
        display.putString("Name", "{\"text\":\"Sonic Head\",\"color\": \"blue\",\"italic\": false}");
        nbt.put("display", display);

        baseformLSSonicHead.setTag(nbt);
    }

    public static ItemStack baseformPBSonicHead; static {
        baseformPBSonicHead = new ItemStack(Items.PLAYER_HEAD);
        CompoundTag nbt = new CompoundTag();

        // Custom NBT data
        nbt.putByte("BeyondTheHorizon", (byte) 2);

        // SkullOwner tag
        CompoundTag skullOwner = new CompoundTag();
        CompoundTag properties = new CompoundTag();
        ListTag textures = new ListTag();
        CompoundTag texture = new CompoundTag();
        texture.putString("Value", "ewogICJ0aW1lc3RhbXAiIDogMTcyNzg5MTc2MDg1NywKICAicHJvZmlsZUlkIiA6ICI2OTBmOTAwMTczZmQ0MDA5OGE2ZDc3Nzc2MWUwY2U4YiIsCiAgInByb2ZpbGVOYW1lIiA6ICJTb25pY1J1c2hYMTIiLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjdlMDM2OWQxYzQ3ZWYwZmFjMmVjNGE2MmI5NzgxZDZjOGE0NTRlOGNiYjBkOTg5ODgxMWVkNjlhZjhhOWJiZCIKICAgIH0KICB9Cn0=");
        textures.add(texture);
        properties.put("textures", textures);
        skullOwner.put("Properties", properties);
        skullOwner.putIntArray("Id", new int[]{1762627585, 1945976841, -1972537481, 1642122891});
        nbt.put("SkullOwner", skullOwner);

        // Display tag
        CompoundTag display = new CompoundTag();
        ListTag lore = new ListTag();
        lore.add(StringTag.valueOf("{\"text\":\"Power Boost\",\"color\": \"dark_blue\"}"));
        display.put("Lore", lore);
        display.putString("Name", "{\"text\":\"Sonic Head\",\"color\": \"blue\",\"italic\": false}");
        nbt.put("display", display);

        baseformPBSonicHead.setTag(nbt);
    }
}
