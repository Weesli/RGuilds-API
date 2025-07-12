package net.weesli.rguilds.api.model;

import net.weesli.rguilds.api.enums.ModPermissions;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface Guild {
    String getId();
    String getName();
    UUID getLeader();
    ArrayList<UUID> getMembers();
    ArrayList<UUID> getModerators();
    String getColor();
    boolean isPvp();
    int getKillCount();
    ArrayList<String> getEnemies();
    ItemStack getBanner();
    int getExp();
    String getLevel();
    String getCode();
    List<ModPermissions> getMod_permissions();

    // setters
    void setName(String name);
    void setLeader(UUID uuid);
    void setMembers(ArrayList<UUID> members);
    void setModerators(ArrayList<UUID> moderators);
    void setColor(String color);
    void setPvp(boolean pvp);
    void setKillCount(int killCount);
    void setEnemies(ArrayList<String> enemies);
    void setBanner(ItemStack banner);
    void setExp(int exp);
    void setLevel(String level);
    void setCode(String code);
    void setMod_permissions(List<ModPermissions> mod_permissions);

    boolean isOwner(UUID uuid);
    boolean isModerator(UUID uuid);
    boolean isMember(UUID uuid);
    boolean isEnemy(String name);

    void addMember(UUID uuid);
    void removeMember(UUID uuid);
    void addModerator(UUID uuid);
    void removeModerator(UUID uuid);
    void addEnemy(String name);
    void removeEnemy(String name);
    void addKillCount(int count);
    void addExp(int exp);
    boolean isFull();
    boolean hasPermission(ModPermissions permission);
    void removePermission(ModPermissions permission);
    void addPermission(ModPermissions permission);
    boolean checkPlayerModStatus(Player player, ModPermissions permissions);
}
