package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@JsonIgnoreProperties(ignoreUnknown = true)
class BatsmanInningJson {
	public int id, r, b, n4, n6;

	public void print() {
		System.out.println("Batsman: " + r + " (" + b + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class BowlerInningJson {
	public int id, r, b, w, d, m, nb, wd;
	public String ov;

	public void print() {
		System.out.println("Bowler: " + w + "-" + r + " (" + ov + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class TeamInningJson {
	public List<BatsmanInningJson> batting;
	public List<BowlerInningJson> bowling;

	public void print() {
		System.out.println("TeamInningJson.");
		for (BatsmanInningJson b : batting) b.print();
		for (BowlerInningJson b : bowling) b.print();
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class MatchJson {
	public List<TeamInningJson> innings;

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

