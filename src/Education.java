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
    public ArrayList <String> educationfortunes = new ArrayList <> ();
    
    //methods
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set isStudent attribute
    //*******************************
    public void setIsStudent (boolean isstudent) {
        isStudent = isstudent;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return isStudent attribute
    //*******************************
    public boolean getIsStudent () {
        return isStudent;
    }
    
    //*******************************
    //input:    String
    //output:   N/A
    //purpose:  set hasCareer attribute
    //*******************************
    public void setSchoolYear (String schoolyear) {
        schoolYear = schoolyear;
    }
    
    //*******************************
    //input:    N/A
    //output:   String
    //purpose:  return schoolYear attribute
    //*******************************
    public String getSchoolYear () {
        return schoolYear;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (isStudent) {
            educationfortunes.add("You may be staying here longer than you expected.");
            educationfortunes.add("Your GPA is very important.");
            educationfortunes.add("Listen to yourself, not your parents.");
            educationfortunes.add("Your loans will suddenly disappear.");
            educationfortunes.add("You will change your major two more times before you find the one that is right for you.");
            educationfortunes.add("Your major is not the best choice for you. "); 
        }
        if (schoolYear.equals("4")) {
            educationfortunes.add("You will not graduate in 4 years.");
            educationfortunes.add("You will go to graduate school.");
            educationfortunes.add("Your senior year will be your most difficult.");
        }
        else {            
            educationfortunes.add("It may beneficial to begin applying for school.");
            educationfortunes.add("A degree does not make you intelligent.");
            educationfortunes.add("You are as educated as you want to be.");
            educationfortunes.add("The best teacher in life is experience.");
            educationfortunes.add("It feels good to not be in school."); 
        }
    }
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> educationFortunes) {
        int index = new Random().nextInt(educationFortunes.size());
        String random = educationFortunes.get(index);  
        return random;
    }; 
}
