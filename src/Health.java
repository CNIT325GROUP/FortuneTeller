
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
public class Health extends Category implements IRandom {
    //attributes 
    boolean eatsWell;
    boolean doesExercise;
    public ArrayList <String> healthfortunes = new ArrayList <> ();    
    
    //methods    
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set eatsWell attribute
    //*******************************
    public void setEatsWell (boolean eatswell) {
        eatsWell = eatswell;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return eatsWell attribute
    //*******************************
    public boolean getEatsWell () {
        return eatsWell;
    }
    
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set exercise attribute
    //*******************************
    public void setExercise (boolean exercise) {
        doesExercise = exercise;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return exercise attribute
    //*******************************
    public boolean getExercise () {
        return doesExercise;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (eatsWell && doesExercise) {
            healthfortunes.add("Your body is thanking you for your healthy-eating habits.");
            healthfortunes.add("Your heart is thanking you.");
            healthfortunes.add("Good health will be yours for a long time.");
            healthfortunes.add("Rest has a peaceful effect on your physical and emotional health.");
            healthfortunes.add("The secret of staying young is good health and lying about your age.");
            healthfortunes.add("You will enjoy good health, you will be surrounded by luxury.");
            healthfortunes.add("A burger never hurt anyone. Did it?");
            healthfortunes.add("It is never a good idea to put too much strain on your body.");
            healthfortunes.add("Stretching before and after exercising are just as important as exercising.");
            healthfortunes.add("Show those gains off.");
        }
        else {
            healthfortunes.add("Do not forget your green veggies.");
            healthfortunes.add("Getting your vitamins and minerals from your food is much better than getting it from a pill.");
            healthfortunes.add("Add more color to your plate");
            healthfortunes.add("You need to go to the gym and work out to improve your health.");
            healthfortunes.add("Begin cooking more food at home instead of going out.");
            healthfortunes.add("An apple a day keeps the doctor away... they say.");
            healthfortunes.add("It is time for a new exercise routine");
            healthfortunes.add("Weights build muscle.");
            healthfortunes.add("You are starting to slack off. You need to be dedicated to exercisng regularly.");
            healthfortunes.add("It may be time to get a trainer (or find a new one).");            
        }
    }
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> healthFortunes) {
        int index = new Random().nextInt(healthFortunes.size());
        String random = healthFortunes.get(index);  
        return random;
    };  
}
