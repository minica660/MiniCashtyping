package MiniCash.miniCashtypinggame;

import org.bukkit.plugin.java.JavaPlugin;

public final class MiniCashtypinggame extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("mtyp").setExecutor(new Main());
        getServer().getPluginManager().registerEvents(new Event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
