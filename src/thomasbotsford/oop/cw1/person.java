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
public class person {
    
    protected String name; //name variable is protected because it is used by subclasses
    
    protected String getName(){ //name getter
        return this.name;
    }
    
    protected void setName(String n){ //name setter
        this.name = n;
    }
}
