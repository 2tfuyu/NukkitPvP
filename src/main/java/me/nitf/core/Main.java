package me.nitf.core;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.Config;
import me.nitf.event.EventListener;

import java.io.File;
import java.util.LinkedHashMap;

public class Main extends PluginBase {

    private Config config;

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new EventListener(), this);
        this.getDataFolder().mkdirs();

        this.config = new Config(this.getDataFolder() + "Config.yml", Config.YAML);
    }

    public Config getConfig() {
        return this.config;
    }
}