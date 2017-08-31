package com.vanishedd.chatcolors.util;

import org.apache.commons.lang.ArrayUtils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.util.io.BukkitObjectInputStream;
import org.bukkit.util.io.BukkitObjectOutputStream;
import org.yaml.snakeyaml.external.biz.base64Coder.Base64Coder;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class ItemUtil {

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @return the generated item
     */
    private static ItemStack createItem(Material material) {
        return new ItemStack(material);
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param amount the amount of items in the stack
     * @return the generated item
     */
    public static ItemStack createItem(Material material, int amount) {
        return new ItemStack(material, amount);
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param amount the amount of items in the stack
     * @param dataValue the data value of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, int amount, int dataValue) {
        return new ItemStack(material, amount, (short) dataValue);
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param itemName the display name of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, String itemName) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemName));
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param itemName the display name of the item
     * @param itemLore the lore of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, String itemName, List<String> itemLore) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();

        List<String> newLore = new ArrayList<>();
        for (String str : itemLore) {
            newLore.add(ChatColor.translateAlternateColorCodes('&', str));
        }

        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemName));
        itemMeta.setLore(newLore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param amount the amount of items in the stack
     * @param itemName the display name of the item
     * @param itemLore the lore of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, int amount, String itemName, List<String> itemLore) {
        ItemStack itemStack = new ItemStack(material, amount);
        ItemMeta itemMeta = itemStack.getItemMeta();

        List<String> newLore = new ArrayList<>();
        for (String str : itemLore) {
            newLore.add(ChatColor.translateAlternateColorCodes('&', str));
        }

        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemName));
        itemMeta.setLore(newLore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param amount the amount of items in the stack
     * @param dataValue the data value of the item
     * @param itemName the display name of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, int amount, int dataValue, String itemName) {
        ItemStack itemStack = new ItemStack(material, amount, (short) dataValue);
        ItemMeta itemMeta = itemStack.getItemMeta();
        itemMeta.setDisplayName(Util.colorize(itemName));

        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }

    /**
     * Returns an itemstack using the info you provided
     *
     * @param material the material to create the item with
     * @param amount the amount of items in the stack
     * @param dataValue the data value of the item
     * @param itemName the display name of the item
     * @param itemLore the lore of the item
     * @return the generated item
     */
    public static ItemStack createItem(Material material, int amount, int dataValue, String itemName, List<String> itemLore) {
        ItemStack itemStack = new ItemStack(material, amount, (short) dataValue);
        ItemMeta itemMeta = itemStack.getItemMeta();

        List<String> newLore = new ArrayList<>();
        for (String str : itemLore) {
            newLore.add(ChatColor.translateAlternateColorCodes('&', str));
        }

        itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', itemName));
        itemMeta.setLore(newLore);
        itemStack.setItemMeta(itemMeta);

        return itemStack;
    }
}
