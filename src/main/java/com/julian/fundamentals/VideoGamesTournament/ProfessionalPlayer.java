package com.julian.fundamentals.VideoGamesTournament;

public class ProfessionalPlayer extends Player {

    private final String team;

    public ProfessionalPlayer (String name, String nickname, Rol rol, String team) {
        super(name, nickname, rol);

        if (team == null || team.isBlank()) {
            throw new IllegalArgumentException("The team cannot be null or negative");
        }

        this.team = team;
    }

    @Override
    public String getSpecialSkill() {
        return "Professional strategy";
    }

    public String getTeam() {
        return team;
    }
}
