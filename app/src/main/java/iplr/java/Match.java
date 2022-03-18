package iplr.java;



class Match {
	League league;
	Season season;
	MatchJson jo;
	Ground ground;
	Match next, previous;

	Team team_a, team_b;
	Squad squad_a, squad_b;
	TeamInning inning_a, inning_b;
	TeamInning firstInning, secondInning;

	public Match(Season season, MatchJson jo) {
		this.season = season;
		this.league = season.league;
		this.jo = jo;

		this.ground = league.getGround(jo.meta.ground);
		this.ground.matches.add(this);

		squad_a = new Squad(this, jo.teams.get(0));
		squad_b = new Squad(this, jo.teams.get(1));
		team_a = squad_a.team;
		team_b = squad_b.team;
		team_a.matches.add(this);
		team_b.matches.add(this);

		// this.inning_a = new TeamInning(squad_a, jo.innings.get(0));
		// this.inning_b = new TeamInning(squad_a, jo.innings.get(1));
	}
}
