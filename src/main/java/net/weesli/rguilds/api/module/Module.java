package net.weesli.rguilds.api.module;

import net.weesli.rguilds.api.RGuildsAPI;
import org.bukkit.plugin.Plugin;

public interface Module{
    void enable();
    void disable();

    String getAddonName();
    String getVersion();

    ModulePlaceholder modulePlaceholder();
}
