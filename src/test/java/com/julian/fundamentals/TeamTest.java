package com.julian.fundamentals;

import com.julian.fundamentals.Exceptions.TeamFullException;
import com.julian.fundamentals.VideoGamesTournament.*;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TeamTest {

    @Test
    void addPlayer_shouldThrowException_whenTeamIsFull () {

        Team team = new Team("Test team");
        team.addPlayer(new ProfessionalPlayer("p1", "nick1", Rol.DAMAGE, "corp"));
        team.addPlayer(new ProfessionalPlayer("p2", "nick2", Rol.TANK, "corp"));
        team.addPlayer(new ProfessionalPlayer("p3", "nick3", Rol.HEALER, "corp"));
        team.addPlayer(new ProfessionalPlayer("p4", "nick4", Rol.SUPPORT, "corp"));
        team.addPlayer(new ProfessionalPlayer("p5", "nick5", Rol.DAMAGE, "corp"));

        assertThrows(TeamFullException.class, () -> {team.addPlayer(new ProfessionalPlayer("p6", "nick6", Rol.TANK, "corp"));});
    }

    @Test
    void finalize_should_throw_an_except_whenGameIsNotOn () {

        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");
        Party party = new Party(team1, team2);

        party.finish(team1);

        assertThrows(IllegalStateException.class, () -> {party.finish(team1);});
    }

    @Test
    void getPlayersByRole_shouldReturnOnlyMatchingRole () {

        Team team = new Team("Test Team");
        team.addPlayer(new ProfessionalPlayer("p1", "nick1", Rol.DAMAGE, "corp"));
        team.addPlayer(new ProfessionalPlayer("p2", "nick2", Rol.TANK, "corp"));
        team.addPlayer(new ProfessionalPlayer("p3", "nick3", Rol.DAMAGE, "corp"));

        List<Player> result = team.getPlayerForRol(Rol.DAMAGE);
        assertEquals(2, result.size());
    }

    @Test
    void getTablePositions_shouldReturnCorrectVictories () {

        Tournament tournament = new Tournament("Test Tournament");
        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        tournament.addTeam(team1);
        tournament.addTeam(team2);

        Party party1 = new Party(team1, team2);
        party1.finish(team1);
        tournament.addParty(party1);

        Party party2 = new Party(team1, team2);
        party2.finish(team2);
        tournament.addParty(party2);

        Map<String, Long> result = tournament.getStandingsTables();

        assertEquals(1, result.get("Team A"));
        assertEquals(1, result.get("Team B"));

    }

    @Test
    void getWinningTeam_shouldReturnTeamWithMostWins () {

        Tournament tournament = new Tournament("Test Tournament");
        Team team1 = new Team("Team A");
        Team team2 = new Team("Team B");

        tournament.addTeam(team1);
        tournament.addTeam(team2);

        Party party1 = new Party(team1, team2);
        party1.finish(team1);
        tournament.addParty(party1);

        Party party2 = new Party(team1, team2);
        party2.finish(team1);
        tournament.addParty(party2);

        Team result = tournament.getWinnerTeam();

        assertEquals("Team A", result.getName());
    }
}
