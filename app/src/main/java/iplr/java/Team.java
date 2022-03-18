package iplr.java;

import java.util.ArrayList;



class Team extends ItemBaseClass {
	TeamJson jo;

	public Team(League league, TeamJson jo) {
		this.league = league;
		this.jo = jo;
		this.id = jo.id;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.abb;
		matches = new ArrayList<Match>();
		// System.out.println("Created new Team.");
	}

	String getClassname () { return "Team"; }
}
