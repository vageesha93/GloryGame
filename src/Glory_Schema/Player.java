
package Glory_Schema;



/*
Player is the subclass of GloryElement that represents instances of variables
*/
public class Player extends GloryElement {
    
    private String playerName; //contains the name string  
    private int score; //numeric value of the variable 
    private int roundnum; //number of round
    


    public void setRoundnum(int roundnum) {
        this.roundnum = roundnum;
    }


    public int getRoundnum() {
        return roundnum;
    }

    public void increaseroundnum() {
        roundnum++;
        if (roundnum>1 && roundnum<=5){
            //code 
        }
    }

    /*
        The constructor for set player name and set initial score
        */
    public Player(String playerName) {
        this.playerName = playerName;
        score=0;
        
    }


    public int getScore() {
        return score;
    }

   
    public void setScore(int score) {
        this.score += score;
    }

    public String getPlayerName() {
        return playerName;
    }
    
    
    
    
}
