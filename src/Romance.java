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
    public static ArrayList <String> romancefortunes = new ArrayList <> ();
    
    //methods
    public void setRelationshipStatus (String relationshipstatus) {
        relationshipStatus = relationshipstatus;
    }
    public String getRelationshipStatus () {
        return relationshipStatus;
    }
    public void setIsRomantic (boolean isromantic) {
        isRomantic = isromantic;
    }
    public boolean getIsRomantic () {
        return isRomantic;
    }
    public String getRandomFortune (java.util.ArrayList<String> romanceFortunes) {
        romancefortunes = romanceFortunes;
        int index = new Random().nextInt(romancefortunes.size());
        String random = romancefortunes.get(index);  
        return random;
    };    
    
    
    //create arraylist of fortunes
    public static void main (String [] args) {
    
        romancefortunes.add ("There will be a happy romance for you shortly.");
        romancefortunes.add ("You will be successful in love.");
        romancefortunes.add ("You will find your husband in college.");
        romancefortunes.add ("You will be single forever. ");
        romancefortunes.add ("A good friendship is often more important than a passionate romance");
        romancefortunes.add ("Your friend may turn out to be more than that.");
        romancefortunes.add ("Your partner will tell you something important in the near future.");    
    }
}
