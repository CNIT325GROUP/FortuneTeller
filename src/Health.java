
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
    public static ArrayList <String> healthfortunes = new ArrayList <> ();
    
    
    //methods
    
    public void setEatsWell (boolean eatswell) {
        eatsWell = eatswell;
    }
    public boolean getEatsWell () {
        return eatsWell;
    }
    public void setExercise (boolean exercise) {
        doesExercise = exercise;
    }
    public boolean getExercise () {
        return doesExercise;
    }
    //interface method
    public String getRandomFortune (java.util.ArrayList<String> healthFortunes) {
        healthfortunes = healthFortunes;
        int index = new Random().nextInt(healthfortunes.size());
        String random = healthfortunes.get(index);  
        return random;
    };  
}
