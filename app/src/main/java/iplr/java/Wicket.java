package iplr.java;



class Wicket {
	TeamInning teamInning;
	Player batsman;
	int runs, wicket, over, ball;

	public Wicket(TeamInning teamInning, WicketJson wj) {
		this.teamInning = teamInning;
		batsman = teamInning.league.getPlayer(wj.id);
		runs = wj.r;
		wicket = wj.w;
		over = wj.over - 1;
		ball = wj.ball;
	}

	public void print() {
		System.out.println("Wicket: " + batsman.fn + " ==> " + wicket + "-" + runs + " (" + over + "." + ball + ")");
	}
}
