package com.vanishedd.chatcolors.commands;

import com.vanishedd.chatcolors.ChatColors;
import com.vanishedd.chatcolors.util.ItemUtil;
import com.vanishedd.chatcolors.util.Lang;
import com.vanishedd.chatcolors.util.Util;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CmdChatColor implements CommandExecutor {
    private ChatColors plugin = ChatColors.getInstance();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!cmd.getName().equalsIgnoreCase("chatcolor")) {
            return false;
        }

        if (!(sender instanceof Player)) {
            sender.sendMessage("Sorry console, you have to be a player to use this command!");
            return false;
        }

        Player player = (Player) sender;

        if (!player.hasPermission("chatcolor.use")) {
            player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.use"));
            return false;
        }

        player.openInventory(getColorMenu());
        return true;
    }

    private Inventory getColorMenu() {
        Inventory colorMenu = Bukkit.createInventory(null, 54, Util.colorize(plugin.getConfig().getString("GUI.Inventory-Name", "&6&lChat Colors")));
        String colorName = plugin.getConfig().getString("GUI.Color.Name", "%code%&l%color%");
        String modifierName = plugin.getConfig().getString("GUI.Modifier.Name", "%code%%modifier%");

        for (int i = 0; i < 54; i++) {
            colorMenu.setItem(i, ItemUtil.createItem(Material.STAINED_GLASS_PANE, 1, 7));
        }

        colorMenu.setItem(4, ItemUtil.createItem(Material.NETHER_STAR, 1, "&c&lReset Color", plugin.getConfig().getStringList("GUI.Color-Reset.Lore")));
        colorMenu.setItem(49, ItemUtil.createItem(Material.NETHER_STAR, 1, "&c&lReset Modifier", plugin.getConfig().getStringList("GUI.Modifier-Reset.Lore")));
        colorMenu.setItem(11, ItemUtil.createItem(Material.NETHER_STALK, 1, Util.colorize(colorName.replace("%code%", "&4").replace("%color%", "Dark Red")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(12, ItemUtil.createItem(Material.INK_SACK, 1, 1, Util.colorize(colorName.replace("%code%", "&c").replace("%color%", "Red")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(13, ItemUtil.createItem(Material.INK_SACK, 1, 14, Util.colorize(colorName.replace("%code%", "&6").replace("%color%", "Orange")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(14, ItemUtil.createItem(Material.INK_SACK, 1, 11, Util.colorize(colorName.replace("%code%", "&e").replace("%color%", "Yellow")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(15, ItemUtil.createItem(Material.INK_SACK, 1, 10, Util.colorize(colorName.replace("%code%", "&a").replace("%color%", "Green")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(20, ItemUtil.createItem(Material.INK_SACK, 1, 2, Util.colorize(colorName.replace("%code%", "&2").replace("%color%", "Dark Green")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(21, ItemUtil.createItem(Material.INK_SACK, 1, 12, Util.colorize(colorName.replace("%code%", "&b").replace("%color%", "Aqua")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(22, ItemUtil.createItem(Material.INK_SACK, 1, 6, Util.colorize(colorName.replace("%code%", "&3").replace("%color%", "Dark Aqua")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(23, ItemUtil.createItem(Material.INK_SACK, 1, 4, Util.colorize(colorName.replace("%code%", "&9").replace("%color%", "Blue")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(24, ItemUtil.createItem(Material.DIAMOND, 1, Util.colorize(colorName.replace("%code%", "&1").replace("%color%", "Dark Blue")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(29, ItemUtil.createItem(Material.INK_SACK, 1, 9, Util.colorize(colorName.replace("%code%", "&d").replace("%color%", "Pink")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(30, ItemUtil.createItem(Material.INK_SACK, 1, 5, Util.colorize(colorName.replace("%code%", "&5").replace("%color%", "Dark Purple")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(31, ItemUtil.createItem(Material.INK_SACK, 1, 15, Util.colorize(colorName.replace("%code%", "&f").replace("%color%", "White")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(32, ItemUtil.createItem(Material.INK_SACK, 1, 7, Util.colorize(colorName.replace("%code%", "&7").replace("%color%", "Light Gray")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(33, ItemUtil.createItem(Material.INK_SACK, 1, 8, Util.colorize(colorName.replace("%code%", "&8").replace("%color%", "Gray")), plugin.getConfig().getStringList("GUI.Color.Lore")));
        colorMenu.setItem(38, ItemUtil.createItem(Material.SULPHUR, 1, Util.colorize("&r" + modifierName.replace("%code%", "&n").replace("%modifier%", "Underline")), plugin.getConfig().getStringList("GUI.Modifier.Lore")));
        colorMenu.setItem(39, ItemUtil.createItem(Material.REDSTONE, 1, Util.colorize("&r" + modifierName.replace("%code%", "&o").replace("%modifier%", "Italic")), plugin.getConfig().getStringList("GUI.Modifier.Lore")));
        colorMenu.setItem(40, ItemUtil.createItem(Material.GLOWSTONE_DUST, 1, Util.colorize("&r" + modifierName.replace("%code%", "&l").replace("%modifier%", "Bold")), plugin.getConfig().getStringList("GUI.Modifier.Lore")));
        colorMenu.setItem(41, ItemUtil.createItem(Material.FIREWORK_CHARGE, 1, Util.colorize("&r" + modifierName.replace("%code%", "&m").replace("%modifier%", "Strikethrough")), plugin.getConfig().getStringList("GUI.Modifier.Lore")));
        colorMenu.setItem(42, ItemUtil.createItem(Material.FIREBALL, 1, Util.colorize("&r" + modifierName.replace("%code%", "&k").replace("%modifier%", "Magic")), plugin.getConfig().getStringList("GUI.Modifier.Lore")));
        return colorMenu;
    }
}
