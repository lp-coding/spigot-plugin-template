package de.lp_coding.template;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class TemplatePlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("TemplatePlugin enabled ✅");
        // Hier könntest du Listener registrieren etc.
        // getServer().getPluginManager().registerEvents(new YourListener(), this);
    }

    @Override
    public void onDisable() {
        getLogger().info("TemplatePlugin disabled 🛑");
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if ("hello".equalsIgnoreCase(command.getName())) {
            sender.sendMessage("§aHallo von deinem Template-Plugin! ✨");
            return true;
        }
        return false;
    }
}
