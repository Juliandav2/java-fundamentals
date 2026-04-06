package com.julian.fundamentals.VideoGamesTournament;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tournament {

    private final String name;
    private final List<Team> teams;
    private final List<Party> parties;


    public Tournament (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.teams = new ArrayList<>();
        this.parties = new ArrayList<>();

    }

    public void addTeam (Team team) {
        teams.add(team);
    }

    public void addParty (Party party) {
        parties.add(party);
    }

    public Team getWinnerTeam () {
        return parties.stream().filter(party -> party.getStateParty().equals(StateParty.COMPLETED)).collect(Collectors
                .groupingBy(Party::getWinner, Collectors.counting())).entrySet().stream().max(Map.Entry
                .comparingByValue()).orElseThrow(() -> new RuntimeException("No finished games")).getKey();
    }

    public Map<String, Long> getStandingsTables () {
        return parties.stream().filter(party -> party.getStateParty().equals(StateParty.COMPLETED)).collect(Collectors
                .groupingBy(party -> party.getWinner().getName(), Collectors.counting())).entrySet().stream()
                .sorted(Map.Entry.<String, Long> comparingByValue().reversed()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));
    }

    public List<Player> getPlayersByRol (Rol rol) {
        return teams.stream().flatMap(team -> team.getPlayers().stream()).filter(player -> player.getRol().equals(rol))
                .collect(Collectors.toList());
    }

    public String getStatistics () {

        long finished = parties.stream().filter(party -> party.getStateParty().equals(StateParty.COMPLETED)).count();
        long cancelled = parties.stream().filter(party -> party.getStateParty().equals(StateParty.CANCELLED)).count();
        return String.format("Total games: %d | Finished: %d | Cancelled: %d | Best team: %s", parties.size(), finished, cancelled, getWinnerTeam().getName());
    }

    public String getName() {
        return name;
    }
}
