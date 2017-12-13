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
    public ArrayList <String> friendfortunes = new ArrayList <> ();
    
    //methods
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set isSocial attribute
    //*******************************
    public void setIsSocial (boolean issocial) {
        isSocial = issocial;
    } 
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return isSocial attribute
    //*******************************
    public boolean getIsSocial () {
        return isSocial;
    } 
    
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set hasBestFriend attribute
    //*******************************
    public void setHasBestFriend (boolean hasbestfriend) {
        hasBestFriend = hasbestfriend;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return hasBestFriend attribute
    //*******************************
    public boolean getHasBestFriend () {
        return hasBestFriend;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (isSocial) {
            friendfortunes.add("Your social life is about to flourish.");
            friendfortunes.add("You will connect with the right network of people.");
            friendfortunes.add("Your social network will bring prosperity to your future.");
            friendfortunes.add("Your social network is holding you back.");
            friendfortunes.add("Your social connections are going to be cut off.");
        }
        else if (hasBestFriend) {
            friendfortunes.add("Your best friend is jealous of you.");
            friendfortunes.add("Your best friend and you are like peas in a pod.");
            friendfortunes.add("Your best friend is the perfect friend for you.");
            friendfortunes.add("You're keeping your best friend closer...that may be a good thing for you.");
            friendfortunes.add("Your best friend looks up to you as a role model.");
            friendfortunes.add("You're not your best friend's best friend.");            
        }
        else {
            friendfortunes.add("You need to find a best friend.");
            friendfortunes.add("You will lose all of your friends.");
            friendfortunes.add("You will gain new friends soon.");
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
    
    //interface methods
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> friendFortunes) {
        int index = new Random().nextInt(friendFortunes.size());
        String random = friendFortunes.get(index);  
        return random;
    }; 
}
