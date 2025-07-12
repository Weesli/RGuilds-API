package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.weesli.rguilds.api.model.Guild;
import org.bukkit.entity.Player;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuildChangeModEvent extends GuildEvent {
    private Player player;
    private UUID chanced_member;
    private boolean moderatorStatus;
    private Guild guild;
}
