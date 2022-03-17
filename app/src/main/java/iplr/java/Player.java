package iplr.java;



class Player extends ItemBaseClass {
	PlayerJson jo;

	public Player(League league, PlayerJson jo) {
		this.league = league;
		this.jo = jo;
		// System.out.println("Created new Player.");
	}

	public void print() {
		System.out.println("Player: " + jo.fn);
	}
}
