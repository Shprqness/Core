package commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class VANISH implements CommandExecutor{
	
	public static String VANISH = "VANISH";
	public static String V = "V";
	public static String UNVANISH = "unvanish";
	public static String UNV = "unv";
	
	String NoPerm = ChatColor.RED + "No Permission";
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.vanish")) {
				if(cmd.getName().equalsIgnoreCase(VANISH)) {
					Player p = (Player) sender;
					
						Bukkit.getOnlinePlayers().forEach(player -> player.showPlayer(p));
						p.sendMessage(ChatColor.GOLD + "You have been Vanished.");
				}
			}else {
				sender.sendMessage(NoPerm);
			}
		}
		return true;
	}
	
	public boolean onCommand1(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.vanish")) {
				if(cmd.getName().equalsIgnoreCase(UNVANISH)) {
					Player p = (Player) sender;
					
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
