package com.julian.fundamentals.Excercises3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tournament {

    private String name;
    private List<Competitor> participants;
    private Map<String, Integer> marker;

    public Tournament (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        participants = new ArrayList<>();
        marker = new HashMap<>();
    }

    public void enroll (Competitor competitor) {
        participants.add(competitor);
        marker.put(competitor.getName(), 0);
    }

    public void updateScoreboard (Competitor competitor) {
        marker.put(competitor.getName(), competitor.getScore());
    }

    public void showScoreboard () {
        for (Map.Entry<String, Integer> entry : marker.entrySet()) {
            String name = entry.getKey();
            Integer score = entry.getValue();
            System.out.println("Competitor: " + name + " | Score: " + score);
        }
    }

    public String getLeader () {
        String leaderWinner = null;
        int bestScore = 0;
        for (Map.Entry<String, Integer> entry : marker.entrySet()) {
            if (entry.getValue() > bestScore) {
                bestScore = entry.getValue();
                leaderWinner = entry.getKey();
            }
        }

        return leaderWinner;
    }

    public List<Competitor> onlyTeams () {
        List<Competitor> teams = new ArrayList<>();
        for (Competitor team : participants) {
            if (team instanceof Team) {
                teams.add(team);
            }
        }

        return teams;
    }


}
