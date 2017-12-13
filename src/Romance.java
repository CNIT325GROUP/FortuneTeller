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
public class Romance extends Relationship implements IRandom{
    //attributes
    String relationshipStatus;
    boolean isRomantic;
    public ArrayList <String> romancefortunes = new ArrayList <> ();
    
    //methods
    //*******************************
    //input:    String
    //output:   N/A
    //purpose:  set relationshipStatus attribute
    //*******************************
    public void setRelationshipStatus (String relationshipstatus) {
        relationshipStatus = relationshipstatus;
    }
    
    public String getRelationshipStatus () {
        return relationshipStatus;
    }
    
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set isRomantic attribute
    //*******************************
    public void setIsRomantic (boolean isromantic) {
        isRomantic = isromantic;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return isRomantic attribute
    //*******************************
    public boolean getIsRomantic () {
        return isRomantic;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (isRomantic) {
            romancefortunes.add("Someone will give you roses.");
            romancefortunes.add("You will soon get unexpected kisses in unexpected places.");
            romancefortunes.add("You will have the best Valentine's Day of your life.");
            romancefortunes.add("The one you think about thinks about you.");
            romancefortunes.add("You will be successful in love.");
            romancefortunes.add("You won't be happy even if you are in a relationship.");
            romancefortunes.add("Your friend may turn out to be more than that.");
        }
        else if (relationshipStatus.equals("single")) {
            romancefortunes.add("You will find your true love.");
            romancefortunes.add("Your crush will ask you on a date.");
            romancefortunes.add("Tomorrow, you will meet the person of your dreams.");
            romancefortunes.add("There will be a happy romance for you shortly.");
            romancefortunes.add("You will find your partner soon.");
            romancefortunes.add("Your soon-to-be partner will tell you something important in the near future.");
        }
        else if (relationshipStatus.equals("taken")) {
            romancefortunes.add("Your partner is lying to you.");
            romancefortunes.add("You will marry your partner.");
            romancefortunes.add("You hvae found your true love.");
        }        
        else {            
            romancefortunes.add ("A good friendship is often more important than a passionate romance.");
        }        
    }      
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> romanceFortunes) {
        int index = new Random().nextInt(romanceFortunes.size());
        String random = romanceFortunes.get(index);  
        return random;
    };    
}
