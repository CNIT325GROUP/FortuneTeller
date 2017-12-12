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
}
