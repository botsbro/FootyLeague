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
public class referee extends person { //extends person for name variable and getters and setters
    
    public int games = 0;
    
    referee(String n){ //constructor takes a string for name
        this.name = n;
    }

    public void yellowCard(player p){ //method to assign yellowCard to a player (unused)
        if(p.yellowCard == false){
            p.yellowCard = true;
        }
        else{
            p.yellowCard = false;
            redCard(p);
        }
    }
    
    public void redCard(player p){ //method to assign suspension to a player (unused)
        p.suspended = true;
    }
}
