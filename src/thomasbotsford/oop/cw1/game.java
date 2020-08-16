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
public class game {
    
    //creating variables
    private team team1;
    public int team1Score;
    public int team2Score;
    private team team2;
    private referee ref;
    
    game(team t1, team t2, int s1, int s2, referee r){ //constructor takes 2 teams, 2 score ints, and a referee
        this.team1 = t1;
        this.team2 = t2;
        this.team1Score = s1;
        this.team2Score = s2;
        this.ref = r;
        
        team1.goals = team1.goals + team1Score; //1st teams league goals is increased by game score
        team2.goals = team2.goals + team2Score; //2nd teams league goals is increased by game score
        team1.goalsAgainst = team1.goalsAgainst + team2Score; //1st teams no. of goal concessions is increased by the other team's score
        team2.goalsAgainst = team2.goalsAgainst + team1Score; //2nd teams no. of goal concessions is increased by the other team's score
        this.ref.games ++; // referee's number of games is incremented
        if(this.team1Score > this.team2Score){
            //1st team's win count increments and 2nd team's loss count increments if team 1 wins
            team1.wins ++;
            team2.losses ++;
            team1.points = team1.points + 3; //team 1 gains 3 league points
        }
        else if(this.team1Score < this.team2Score){
            //2nd team's win count increments and 1st team's loss count increments if team 2 wins
            team2.wins ++;
            team1.losses ++;
            team2.points = team2.points + 3; // //team 2 gains 3 league points
        }
        else{
            //else both team's draw count increments and both teams gain a single point
            team1.draws ++;
            team2.draws ++;
            team1.points ++;
            team2.points ++;
        }
    }
    
    
}
