package de.CodingAir.v1_6.CodingAPI.Serializable;

import de.CodingAir.v1_6.CodingAPI.Tools.ItemBuilder;
import org.bukkit.inventory.ItemStack;

import java.io.Serializable;

public class SerializableItemStack implements Serializable {
    String data;

    public SerializableItemStack() {
    }

    public SerializableItemStack(ItemStack item) {
        this.data = new ItemBuilder(item).toJSONString();
    }

    public String getData() {
        return data;
    }

    public ItemStack getItem() {
        return ItemBuilder.getFromJSON(this.data).getItem();
    }
}