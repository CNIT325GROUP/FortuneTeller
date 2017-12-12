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
public class Friend extends Relationship implements IRandom {
    //attributes
    boolean isSocial;
    boolean hasBestFriend;
    public static ArrayList <String> friendfortunes = new ArrayList <> ();
    //methods
    public void setIsSocial (boolean issocial) {
        isSocial = issocial;
    } 
    public boolean getIsSocial () {
        return isSocial;
    } 
    public void setHasBestFriend (boolean hasbestfriend) {
        hasBestFriend = hasbestfriend;
    }
    public boolean getHasBestFriend () {
        return hasBestFriend;
    }
    //interface methods
    public String getRandomFortune (java.util.ArrayList<String> friendFortunes) {
        friendfortunes = friendFortunes;
        int index = new Random().nextInt(friendfortunes.size());
        String random = friendfortunes.get(index);  
        return random;
    }; 
}
