package com.julian.fundamentals.Excercises3;

public class Player extends Participant implements Competitor {

    private int score;

    public Player (String name, int age, int score) {
        super(name, age);

        if (score < 0) {
            throw new IllegalArgumentException("The score cannot be negative");
        }

        this.score = score;
    }

    @Override
    public String getType() {
        return "Individual Player";
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void sumPoints (int points) {
        this.score += points;
    }
}
