package iplr.java;



class BowlerInning {
	TeamInning teamInning;
	Player bowler;
	int runs, balls, wkts, dots;
	int md, nb, wd;
	String overs;

	public BowlerInning(TeamInning teamInning, BowlerInningJson jo) {
		this.teamInning = teamInning;
		bowler = teamInning.league.getPlayer(jo.id);
		runs = jo.r;
		balls = jo.b;
		wkts = jo.w;
		dots = jo.d; md = jo.m;
		nb = jo.nb; wd = jo.wd;
		overs = jo.ov;
	}

	public void print() {
		System.out.println(bowler.fn + " " + wkts + "-" + runs + " (" + overs + ")"
			+ " [" + nb + "nb, " + wd + "wd]");
	}
}
