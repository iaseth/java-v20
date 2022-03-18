package iplr.java;



class Team extends ItemBaseClass {
	TeamJson jo;

	public Team(League league, TeamJson jo) {
		this.league = league;
		this.jo = jo;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.abb;
		// System.out.println("Created new Team.");
	}

	String getClassname () { return "Team"; }
}
