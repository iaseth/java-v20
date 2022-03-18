package iplr.java;



class Ground extends ItemBaseClass {
	GroundJson jo;

	public Ground(League league, GroundJson jo) {
		this.league = league;
		this.jo = jo;
		this.fn = jo.fn;
		this.sn = jo.sn;
		this.path = jo.path;
		// System.out.println("Created new Ground.");
	}

	String getClassname () { return "Ground"; }
}
