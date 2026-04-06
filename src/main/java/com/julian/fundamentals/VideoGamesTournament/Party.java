package com.julian.fundamentals.VideoGamesTournament;

public class Party {

    private final Team team1;
    private final Team team2;
    private StateParty stateParty;
    private Team winner;

    public Party (Team team1, Team team2) {

        this.team1 = team1;
        this.team2 = team2;
        this.stateParty = StateParty.IN_PROGRESS;
        this.winner = null;

    }

    public void finish (Team winner) {

        if (!stateParty.equals(StateParty.IN_PROGRESS)) {
            throw new IllegalStateException("Game is not in progress");
        }

        this.stateParty = StateParty.COMPLETED;
        this.winner = winner;
    }

    public void cancelled () {
        this.stateParty = StateParty.CANCELLED;
    }


    @Override
    public String toString() {
        String win = winner != null ? winner.getName() : "No winner";
        return String.format("%s vs %s | %s | %s", team1.getName(), team2.getName(), stateParty, win);
    }

    public Team getTeam1() {
        return team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public StateParty getStateParty() {
        return stateParty;
    }

    public Team getWinner() {
        return winner;
    }
}
