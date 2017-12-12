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
public class Education extends Category implements IRandom {
    //attributes
    boolean isStudent;
    String schoolYear;
    public static ArrayList <String> educationfortunes = new ArrayList <> ();
    //methods
    public void setIsStudent (boolean isstudent) {
        isStudent = isstudent;
    }
    public boolean getIsStudent () {
        return isStudent;
    }
    public void setSchoolYear (String schoolyear) {
        schoolYear = schoolyear;
    }
    public String getSchoolYear () {
        return schoolYear;
    }
    //interface method
    public String getRandomFortune (java.util.ArrayList<String> educationFortunes) {
        educationfortunes = educationFortunes;
        int index = new Random().nextInt(educationfortunes.size());
        String random = educationfortunes.get(index);  
        return random;
    };       

    //create arraylist of fortunes
    public static void main (String [] args) {
  
        educationfortunes.add ("Your loans will suddenly disappear.");
        educationfortunes.add ("You will not graduate in 4 years.");
        educationfortunes.add ("You will change your major two more times before you find the one that is right for you.");
        educationfortunes.add ("You will go to graduate school.");
        educationfortunes.add ("Your major is not the best choice for you. ");        
    }
}
