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
public class coach extends person { //extends person for name variable and getters and setters
    
    
    private team team;
    
    coach(String n){ //coach constructor takes a string for name
        this.name = n;
    }
    
    coach(String n, team t){ //overriding constructor takes a string for name and team object
        this.name = n;
        this.team = t;
    }
    
    
    public void setTeam(team t){ //set team method
        this.team = t;
    }
    
}
