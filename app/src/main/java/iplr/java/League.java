package iplr.java;

import java.util.List;
import java.util.ArrayList;



class League {
	CodesJson cj;
	List<Team> teams;
	List<Ground> grounds;
	List<Player> players;

	BundleJson bj;
	List<Season> seasons;
	List<Match> matches;
	List<TeamInning> teamInnings;

	List<BatsmanInning> centuries;

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
		this.bj = bj;
		centuries = new ArrayList<BatsmanInning>();

		seasons = new ArrayList<Season>();
		for (SeasonJson sj : bj.seasons) {
			seasons.add(new Season(this, sj));
			// break;
		}
	}


	public Team getTeam(int id) {
		for (Team t : teams) if (t.id == id) return t;
		return null;
	}

	public Ground getGround(int id) {
		for (Ground g : grounds) if (g.id == id) return g;
		return null;
	}

	public Player getPlayer(int id) {
		for (Player p : players) if (p.id == id) return p;
		return null;
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

	public void printSeasons() {
		for (Season season : seasons) {
			System.out.println("Season: " + season.year + " (" + season.matches.size() + " matches)");
		}
	}


	public void printCenturies() {
		for (BatsmanInning b : centuries) b.print();
	}


	public void run() {
		// cj.print();
		// printItems();
		printSeasons();
		printCenturies();
	}
}
