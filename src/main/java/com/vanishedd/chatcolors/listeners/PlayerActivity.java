package com.vanishedd.chatcolors.listeners;

import com.vanishedd.chatcolors.ChatColors;
import com.vanishedd.chatcolors.file.CustomFile;
import com.vanishedd.chatcolors.util.Lang;
import com.vanishedd.chatcolors.util.Util;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerActivity implements Listener {
    private ChatColors plugin = ChatColors.getInstance();
    private CustomFile dataFile = plugin.fileManager.getFile("data");

    @EventHandler
    public void onClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        if (e.getInventory() == null || e.getInventory().getName() == null) {
            return;
        }

        if (!e.getInventory().getName().contains(Util.colorize(plugin.getConfig().getString("GUI.Inventory-Name", "&6&lChat Colors")))) {
            return;
        }
        e.setCancelled(true);

        switch (e.getSlot()) {
            case 4: {
                if (!player.hasPermission("chatcolor.reset")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.reset"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", null);
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_RESET.toString());
                player.closeInventory();
                return;
            }
            case 49: {
                if (!player.hasPermission("chatcolor.reset")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.reset"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", null);
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_RESET.toString());
                player.closeInventory();
                return;
            }
            case 11:
                if (!player.hasPermission("chatcolor.darkred")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.darkred"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_RED");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "dark red"));
                player.closeInventory();
                return;
            case 12:
                if (!player.hasPermission("chatcolor.red")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.red"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "RED");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "red"));
                player.closeInventory();
                return;
            case 13:
                if (!player.hasPermission("chatcolor.gold")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.gold"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "GOLD");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "gold"));
                player.closeInventory();
                return;
            case 14:
                if (!player.hasPermission("chatcolor.yellow")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.yellow"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "YELLOW");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "yellow"));
                player.closeInventory();
                return;
            case 15:
                if (!player.hasPermission("chatcolor.green")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.green"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "GREEN");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "green"));
                player.closeInventory();
                return;
            case 20:
                if (!player.hasPermission("chatcolor.darkgreen")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.darkgreen"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_GREEN");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "dark green"));
                player.closeInventory();
                return;
            case 21:
                if (!player.hasPermission("chatcolor.aqua")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.aqua"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "AQUA");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "aqua"));
                player.closeInventory();
                return;
            case 22:
                if (!player.hasPermission("chatcolor.darkaqua")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.darkaqua"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_AQUA");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "dark aqua"));
                player.closeInventory();
                return;
            case 23:
                if (!player.hasPermission("chatcolor.blue")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.blue"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "BLUE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "blue"));
                player.closeInventory();
                return;
            case 24:
                if (!player.hasPermission("chatcolor.darkblue")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.darkblue"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_BLUE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "dark blue"));
                player.closeInventory();
                return;
            case 29:
                if (!player.hasPermission("chatcolor.pink")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.pink"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "LIGHT_PURPLE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "pink"));
                player.closeInventory();
                return;
            case 30:
                if (!player.hasPermission("chatcolor.purple")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.purple"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_PURPLE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "purple"));
                player.closeInventory();
                return;
            case 31:
                if (!player.hasPermission("chatcolor.white")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.white"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "WHITE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "white"));
                player.closeInventory();
                return;
            case 32:
                if (!player.hasPermission("chatcolor.lightgray")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.lightgray"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "GRAY");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "light gray"));
                player.closeInventory();
                return;
            case 33:
                if (!player.hasPermission("chatcolor.darkgray")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.darkgray"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Color", "DARK_GRAY");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.CHATCOLOR_SET.toString().replace("%color%", "red"));
                player.closeInventory();
                return;
            case 38:
                if (!player.hasPermission("chatcolor.underline")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.underline"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", "UNDERLINE");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_SET.toString().replace("%modifier%", "underline"));
                player.closeInventory();
                return;
            case 39:
                if (!player.hasPermission("chatcolor.italic")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.italic"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", "ITALIC");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_SET.toString().replace("%modifier%", "italic"));
                player.closeInventory();
                return;
            case 40:
                if (!player.hasPermission("chatcolor.bold")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.bold"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", "BOLD");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_SET.toString().replace("%modifier%", "bold"));
                player.closeInventory();
                return;
            case 41:
                if (!player.hasPermission("chatcolor.strikethrough")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.strikethrough"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", "STRIKETHROUGH");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_SET.toString().replace("%modifier%", "strikethrough"));
                player.closeInventory();
                return;
            case 42:
                if (!player.hasPermission("chatcolor.magic")) {
                    player.sendMessage(Lang.ERR_MISSING_PERM.toString().replace("%permission%", "chatcolor.magic"));
                    return;
                }

                dataFile.getCustomConfig().set("Users." + player.getUniqueId().toString() + ".Modifier", "MAGIC");
                dataFile.saveCustomConfig();
                player.sendMessage(Lang.MODIFIER_SET.toString().replace("%modifier%", "magic"));
                player.closeInventory();

        }
    }

    @EventHandler(priority = EventPriority.HIGHEST)
    public void onChat(AsyncPlayerChatEvent e) {
        Player player = e.getPlayer();

        if (e.isCancelled()) {
            return;
        }

        if (!dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString())) {
            return;
        }

        if (dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString() + ".Color") && dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString() + ".Modifier")) {
            String chatColor = dataFile.getCustomConfig().getString("Users." + player.getUniqueId().toString() + ".Color");
            String chatModifier = dataFile.getCustomConfig().getString("Users." + player.getUniqueId().toString() + ".Modifier");

            e.setMessage(ChatColor.valueOf(chatColor) + "" + ChatColor.valueOf(chatModifier) + e.getMessage());
            return;
        }

        if (dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString() + ".Color")) {
            String chatColor = dataFile.getCustomConfig().getString("Users." + player.getUniqueId().toString() + ".Color");

            e.setMessage(ChatColor.valueOf(chatColor) + e.getMessage());
        }

        if (dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString() + ".Modifier")) {
            String chatModifier = dataFile.getCustomConfig().getString("Users." + player.getUniqueId().toString() + ".Modifier");

            e.setMessage(ChatColor.valueOf(chatModifier) + e.getMessage());
        }
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        if (dataFile.getCustomConfig().contains("Users." + player.getUniqueId().toString())) {
            return;
        }

        dataFile.getCustomConfig().set("Users." + player.getUniqueId(), "");
        dataFile.saveCustomConfig();
    }
}
