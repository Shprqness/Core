package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class FLY implements CommandExecutor{
	
	public static String FLY = "FLY";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.fly")) {
				if(cmd.getName().equalsIgnoreCase(FLY)) {
					Player p = (Player) sender;
					if(p.isFlying()) {
						p.setAllowFlight(false);
						p.setFlying(false);
						p.sendMessage(ChatColor.YELLOW + "Flying Disabled.");
					}else {
						p.setAllowFlight(true);
						p.setFlying(true);
						
						p.sendMessage(ChatColor.YELLOW + "Fly Enabled");
					}
				}
			}
		}
		return true;
	}
	
	
	
}
