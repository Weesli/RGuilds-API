package net.weesli.rguilds.api.events;

import lombok.*;
import net.weesli.rguilds.api.model.Guild;
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuildLevelUpEvent extends GuildEvent{
    private Guild guild;
    private String oldLevel;
    private String newLevel;
}
