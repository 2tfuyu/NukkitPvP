package me.nitf.event;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import cn.nukkit.event.entity.EntityDamageEvent;
import cn.nukkit.event.player.PlayerDeathEvent;
import cn.nukkit.event.player.PlayerJoinEvent;
import me.nitf.member.Member;
import me.nitf.member.MemberHandler;

public class EventListener implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player player = (Player) e.getPlayer();
        String name = player.getName();
        player.sendMessage("welcome");
    }

    public void onDeath(PlayerDeathEvent e) {
        Player player = e.getEntity().getPlayer();
        Member playerMember = MemberHandler.getMember(player.getName());
        EntityDamageEvent damageCause = player.getLastDamageCause();
        if (!(damageCause instanceof EntityDamageByEntityEvent)) {
            playerMember.respawn();
        }
        Player damager = (Player) damageCause.getEntity();
        Member damagerMember = MemberHandler.getMember(damager.getName());

        playerMember.addDeath();
        playerMember.respawn();
        damagerMember.addKill();
    }
}
