package iplr.java;

import java.util.List;
import java.util.ArrayList;



class Squad {
	League league;
	Season season;
	Match match;
	SquadJson jo;
	Team team;
	List<Player> members;
	Player captain, wk;

	public Squad(Match m, SquadJson sj) {
		this.match = m;
		this.jo = sj;
		this.season = m.season;
		this.league = m.league;

		team = league.getTeam(sj.team);
		captain = league.getPlayer(sj.captain);
		wk = league.getPlayer(sj.wk);

		members = new ArrayList<Player>();
		for (int playerId : sj.players) {
			Player player = league.getPlayer(playerId);
			members.add(player);
		}
	}
}
