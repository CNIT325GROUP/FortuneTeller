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
public class Education {
    //attributes
    boolean isStudent;
    int schoolYear;
    
    //methods
    public void setIsStudent (boolean isstudent) {
        isStudent = isstudent;
    }
    public boolean getIsStudent () {
        return isStudent;
    }
    public void setSchoolYear (int schoolyear) {
        schoolYear = schoolyear;
    }
    public int getSchoolYear () {
        return schoolYear;
    }
    
    //create arraylist of fortunes
    public static void main (String [] args) {
        ArrayList <String> educationfortunes = new ArrayList <> ();
        educationfortunes.add ("Your loans will suddenly disappear.");
        educationfortunes.add ("You will not graduate in 4 years.");
        educationfortunes.add ("You will change your major two more times before you find the one that is right for you.");
        educationfortunes.add ("You will go to graduate school.");
        educationfortunes.add ("Your major is not the best choice for you. ");        
    }
}
