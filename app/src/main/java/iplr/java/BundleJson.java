package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
class BatsmanInningJson {
	public int id, r, b, n4, n6;
	public Dismissal out;

	public void print() {
		System.out.println("\tbatsman: " + r + " (" + b + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Dismissal {
	public int bowler, over, ball;
	public String type;
	public List<Integer> fielders;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class BowlerInningJson {
	public int id, r, b, w, d, m, nb, wd;
	public String ov;

	public void print() {
		System.out.println("\tbowler: " + w + "-" + r + " (" + ov + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Extras {
	public int b, lb, p, nb, wd;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Over {
	public int over;
	public List<String> balls;

	public void print() {
		System.out.println("\tover " + over + ": " + balls);
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Wicket {
	public int id, r, w, over, ball;

	public void print() {
		System.out.println("\twicket " + w + "-" + r + " (" + over + "." + ball + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class TeamInningJson {
	public int runs, balls;
	public String overs;
	public List<BatsmanInningJson> batting;
	public List<BowlerInningJson> bowling;
	public Extras extras;
	public List<Over> history;
	public List<Wicket> wickets;

	public void print() {
		System.out.println("Batsmen:");
		for (BatsmanInningJson b : batting) b.print();
		System.out.println("Bowlers:");
		for (BowlerInningJson b : bowling) b.print();
		System.out.println("Overs:");
		for (Over o : history) o.print();
		System.out.println("Wickets:");
		for (Wicket w : wickets) w.print();
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class SquadJson {
	public List<Integer> players;
	public int team, captain, wk;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class MatchMeta {
	public int year, number, ground;
	public char state, outcome;
	public List<Integer> order;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class MatchJson {
	public List<TeamInningJson> innings;
	public List<SquadJson> teams;
	public MatchMeta meta;

	public void print() {
		System.out.println("MatchJson.");
		for (TeamInningJson t : innings) {
			t.print();
		}
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class SeasonJson {
	public List<MatchJson> matches;
	public int year;
}


@JsonIgnoreProperties(ignoreUnknown = true)
class BundleJson {
	public List<SeasonJson> seasons;
}

