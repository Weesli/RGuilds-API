package net.weesli.rguilds.api.events;

import net.weesli.rguilds.api.model.Guild;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class GuildEvent extends Event implements Cancellable {

    private static final HandlerList handlerList = new HandlerList();

    private boolean canceled = false;

    public GuildEvent(boolean async) {
        super(async);
    }

    public GuildEvent() {
        super(false);
    }

    @Override
    public boolean isCancelled() {
        return canceled;
    }

    @Override
    public void setCancelled(boolean b) {
        canceled = b;
    }

    @NotNull
    @Override
    public HandlerList getHandlers() {
        return handlerList;
    }

    public static HandlerList getHandlerList() {
        return handlerList;
    }

}
