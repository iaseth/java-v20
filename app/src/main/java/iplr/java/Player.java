package iplr.java;

import java.util.ArrayList;



class Player extends ItemBaseClass {
	PlayerJson jo;

	public Player(League league, PlayerJson jo) {
		this.league = league;
		this.id = jo.id;
		this.jo = jo;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.path;
		matches = new ArrayList<Match>();
		// System.out.println("Created new Player.");
	}

	String getClassname () { return "Player"; }
}
