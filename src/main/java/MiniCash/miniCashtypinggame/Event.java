package MiniCash.miniCashtypinggame;

import io.papermc.paper.event.player.AsyncChatEvent;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

import java.util.UUID;

import static MiniCash.miniCashtypinggame.MiniCashtypinggame.*;


public class Event implements Listener {

    @EventHandler
    public void Chat(AsyncChatEvent event) {

        if (game){
            event.setCancelled(true);
            if (chatcheck.containsKey(event.getPlayer().getUniqueId())){
               event.getPlayer().sendMessage("§cすでに正解しています\nオープンチャットはしばらくお待ちください");
            } else{
                String message = PlainTextComponentSerializer.plainText().serialize(event.message());
                if (list.contains(message)){
                    UUID id = event.getPlayer().getUniqueId();
                    chatcheck.put(id,true);
                    event.getPlayer().sendMessage("§b§l正解！！");
                }
            }


        }

    }

}





