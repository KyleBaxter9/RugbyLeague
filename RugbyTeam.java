package SuperLeague;

public class RugbyTeam implements Comparable {

    private String teamName;
    private int matchesPlayed;
    private int matchesWon;
    private int matchesLost;
    private int matchesDrawn;
    private int pointsFor;
    private int pointsAgainst;
    private int pointsDiff;
    private int points;

    public RugbyTeam(String teamName) {
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDrawn = matchesDrawn;
        this.pointsFor = pointsFor;
        this.pointsAgainst = pointsAgainst;
        this.pointsDiff = pointsDiff;
        this.points = points;
    }

    public RugbyTeam(String teamName, int matchesPlayed, int matchesWon, int matchesLost, int matchesDrawn, int pointsFor, int pointsAgainst, int pointsDiff, int points) {
        this.teamName = teamName;
        this.matchesPlayed = matchesPlayed;
        this.matchesWon = matchesWon;
        this.matchesLost = matchesLost;
        this.matchesDrawn = matchesDrawn;
        this.pointsFor = pointsFor;
        this.pointsAgainst = pointsAgainst;
        this.pointsDiff = pointsDiff;
        this.points = points;
    }

    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public int getMatchesPlayed() {
        return matchesPlayed;
    }
    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }
    public int getMatchesWon() {
        return matchesWon;
    }
    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }
    public int getMatchesLost() {
        return matchesLost;
    }
    public void setMatchesLost(int matchesLost) {
        this.matchesLost = matchesLost;
    }
    public int getMatchesDrawn() {
        return matchesDrawn;
    }
    public void setMatchesDrawn(int matchesDrawn) {
        this.matchesDrawn = matchesDrawn;
    }
    public int getPointsFor() {
        return pointsFor;
    }
    public void setPointsFor(int pointsFor) {
        this.pointsFor = pointsFor;
    }
    public int getPointsAgainst() {
        return pointsAgainst;
    }
    public void setPointsAgainst(int pointsAgainst) {
        this.pointsAgainst = pointsAgainst;
    }
    public int getPointsDiff() {
        return pointsDiff;
    }
    public void setPointsDiff(int pointsDiff) {
        this.pointsDiff = pointsDiff;
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        this.points = points;
    }

    public void playMatch(int pointsFor, int pointsAgainst) {
        if (pointsFor > pointsAgainst) {
            this.points += 2;
            this.matchesPlayed += 1;
            this.matchesWon += 1;
            this.pointsFor += pointsFor;
            this.pointsAgainst += pointsAgainst;
            this.pointsDiff += (pointsFor - pointsAgainst);
        } else if (pointsFor < pointsAgainst) {
            this.matchesPlayed += 1;
            this.matchesLost += 1;
            this.pointsFor += pointsFor;
            this.pointsAgainst += pointsAgainst;
            this.pointsDiff += (pointsFor - pointsAgainst);
        } else {
            this.points += 1;
            this.matchesPlayed += 1;
            this.matchesDrawn += 1;
            this.pointsFor += pointsFor;
            this.pointsAgainst += pointsAgainst;
            this.pointsDiff += (pointsFor - pointsAgainst);
        }
    }

    @Override
    public int compareTo(Object team) {
        if (this.points < ((RugbyTeam) team).getPoints()) {
            return 1;
        } else if (this.points > ((RugbyTeam) team).getPoints()) {
            return -1;
        } else {
            if(this.pointsDiff < ((RugbyTeam) team).getPointsDiff()){
                return 1;
            }else if(this.pointsDiff > ((RugbyTeam) team).getPointsDiff()) {
                return -1;
            }else {
                return 0;
            }
        }
    }
}
