package iplr.java;



class Match {
	League league;
	Season season;
	MatchJson jo;
	Ground ground;
	int year, number;
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

		year = jo.meta.year;
		number = jo.meta.number;

		var order = jo.meta.order;
		if (order.size() == 0) {
			// I guess they were already null, happens 3 times till 2021
			inning_a = inning_b = firstInning = secondInning = null;
			// System.out.println(this + " no innings order!");
		} else if (order.size() == 1) {
			// this never happens
		} else if (jo.innings.size() == 0) {
			// no innings data provided, happens 4 times till 2021
			inning_a = inning_b = firstInning = secondInning = null;
			// System.out.println(this + " no innings data!");
		} else if (order.size() == 2) {
			var jo1 = jo.innings.size() < 1 ? null : jo.innings.get(0);
			var jo2 = jo.innings.size() < 2 ? null : jo.innings.get(1);

			if (order.get(0) == 0) {
				// team_a bats first
				inning_a = firstInning = new TeamInning(squad_a, jo1);
				inning_b = secondInning = new TeamInning(squad_b, jo2);
			} else {
				// team_b bats first
				inning_b = firstInning = new TeamInning(squad_b, jo1);
				inning_a = secondInning = new TeamInning(squad_a, jo2);
			}
		}
		// this.inning_a = new TeamInning(squad_a, jo.innings.get(0));
		// this.inning_b = new TeamInning(squad_a, jo.innings.get(1));
	}

	public String toString() {
		return "Match [" + year + "/" + number + "]";
	}
}
