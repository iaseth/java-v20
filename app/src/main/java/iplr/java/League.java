package iplr.java;

import java.util.List;
import java.util.ArrayList;



class League {
	CodesJson cj;
	List<Team> teams;

	public League(CodesJson cj) {
		this.cj = cj;

		teams = new ArrayList<Team>();
		for (TeamJson jo : cj.teams) {
			Team team = new Team(this, jo);
			teams.add(team);
		}
	}

	public void printTeams() {
		for (Team team : teams) team.print();
	}

	public void run() {
		// cj.print();
		printTeams();
	}
}
