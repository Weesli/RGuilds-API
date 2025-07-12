package net.weesli.rguilds.api.manager;

import net.weesli.rguilds.api.enums.MessageType;
import net.weesli.rguilds.api.enums.ModPermissions;
import net.weesli.rguilds.api.model.Guild;
import org.bukkit.entity.Player;

import java.util.UUID;

public interface GuildManager {
    void createGuild(Player player,String name);
    void deleteGuild(Guild guild);
    void inviteGuild(Player sender, String name);
    void kickGuild(Player sender, String name);
    void joinGuild(Player sender, String target);
    void leaveGuild(Player player);
    void leaveGuild(UUID uuid);
    void changeColor(Player sender, String color);
    void message(Player sender, String message);
    void renameGuild(Player sender, String name);
    void war(Player sender, String target, String name);
    void changeBanner(Player sender);
    void joinGuildByCode(Player player, String code);
    void toggleModPermission(Player sender, ModPermissions permission);
    int getMaxPlayer(Guild guild);
    void sendMessage(Player player, MessageType type, Object[] objects);
    void changePvPStatus(Player player, Guild guild, boolean pvp);
    void changeModStatus(Player player, Guild guild, UUID target);
}
