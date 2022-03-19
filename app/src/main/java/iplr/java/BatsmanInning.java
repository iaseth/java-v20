package iplr.java;



class BatsmanInning {
	TeamInning teamInning;
	Player batsman;
	int runs, balls, n4, n6;

	public BatsmanInning(TeamInning teamInning, BatsmanInningJson jo) {
		this.teamInning = teamInning;
		batsman = teamInning.league.getPlayer(jo.id);
		runs = jo.r;
		balls = jo.b;
		this.n4 = jo.n4;
		this.n6 = jo.n6;
		if (runs >= 100) {
			teamInning.league.centuries.add(this);
		}
	}

	public void print() {
		System.out.println(batsman.fn + " " + runs + " (" + balls + ")"
			+ " (" + n4 + " fours, " + n6 + " sixes)");
	}
}
