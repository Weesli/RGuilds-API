package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.bukkit.entity.Player;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuildInviteEvent extends GuildEvent {
    private Player sender;
    private String targetPlayer;
}
