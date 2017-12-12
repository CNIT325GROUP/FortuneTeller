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
    //create arraylist of fortunes
    public static void main (String [] args) {
        friendfortunes.add ("A friend asks only for your time not your money.");
        friendfortunes.add ("A chance meeting opens new doors to success and friendship.");
        friendfortunes.add ("A stranger is a friend you have not spoken to yet.");
        friendfortunes.add ("You will always be surrounded by true friends.");
        friendfortunes.add ("Prosperity makes friends and adversity tries them.");
        friendfortunes.add ("The worst of friends may become the worst of enemies, but you will always find yourself hanging on.");
        friendfortunes.add ("Friendship is an ocean that you cannot see the bottom.");
        friendfortunes.add ("Ask a friend to join you on your next voyage.");
        friendfortunes.add ("Be a good friend and a fair enemy.");
        friendfortunes.add ("Movies have pause buttons; friends do not.");
        friendfortunes.add ("Old friends make best friends.");
        friendfortunes.add ("A new friend helps you break out of an old routine.");
        friendfortunes.add ("You will soon be surrounded by good friends and laughter.");
        friendfortunes.add ("Everybody feels lucky for having you as a friend.");    
    }
}
