package iplr.java;

import java.util.List;
import java.util.ArrayList;



class Season {
	League league;
	SeasonJson jo;
	int year;
	List<Match> matches;

	public Season(League league, SeasonJson jo) {
		this.league = league;
		this.year = jo.year;
		matches = new ArrayList<Match>();
		for (MatchJson mj : jo.matches) {
			matches.add(new Match(this, mj));
			// break;
		}
	}
}
