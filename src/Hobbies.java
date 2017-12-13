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
public class Hobbies extends Category implements IRandom {
    //attributes
    String hobbyType;
    public ArrayList <String> hobbiesfortunes = new ArrayList <> ();
    
    //methods
    //*******************************
    //input:    String
    //output:   N/A
    //purpose:  set hobbyType attribute
    //*******************************
    public void setHobbyType (String hobbytype) {
        hobbyType = hobbytype;
    }
    
    //*******************************
    //input:    N/A
    //output:   String
    //purpose:  return hobbyType attribute
    //*******************************
    public String getHobbyType () {
        return hobbyType;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        hobbiesfortunes.add ("You will be given the chance to take part in an exciting adventure.");
        hobbiesfortunes.add ("To make your dreams real, first you need to have them.");
        hobbiesfortunes.add (hobbyType + " will bring you financial prosperity.");
        hobbiesfortunes.add ("You're wasting your time investing in " + hobbyType + ".");
        hobbiesfortunes.add ("You will gain valuable skills from " + hobbyType + ".");
    }
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> hobbiesFortunes) {
        int index = new Random().nextInt(hobbiesFortunes.size());
        String random = hobbiesFortunes.get(index);  
        return random;
    }; 
}
