package MiniCash.miniCashtypinggame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;


public class Main implements CommandExecutor {
    private final MiniCashtypinggame plugin;

    public Main(MiniCashtypinggame plugin){
        this.plugin = plugin;
    }
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {

        Player player = (Player) commandSender;
            if (args.length <= 1) {
                player.sendMessage("§c§l引数が足りません");
                return true;
            }

            if (args[0].equalsIgnoreCase("start") && args.length == 3) {

                try{
                    int ti = Integer.parseInt(args[1]);
                    String ch =  args[2];
                    plugin.stt(player,ti,ch);
                }catch(ArrayIndexOutOfBoundsException e){
                    player.sendMessage("§c入力方法を確認してください");
                }


            }

        return true;
    }
}





