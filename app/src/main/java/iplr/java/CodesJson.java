package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
class Team {
	public int id;
	public String abb;
	public String color;
	public String fn;
	public String name;
	public String sn;

	public Team() {
		// System.out.println("Created new Team.");
	}

	public void print() {
		System.out.println("Team: " + this.fn + " (" + this.abb + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Ground {
	public int id;
	public String city;
	public String country;
	public String fn;
	public String path;
	public String sn;

	public Ground() {
		// System.out.println("Created new Ground.");
	}

	public void print() {
		System.out.println("Ground: " + this.fn + " (" + this.city + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class Player {
	public int id;
	public boolean batsRight;
	public boolean bowlsRight;
	public String country;
	public String fn;
	public String fun;
	public String nick;
	public String path;
	public String sn;

	public Player() {
		// System.out.println("Created new Player.");
	}

	public void print() {
		System.out.println("Player: " + this.fn + " (" + this.country + ")");
	}
}


@JsonIgnoreProperties(ignoreUnknown = true)
class CodesJson {
	public List<Team> teams;
	public List<Ground> grounds;
	public List<Player> players;

	public CodesJson () {
		System.out.println("I was called!");
	}

	public void print() {
		for (Team t : teams) t.print();
		for (Ground g : grounds) g.print();
		for (Player p : players) p.print();
	}
}
