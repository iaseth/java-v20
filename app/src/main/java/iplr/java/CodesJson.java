package iplr.java;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
class Team {
    public int id;
    public String abb;
    public String color;
    public String fn;
    public String name;
    public String sn;

    public Team() {
        // System.out.println("Created new Team.");
    }

    public void print() {
        System.out.println("Team: " + this.fn + " (" + this.abb + ")");
    }
}


@JsonIgnoreProperties(ignoreUnknown = true)
class CodesJson {
    public List<Team> teams;

    public CodesJson () {
        System.out.println("I was called!");
    }

    public void print() {
        for (Team team : teams) {
            team.print();
        }
    }
}
