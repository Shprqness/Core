	package commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.ChatColor;

public class GIVE implements CommandExecutor{
	
	public static String GIVE = "GIVE";

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender instanceof Player) {
			if(sender.hasPermission("core.give")) {
				if(cmd.getName().equalsIgnoreCase(GIVE)) {
					if (args.length != 0) {
					Material item = Material.getMaterial(args[0].toUpperCase());
					if(item != null) {
						Inventory inv = ((Player)sender).getInventory();				
					inv.addItem(new ItemStack(item, 1));
					return true;
					}else {
						sender.sendMessage(ChatColor.RED + args[0] + "is not a valid item..");
						return true;
					}
					}else {
						sender.sendMessage(ChatColor.RED + "Incorrect Usage, /give [item]");
						return true;
					}
				
				}
				
				
				
			}
		}
		return true;
	}
	
	

}
