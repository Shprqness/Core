package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class HEAL implements CommandExecutor{
	
	public static String HEAL = "HEAL";

	String NoPerm = ChatColor.RED + "No Permission";
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.heal")) {
				if(cmd.getName().equalsIgnoreCase(HEAL)){
					Player player = (Player) sender;
					player.setHealth(20.0);
		            player.setFoodLevel(20);
		            player.setFireTicks(0);
				}
			}else {
				sender.sendMessage(NoPerm);
			}
		}
		return true;
	}

}
