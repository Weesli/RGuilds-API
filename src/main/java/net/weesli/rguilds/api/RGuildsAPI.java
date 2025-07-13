package net.weesli.rguilds.api;

import net.weesli.rguilds.api.manager.CacheManager;
import net.weesli.rguilds.api.manager.GuildManager;
import org.bukkit.plugin.Plugin;

public class RGuildsAPI {

    private static GuildManager guildManager;
    private static CacheManager cacheManager;
    private static Plugin plugin;

    private RGuildsAPI() {

    }

    public static GuildManager getGuildManager() throws IllegalAccessException {
        if (guildManager == null) {
            throw new IllegalAccessException("The RGuilds API is not initialized!");
        }
        return guildManager;
    }

    public static CacheManager getCacheManager() throws IllegalAccessException {
        if (cacheManager == null) {
            throw new IllegalAccessException("The RGuilds API is not initialized!");
        }
        return cacheManager;
    }

    public static Plugin getPlugin() {
        return plugin;
    }

    public static void setPlugin(Plugin plugin) {
        RGuildsAPI.plugin = plugin;
    }

    public static void setCacheManager(CacheManager cacheManager) {
        RGuildsAPI.cacheManager = cacheManager;
    }

    public static void setGuildManager(GuildManager guildManager) {
        RGuildsAPI.guildManager = guildManager;
    }
}

