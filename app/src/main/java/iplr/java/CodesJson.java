package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
class Team {
	static int count = 0;
	private int index;
	public int id;
	public String abb, color, fn, name, sn;

	public Team() {
		index = count++;
		// System.out.println("Created new Team.");
	}

	public void print() {
		System.out.println("[" + index + "] Team: " + this.fn + " (" + this.abb + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Ground {
	static int count = 0;
	private int index;
	public int id;
	public String city, country, fn, path, sn;

	public Ground() {
		index = count++;
		// System.out.println("Created new Ground.");
	}

	public void print() {
		System.out.println("[" + index + "] Ground: " + this.fn + " (" + this.city + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Player {
	static int count = 0;
	private int index;
	public int id;
	public boolean batsRight, bowlsRight;
	public String country, fn, fun, nick, path, sn;

	public Player() {
		index = count++;
		// System.out.println("Created new Player.");
	}

	public void print() {
		System.out.println("[" + index + "] Player: " + this.fn + " (" + this.country + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class CodesJson {
	public List<Team> teams;
	public List<Ground> grounds;
	public List<Player> players;

	public CodesJson () {
		// System.out.println("I was called!");
	}

	public void print() {
		for (Team t : teams) t.print();
		for (Ground g : grounds) g.print();
		// for (Player p : players) p.print();
	}
}
