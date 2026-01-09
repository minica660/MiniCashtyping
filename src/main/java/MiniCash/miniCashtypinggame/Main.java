package MiniCash.miniCashtypinggame;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import static MiniCash.miniCashtypinggame.MPublic.stt;

public class Main implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] args) {

        Player player = (Player) commandSender;
            if (args.length <= 1) {
                player.sendMessage("§c§l引数が足りません");
                return true;
            }

            if (args[0].equalsIgnoreCase("start") && args.length == 2) {

                try{
                    String ch =  args[1];
                    stt(player,ch);
                }catch(ArrayIndexOutOfBoundsException e){
                    player.sendMessage("§c入力方法を確認してください");
                }


            }

        return true;
    }
}




