package SuperLeague;

public class Main {

    public Main() {

    }

    public static void main(String[] args) {
        RugbyLeague sl = new RugbyLeague("Super League");

        RugbyTeam ct = new RugbyTeam("CastleFord Tigers");
        RugbyTeam cd = new RugbyTeam("Catalan Dragons");
        RugbyTeam hg = new RugbyTeam("Huddersfield Giants");
        RugbyTeam hu = new RugbyTeam("Hull FC");
        RugbyTeam hkr = new RugbyTeam("Hull Kingston Rovers");
        RugbyTeam lr = new RugbyTeam("Leeds Rhinos");
        RugbyTeam srd = new RugbyTeam("Salford Red Devils");
        RugbyTeam sh = new RugbyTeam("St Helens");
        RugbyTeam twp = new RugbyTeam("Toronto Wolfpack");
        RugbyTeam wt = new RugbyTeam("Wakefield Trinity");
        RugbyTeam ww = new RugbyTeam("Warrington Wolves");
        RugbyTeam wiw = new RugbyTeam("Wigan Warriors");


        sl.addTeam(ct);
        sl.addTeam(cd);
        sl.addTeam(hg);
        sl.addTeam(hu);
        sl.addTeam(hkr);
        sl.addTeam(lr);
        sl.addTeam(srd);
        sl.addTeam(sh);
        sl.addTeam(twp);
        sl.addTeam(wt);
        sl.addTeam(ww);
        sl.addTeam(wiw);

        ct.playMatch(22, 12);
        cd.playMatch(12, 22);
        hg.playMatch(22, 10);
        hu.playMatch(10, 22);

        sl.getLeagueTable();

    }
}
