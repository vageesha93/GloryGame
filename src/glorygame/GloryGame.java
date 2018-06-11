/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package glorygame;

import Glory_Schema.LetterValueElement;

/**
 *
 * @author vagee
 *
 * ghvhg
 */
public class GloryGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
            //code to test genararting of random cosonent
             LetterValueElement l1 = new LetterValueElement();
             char c = l1.getrandomconsonants();
             System.out.println(c); 
             
             //code to test genararting of random vowel
             char v = l1.getrandomvowels();
             System.out.println(v); 
             
             //code to get the scribble value of certain letter
               int var =l1.getValue(c);
               System.out.println(var);  
               int var2 =l1.getValue(v);
               System.out.println(var2); 
        
        
        
        
        // TODO code application logic here
    }
    
}
