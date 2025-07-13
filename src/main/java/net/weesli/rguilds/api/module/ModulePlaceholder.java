package net.weesli.rguilds.api.module;

import org.bukkit.entity.Player;

import java.util.Map;

public abstract class ModulePlaceholder {

    public abstract void register(Player player, String param, String value);

    public abstract Map<String, String> getRegisteredHolders(Player player);
}
