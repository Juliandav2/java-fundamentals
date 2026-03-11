package com.julian.fundamentals.Excercises3;

import java.util.ArrayList;
import java.util.List;

public class Team extends Participant implements Competitor {

    private List<Player> members;

    public Team (String name, int age) {
        super(name, age);
        members = new ArrayList<>();
    }

    public Team (String name) {
        super(name);
        members = new ArrayList<>();
    }

    public void addPlayer (Player player) {
        members.add(player);
    }

    @Override
    public String getType() {
        return "Team";
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getScore() {

        int totalScore = 0;
        for (Player player : members) {
                totalScore += player.getScore();
            }

        return totalScore;

    }
}
