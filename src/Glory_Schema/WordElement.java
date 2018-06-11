
package Glory_Schema;


/*
WordElement class use for keep the player inserted word
*/
public class WordElement extends GloryElement{
    
    private String playerinsertword; //keep the player inserted word
    public  static String sysword;
    /*
    get the player inserted word
    */
    public String getPlayerinsertword() {
        return playerinsertword;
    }

    /*
    set the player inserted word
    */
    public void setPlayerinsertword(String playerinsertword) {
        this.playerinsertword = playerinsertword;
    }
    
    /*
    get length of player inserted word
    */
    public int getwordlength(){
    
        return playerinsertword.length();
    }
          
        
}
