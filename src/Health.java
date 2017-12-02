
import java.util.ArrayList;
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
public class Health extends Category {
    //attributes 
    boolean eatsWell;
    String Exercise;
    String Stamina;
    
    //methods
    
    public void setEatsWell (boolean eatswell) {
        eatsWell = eatswell;
    }
    public boolean getEatsWell () {
        return eatsWell;
    }
    public void setExercise (String exercise) {
        Exercise = exercise;
    }
    public String getExercise () {
        return Exercise;
    }
    public void setStamina (String stamina) {
        Stamina = stamina;
    }
    
    //create arraylist for health and add to it
    public static void main (String [] args) {
        ArrayList <String> healthfortunes = new ArrayList<>();
        healthfortunes.add ("Good health will be yours for a long time.");
        healthfortunes.add ("Rest has a peaceful effect on your physical and emotional health.");
        healthfortunes.add ("The secret of staying young is good health and lying about your age.");
        healthfortunes.add ("You will enjoy good health, you will be surrounded by luxury.");
        healthfortunes.add ("Travelling more often is important for your health and happiness.");
        healthfortunes.add ("You need to go to the Co-Rec and work out to improve your health.");
        healthfortunes.add ("Begin cooking more food at home instead of going out.");          
    }
}
