package commands;

import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class GMSP implements CommandExecutor{
	
	public static String GMSP = "GMSP";

	String NoPerm = ChatColor.RED + "No Permission";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.GMSP")) {
				if(cmd.getName().equalsIgnoreCase(GMSP)) {
					Player p = (Player) sender;
					p.setGameMode(GameMode.SPECTATOR);
					p.sendMessage(ChatColor.GRAY + "Gamemode set to " + ChatColor.BLUE + "SPECTATOR" + ChatColor.GRAY + " for " + ChatColor.BLUE + p.getDisplayName());
				}
			}else {
				sender.sendMessage(NoPerm);
			}
		}
		
		
		return true;
	}
	
	
	
	

}
