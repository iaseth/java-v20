package iplr.java;

import java.util.List;
import java.util.ArrayList;



class TeamInning {
	League league;
	Squad squad;
	List<BatsmanInning> batting;
	List<BowlerInning> bowling;
	List<Wicket> wickets;
	int runs, balls, wkts;
	String overs;

	public TeamInning(Squad sq, TeamInningJson tj) {
		league = sq.league;
		squad = sq;
		if (tj == null) {
			return;
		}

		runs = tj.runs;
		balls = tj.balls;
		overs = tj.overs;
		wkts = tj.wickets.size();

		batting = new ArrayList<BatsmanInning>();
		for (BatsmanInningJson bj : tj.batting) {
			batting.add(new BatsmanInning(this, bj));
		}

		bowling = new ArrayList<BowlerInning>();
		for (BowlerInningJson bj : tj.bowling) {
			bowling.add(new BowlerInning(this, bj));
		}

		wickets = new ArrayList<Wicket>();
		for (WicketJson wj : tj.wickets) {
			wickets.add(new Wicket(this, wj));
		}
	}
}
