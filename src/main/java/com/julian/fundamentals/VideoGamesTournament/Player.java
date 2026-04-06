package com.julian.fundamentals.VideoGamesTournament;

public abstract class Player {

    private final String name;
    private final String nickname;
    private final Rol rol;

    public Player (String name, String nickname, Rol rol) {

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank");
        }

        this.name = name;

        if (nickname == null || nickname.isBlank()) {
            throw new IllegalArgumentException("The nickname cannot be null or blank");
        }

        this.nickname = nickname;
        this.rol = rol;
    }

    public abstract String getSpecialSkill ();

    public String toString () {
        return "Nickname: " + nickname + " | Rol: " + rol + " | Special skill: " + getSpecialSkill();
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public Rol getRol() {
        return rol;
    }
}
