package com.vanishedd.chatcolors;

import com.vanishedd.chatcolors.commands.CmdChatColor;
import com.vanishedd.chatcolors.file.CustomFile;
import com.vanishedd.chatcolors.file.FileManager;
import com.vanishedd.chatcolors.listeners.PlayerActivity;
import com.vanishedd.chatcolors.util.Lang;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatColors extends JavaPlugin {
    private static ChatColors instance;
    public FileManager fileManager = new FileManager();

    @Override
    public void onEnable() {
        instance = this;

        registerConfig();
        registerCommands();
        registerListeners();
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    public static ChatColors getInstance() {
        return instance;
    }

    private void registerConfig() {
        CustomFile langFile = new CustomFile("lang");
        CustomFile dataFile = new CustomFile("data");

        saveDefaultConfig();
        langFile.saveDefaultConfig();
        dataFile.saveDefaultConfig();

        Lang.setFile(langFile.getCustomConfig());

        fileManager.registerFile(langFile);
        fileManager.registerFile(dataFile);
    }

    private void registerCommands() {
        getCommand("chatcolor").setExecutor(new CmdChatColor());
    }

    private void registerListeners() {
        Bukkit.getPluginManager().registerEvents(new PlayerActivity(), this);
    }
}