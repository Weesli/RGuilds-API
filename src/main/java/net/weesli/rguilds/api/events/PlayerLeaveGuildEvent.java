package net.weesli.rguilds.api.events;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.weesli.rguilds.api.enums.LeaveCause;
import net.weesli.rguilds.api.model.Guild;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class PlayerLeaveGuildEvent extends GuildEvent {
    private UUID player;
    private Guild guild;
    private LeaveCause cause;
}
