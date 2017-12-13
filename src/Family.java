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
    public ArrayList <String> familyfortunes = new ArrayList <> ();    
    
    //methods
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set hasSiblings attribute
    //*******************************
    public void setHasSiblings (boolean hassiblings) {
        hasSiblings = hassiblings;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return hasSiblings attribute
    //*******************************
    public boolean getHasSiblings () {
        return hasSiblings;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (hasSiblings) {
            familyfortunes.add("Your sibling(s) likes you.");
            familyfortunes.add("Your sibling(s) despises you.");
            familyfortunes.add("Your siblings(s) look up to you.");
            familyfortunes.add("Your sibling(s) think you're beautiful.");
        }
        else {
            familyfortunes.add("Don’t worry about the stock market. Invest in family.");
            familyfortunes.add("Your family has your best interests in mind.");
            familyfortunes.add("You are a valuable asset to your family. ");
            familyfortunes.add("Your family hates you. Your family has its difficulty. "); 
        }
    }
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> familyFortunes) {
        int index = new Random().nextInt(familyFortunes.size());
        String random = familyFortunes.get(index);  
        return random;
    };
}
