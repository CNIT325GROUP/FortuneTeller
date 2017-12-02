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
public class Hobbies extends Category {
    //attributes
    String hobbyType;
    
    //methods
    public void setHobbyType (String hobbytype) {
        hobbyType = hobbytype;
    }
    public String getHobbyType () {
        return hobbyType;
    }
    
    //create arraylist of fortunes
    public static void main (String [] args) {
        ArrayList <String> hobbiesfortunes = new ArrayList <> ();
        hobbiesfortunes.add ("You will be given the chance to take part in an exciting adventure.");
        hobbiesfortunes.add ("To make your dreams real, first you need to have them.");
        hobbiesfortunes.add ("Your favorite activity will bring you financial prosperity.");
        hobbiesfortunes.add ("You're wasting your time investing in that hobby. ");
        hobbiesfortunes.add ("You will gain valuable skills from doing what you love.");
    }
}
