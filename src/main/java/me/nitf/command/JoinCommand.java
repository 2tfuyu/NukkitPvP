package me.nitf.command;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;

public class JoinCommand extends Command {

    public JoinCommand() {
        super("join", "PvP Command", "/join");
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        if (!(sender instanceof Player)) {
            return false;
        }

        return false;
    }
}
