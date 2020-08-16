/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thomasbotsford.oop.cw1;

/**
 *
 * @author tom
 */
public class team {
    
    //creating and initialising variables
    private String name;
    private manager manager;
    private coach coach;
    public int wins = 0;
    public int losses = 0;
    public int draws = 0;
    public int points = 0;
    public int goals = 0;
    public int goalsAgainst = 0;
    public player[] players;
    
    
    team(String n){ //constructor takes a string for name
        this.name = n;
    }
    
    team(String n, player[] p){ //overriding constructor takes a string for name and an array of players
        this.name = n;
        this.players = p;
    }
    
    public void setName(String n){ //setter for name
        this.name = n;
    }
    
    public String getName(){ //getter for name
        return this.name;
    }
    
    public int getWins(){ //getter for win count
        return this.wins;
    }
    
    public int getLosses(){ //getter for loss count
        return this.losses;
    }
    
    public int getDraws(){ //getter for draw count
        return this.draws;
    }
    
    public void setManager(manager m){ //setter for manager, calls manager setter for team
        this.manager = m;
        manager.setTeam(this);
    }
    
    public manager getManager(){ //getter for manager
        return this.manager;
    }
    
    public void setCoach(coach c){ //setter for coach, calls coach setter for team
        this.coach = c;
        coach.setTeam(this);
    }
    
    public coach getCoach(){ //getter for coach
        return this.coach;
    }
    
    public int getPoints(){ //getter for league points
        return this.points;
    }
    
}
