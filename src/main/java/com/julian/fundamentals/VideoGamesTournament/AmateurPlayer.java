package com.julian.fundamentals.VideoGamesTournament;

public class AmateurPlayer extends Player {

    private final int gamesPlayed;

    public AmateurPlayer (String name, String nickname, Rol rol, int gamesPlayed) {
        super(name, nickname, rol);

        if (gamesPlayed <= 0) {
            throw new IllegalArgumentException("The number of games played must be greater than 0");
        }

        this.gamesPlayed = gamesPlayed;
    }

    @Override
    public String getSpecialSkill() {
        return "Natural instinct";
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }
}
