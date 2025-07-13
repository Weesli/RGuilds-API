package net.weesli.rguilds.api.module;

import com.google.common.base.Charsets;
import net.weesli.rguilds.api.RGuildsAPI;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;

public abstract class ModuleConfiguration {

    private File file;
    private FileConfiguration configuration;

    private Module module;
    private String name;

    public ModuleConfiguration(Module module, String name) {
        this.module = module;
        this.name = name;
        setup();
    }

    public void setup() {
        file = new File(RGuildsAPI.getPlugin().getDataFolder(), "modules/" + module.getAddonName() + "/" + name + ".yml");
        if (!file.exists()) {
            InputStream inputStream = module.getClass().getClassLoader().getResourceAsStream(name+".yml");
            if (inputStream == null) {
                RGuildsAPI.getPlugin().getLogger().severe(name+ " not found in resources");
                return;
            }
            configuration = YamlConfiguration.loadConfiguration(new InputStreamReader(inputStream));
        } else {
            configuration = YamlConfiguration.loadConfiguration(file);
        }
    }


    public FileConfiguration getFile() {
        return configuration;
    }

    public void save() {
        try {
            configuration.save(file);
        } catch (Exception e) {
            RGuildsAPI.getPlugin().getLogger().severe("Failed to save "+name+".yml: " + e.getMessage());
        }
    }

    public void reloadFile() {
        configuration = YamlConfiguration.loadConfiguration(file);
        InputStream defConfigStream = module.getClass().getClassLoader().getResourceAsStream(name+".yml");
        if (defConfigStream != null) {
            configuration.setDefaults(YamlConfiguration.loadConfiguration(new InputStreamReader(defConfigStream, Charsets.UTF_8)));
        }
    }

}
