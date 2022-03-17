package iplr.java;



class Ground extends ItemBaseClass {
	GroundJson jo;

	public Ground(League league, GroundJson jo) {
		this.league = league;
		this.jo = jo;
		// System.out.println("Created new Ground.");
	}

	public void print() {
		System.out.println("Ground: " + jo.fn);
	}
}
