package net.weesli.rguilds.api.model;

import java.util.UUID;

public interface User {
    String getUsername();
    UUID getUuid();
    String getGuild();
    // setters
    void setUsername(String username);
    void setUuid(UUID uuid);
    void setGuild(String guild);
}
