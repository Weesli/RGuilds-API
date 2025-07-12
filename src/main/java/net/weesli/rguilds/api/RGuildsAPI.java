package net.weesli.rguilds.api;

import net.weesli.rguilds.api.manager.CacheManager;
import net.weesli.rguilds.api.manager.GuildManager;

public class RGuildsAPI {

    private static GuildManager guildManager;
    private static CacheManager cacheManager;

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

    public static void setCacheManager(CacheManager cacheManager) {
        RGuildsAPI.cacheManager = cacheManager;
    }

    public static void setGuildManager(GuildManager guildManager) {
        RGuildsAPI.guildManager = guildManager;
    }
}

