package github.com.shprqness;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import commands.FLY;
import commands.GIVE;
import commands.GMC;
import commands.GMS;
import commands.GMSP;
import commands.HEAL;
import commands.UNVANISH;
import commands.VANISH;
import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener{
	
	/*
	 *  Copyright (c) Shprqness Development
	 *  This product cannot be redistributed
	 *  This product cannot be sold 
	 */
	
	
	
	private GMC commands = new GMC();
	private GMS commands1 = new GMS();
	private GMSP commands2 = new GMSP();
	private VANISH commands3 = new VANISH();
	private UNVANISH commands4 = new UNVANISH();
	private GIVE commands5 = new GIVE();
	private FLY commands6 = new FLY();
	private HEAL commands7 = new HEAL();
	
	
	
	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "--------------------------");
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "Core Plugin Started");
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GRAY + "Coded by Shprqness");
		Bukkit.getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "--------------------------");
		getCommand(GMC.GMC).setExecutor(commands);
		getCommand(GMS.GMS).setExecutor(commands1);
		getCommand(GMSP.GMSP).setExecutor(commands2);
		getCommand(VANISH.VANISH).setExecutor(commands3);
		getCommand(VANISH.V).setExecutor(commands3);
		getCommand(UNVANISH.UNVANISH).setExecutor(commands4);
		getCommand(GIVE.GIVE).setExecutor(commands5);
		getCommand(FLY.FLY).setExecutor(commands6);
		getCommand(HEAL.HEAL).setExecutor(commands7);
	}
	
	public void onDisable() {
		
	}
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		e.setJoinMessage(ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " has joined");
	}
	
	@EventHandler
	public void onQuit(PlayerQuitEvent e) {
		Player player = e.getPlayer();
		e.setQuitMessage(ChatColor.BLUE + player.getDisplayName() + ChatColor.GRAY + " has left");
	}

}
