package SuperLeague;

import java.util.*;

public class RugbyLeague {

    private ArrayList <RugbyTeam> leagueMembers = new ArrayList<>();
    private String leagueName;

    public RugbyLeague() {
    }
    public RugbyLeague(String leagueName) {
        this.leagueName = leagueName;
        this.leagueMembers = new ArrayList<>();
    }
    public String getLeagueName() {
        return leagueName;
    }
    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }
    public void addTeam(RugbyTeam rugbyTeam) {
        this.leagueMembers.add(rugbyTeam);
    }
    public void getLeagueTable() {
        Collections.sort(this.leagueMembers);

        System.out.println(this.getLeagueName() + " League: ");
        System.out.printf("%-6s%-20s%-9s%-9s%-9s%-9s%-9s%-9s%-11s%-9s%n", "Pos ",  "Team ", "Played", "Won", "Lost", "Drawn", "For","Against","Pts Diff","Points");

        int place = 1;

        for (RugbyTeam rugbyTeam : leagueMembers) {
            System.out.printf("%-6d%-20s%-9s%-9s%-9s%-9s%-9s%-9s%-11s%-9s%n", place++, rugbyTeam.getTeamName(), rugbyTeam.getMatchesPlayed(), rugbyTeam.getMatchesWon(), rugbyTeam.getMatchesLost(), rugbyTeam.getMatchesDrawn(), rugbyTeam.getPointsFor(), rugbyTeam.getPointsAgainst(), rugbyTeam.getPointsDiff(), rugbyTeam.getPoints());
        }
    }
}
