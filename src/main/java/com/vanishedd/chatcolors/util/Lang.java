package com.vanishedd.chatcolors.util;

import com.vanishedd.chatcolors.ChatColors;
import org.bukkit.configuration.file.FileConfiguration;

public enum Lang {
    ERR_MISSING_PERM("missing-permission", "You don't have permission to do this (&e%permission&7)!"),

    CHATCOLOR_RESET("chatcolor-reset", "Your chat color has been reset."),
    CHATCOLOR_SET("chatcolor-set", "Your chat color has been set."),

    MODIFIER_RESET("modifier-reset", "Your chat modifier has been reset."),
    MODIFIER_SET("modifier-set", "Your chat modifier has been set to %modifier%."),

    PREFIX("prefix", "&7&l(&6&lChat Colors&7&l) &7");

    private final String path;
    private final String def;
    private static FileConfiguration LANG;

    Lang(String path, String start) {
        this.path = path;
        this.def = start;
    }

    public static void setFile(FileConfiguration fileConfiguration) {
        LANG = fileConfiguration;
    }

    @Override
    public String toString() {
        ChatColors plugin = ChatColors.getInstance();

        StringBuilder stringBuilder = new StringBuilder();

        if (plugin.getConfig().getBoolean("Use-Prefix")) {
            stringBuilder.append(Lang.LANG.getString("prefix", PREFIX.def));
        }

        stringBuilder.append(LANG.getString(path, def));

        return Util.colorize(stringBuilder.toString());
    }

    public String toString(boolean addPrefix) {
        ChatColors plugin = ChatColors.getInstance();

        StringBuilder stringBuilder = new StringBuilder();

        if (addPrefix && plugin.getConfig().getBoolean("Use-Prefix")) {
            stringBuilder.append(Lang.LANG.getString("prefix", PREFIX.def));
        }

        stringBuilder.append(LANG.getString(path, def));

        return Util.colorize(stringBuilder.toString());
    }
}