package iplr.java;

import java.util.List;
import java.util.ArrayList;



class League {
	CodesJson cj;
	List<Team> teams;
	List<Ground> grounds;
	List<Player> players;

	public League(CodesJson cj) {
		this.cj = cj;

		teams = new ArrayList<Team>();
		for (TeamJson jo : cj.teams) {
			Team team = new Team(this, jo);
			teams.add(team);
		}

		grounds = new ArrayList<Ground>();
		for (GroundJson jo : cj.grounds) {
			Ground ground = new Ground(this, jo);
			grounds.add(ground);
		}

		players = new ArrayList<Player>();
		for (PlayerJson jo : cj.players) {
			Player player = new Player(this, jo);
			players.add(player);
		}
	}

	public void loadBundle(BundleJson bj) {
		System.out.println("loadBundle() was called.");
		for (SeasonJson s : bj.seasons) {
			System.out.println(s.year);
		}
	}

	public void printTeams() {
		for (Team team : teams) team.print();
	}

	public void printGrounds() {
		for (Ground ground : grounds) ground.print();
	}

	public void printPlayers() {
		for (Player player : players) player.print();
	}

	public void printItems() {
		printTeams(); printGrounds();
		// printPlayers();
	}

	public void run() {
		// cj.print();
		printItems();
	}
}
