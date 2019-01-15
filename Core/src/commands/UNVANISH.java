package commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class UNVANISH implements CommandExecutor{
	
	public static String UNV = "UNV";
	public static String UNVANISH = "UNVANISH";
	String NoPerm = ChatColor.RED + "No Permission";
	
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.vanish")) {
				if(cmd.getName().equalsIgnoreCase(UNVANISH)) {
					Player p = (Player) sender;
						Bukkit.getOnlinePlayers().forEach(player -> player.hidePlayer(p));
						p.showPlayer(p);
						p.sendMessage(ChatColor.GOLD + "You have been unVanished.");
				}
			}else {
				sender.sendMessage(NoPerm);
			}
		}
		return true;
	}

}
