package com.julian.fundamentals.VideoGamesTournament;

import com.julian.fundamentals.Exceptions.TeamFullException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Team {

    private final String name;
    private final List<Player> players;

    public Team (String name) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;
        this.players = new ArrayList<>();

    }

    public void addPlayer (Player player) {

        if (players.size() >= 5) {
            throw new TeamFullException("The team is full");
        }

        players.add(player);
    }

    public List<Player> getPlayerForRol (Rol rol) {
        return players.stream().filter(player -> player.getRol().equals(rol)).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Name: " + name + " | Players: " + players.size();
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
