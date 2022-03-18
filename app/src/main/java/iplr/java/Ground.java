package iplr.java;

import java.util.ArrayList;



class Ground extends ItemBaseClass {
	GroundJson jo;

	public Ground(League league, GroundJson jo) {
		this.league = league;
		this.jo = jo;
		this.id = jo.id;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.path;
		matches = new ArrayList<Match>();
		// System.out.println("Created new Ground.");
	}

	String getClassname () { return "Ground"; }
}
