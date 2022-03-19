package iplr.java;

import java.util.List;
import java.util.ArrayList;



class Over {
	int number;
	public List<String> balls;

	public Over(OverJson jo) {
		number = jo.over;
		balls = jo.balls;
	}
}

class OverHistory {
	List<Over> overs;

	public OverHistory(TeamInning teamInning, List<OverJson> history) {
		overs = new ArrayList<Over>();
		for (OverJson oj : history) {
			overs.add(new Over(oj));
		}
	}
}
