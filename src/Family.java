import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class Family extends Relationship implements IRandom {
    //attributes
    boolean hasSiblings;
    public static ArrayList <String> familyfortunes = new ArrayList <> ();
    
    
    //methods
    public void setHasSiblings (boolean hassiblings) {
        hasSiblings = hassiblings;
    }
    public boolean getHasSiblings () {
        return hasSiblings;
    }
    public String getRandomFortune (java.util.ArrayList<String> familyFortunes) {
        familyfortunes = familyFortunes;
        int index = new Random().nextInt(familyfortunes.size());
        String random = familyfortunes.get(index);  
        return random;
    };
    
    //create an arraylist of fortunes
    public static void main (String [] args) {
        
        familyfortunes.add("Don’t worry about the stock market. Invest in family.");
        familyfortunes.add("Your family has your best interests in mind.");
        familyfortunes.add("You are a valuable asset to your family. ");
        familyfortunes.add("Your family hates you. Your family has its difficulty. "); 
    }

}
