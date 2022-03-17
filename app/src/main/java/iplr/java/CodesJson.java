package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
class TeamJson {
	static int count = 0;
	private int index;
	public int id;
	public String abb, color, fn, name, sn;

	public TeamJson() {
		index = count++;
		// System.out.println("Created new TeamJson.");
	}

	public void print() {
		System.out.println("[" + index + "] TeamJson: " + this.fn + " (" + this.abb + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class GroundJson {
	static int count = 0;
	private int index;
	public int id;
	public String city, country, fn, path, sn;

	public GroundJson() {
		index = count++;
		// System.out.println("Created new GroundJson.");
	}

	public void print() {
		System.out.println("[" + index + "] GroundJson: " + this.fn + " (" + this.city + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class PlayerJson {
	static int count = 0;
	private int index;
	public int id;
	public boolean batsRight, bowlsRight;
	public String country, fn, fun, nick, path, sn;

	public PlayerJson() {
		index = count++;
		// System.out.println("Created new PlayerJson.");
	}

	public void print() {
		System.out.println("[" + index + "] PlayerJson: " + this.fn + " (" + this.country + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class CodesJson {
	public List<TeamJson> teams;
	public List<GroundJson> grounds;
	public List<PlayerJson> players;

	public CodesJson () {
		// System.out.println("I was called!");
	}

	public void print() {
		for (TeamJson t : teams) t.print();
		for (GroundJson g : grounds) g.print();
		// for (PlayerJson p : players) p.print();
	}
}
