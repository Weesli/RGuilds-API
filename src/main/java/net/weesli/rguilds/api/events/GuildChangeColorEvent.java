package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.weesli.rguilds.api.model.Guild;
import org.bukkit.entity.Player;
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuildChangeColorEvent extends GuildEvent {
    private Player player;
    private Guild guild;
    private String oldColor;
    private String newColor;
}
