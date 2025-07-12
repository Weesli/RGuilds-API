package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.weesli.rguilds.api.model.Guild;
import org.bukkit.entity.Player;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuildCreateEvent extends GuildEvent {
    private Player player;
    private Guild guild;
    private String ID;
}
