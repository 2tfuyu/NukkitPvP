package me.nitf.member;

import cn.nukkit.Player;

import java.util.Map;

public class MemberHandler {

    private static Map<String, Member> members;

    public static void addMember(Player player) {
        members.put(player.getName(), new Member(player));
    }

    public static void removeMember(Player player) {
        members.remove(player.getName());
    }

    public static Member getMember(String name) {
        return members.get(name);
    }
}
