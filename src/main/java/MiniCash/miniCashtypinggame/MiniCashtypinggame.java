package MiniCash.miniCashtypinggame;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.*;

public final class MiniCashtypinggame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("mtyp").setExecutor(new Main(this));
        getServer().getPluginManager().registerEvents(new Event(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    private final MiniCashtypinggame plugin;

    public MiniCashtypinggame(MiniCashtypinggame plugin){
        this.plugin = plugin;
    }
    public static boolean game = false;
    public static List<String> list = new ArrayList<>();
    public static Map<UUID,Boolean> chatcheck = new HashMap<>();
    public void stt(Player player, String chat){


        if (!game) {
            game = true;

            list.add(chat);

            player.sendMessage("§e正解：§a" + chat + "§rに設定しました");

            Bukkit.broadcastMessage("§eタイピング速度を競おう！！\n§a§l入力メッセージ" + chat);



            Bukkit.getScheduler().runTaskLater(plugin, () -> {
                String name = null;
                game = false;
                for (int i = 0; i < 5; i++) {
                    Bukkit.broadcastMessage("§c終了！！");
                }

                for(Player p : Bukkit.getOnlinePlayers()) {
                    if (chatcheck.containsKey(p.getPlayer().getUniqueId())){
                        name = name + p.getName() + " ";
                    }
                }

                Bukkit.broadcastMessage("§5正解者：§7" + name);
            }, 20 * 10);

        }

    }


}
