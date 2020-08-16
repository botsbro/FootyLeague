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
public class player extends person { //extends person for name variable and getters and setters
    
    //creating variables
    private String position;
    private team team;
    private int number;
    private static int goals; //player goal count (unused)
    public boolean yellowCard = false; //player yellow card status (unused)
    public boolean suspended = false; //player suspension stats (unused)
    
    
    player(String n, String p, int num){ //constructor takes a string for name, another for position, and an int for number
        this.name = n;
        this.position = p;
        this.number = num;
    }
    
    public void setNumber(int num){ //setter for player number
        this.number = num;
    }
    
    public void setTeam(team t){ //setter for team
        this.team = t;
    }
    
    public int getNumber(){ //getter for number
        return this.number;
    }
    
    public String getPosition(){ //getter for position
        return this.position;
    }
    
    public void setPosition(String p){ //setter for position
        this.position = p;
    }
    
    public int getGoals(){ //getter for goals (unused)
        return this.goals;
    }
    
    public void endSuspension(){ //method to end suspension of player (unused)
        this.suspended = false;
    }
    
    public static void scoreGoal(){ //method to increment player goal count (unused)
        player.goals++;
    }
    
    
    
    
    
}
