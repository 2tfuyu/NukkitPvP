package me.nitf.game;

import cn.nukkit.Player;
import me.nitf.member.MemberHandler;

import java.util.List;

public class PvPGame {

    private List<Player> players;

    private Boolean isStarted = false;

    public PvPGame(List<Player> players) {
        this.players = players;
    }

    public void start() {
        this.isStarted = true;
        this.players.forEach(MemberHandler::addMember);
    }

    public void finish() {
        this.isStarted = false;
        this.players.forEach(MemberHandler::removeMember);
    }

    public Boolean isStarted() {
        return this.isStarted;
    }
}
