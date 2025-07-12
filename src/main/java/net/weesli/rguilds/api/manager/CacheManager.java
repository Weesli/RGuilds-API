package net.weesli.rguilds.api.manager;

import net.weesli.rguilds.api.model.Guild;
import net.weesli.rguilds.api.model.User;

import java.util.UUID;

public interface CacheManager {
    void registerGuild(Guild guild);
    Guild getGuild(String id);
    void deleteGuild(String id);
    void registerUser(User user);
    void deleteUser(UUID uuid);
    String getUserGuildId(UUID uuid);
    Guild getUserGuild(UUID uuid);
    User getUser(UUID uuid);
    boolean isValidUser(UUID uuid);
    boolean isValidGuild(String id);
}
