package iplr.java;



class Player extends ItemBaseClass {
	PlayerJson jo;

	public Player(League league, PlayerJson jo) {
		this.league = league;
		this.jo = jo;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.path;
		// System.out.println("Created new Player.");
	}

	String getClassname () { return "Player"; }
}
