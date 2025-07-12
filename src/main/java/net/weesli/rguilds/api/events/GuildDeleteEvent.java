package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.weesli.rguilds.api.model.Guild;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class GuildDeleteEvent extends GuildEvent {
    private Guild guild;
}
