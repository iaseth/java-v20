package iplr.java;



class Team extends ItemBaseClass {
	TeamJson jo;

	public Team(League league, TeamJson jo) {
		this.league = league;
		this.jo = jo;
		// System.out.println("Created new Team.");
	}

	public void print() {
		System.out.println("Team: " + jo.fn);
	}
}
