package me.nitf.member;

import cn.nukkit.Player;

public class Member {

    private Player player;

    private int killCount = 0;

    private int deathCount = 0;

    public Member(Player player) {
        this.player = player;
    }

    public void respawn() {

    }

    public void addKill() {
        this.killCount++;
    }

    public void addDeath() {
        this.deathCount++;
    }

    public int getKill() {
        return this.killCount;
    }

    public int getDeath() {
        return this.deathCount;
    }

    public Player getPlayer() {
        return this.player;
    }
}
