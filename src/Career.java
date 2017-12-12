
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class Career extends Category implements IRandom {
    //attributes
    boolean hasCareer;
    String careerType;
    public static ArrayList <String> careerfortunes = new ArrayList <> ();
    
    //methods
    public void setHasCareer (boolean hascareer) {
        hasCareer = hascareer;
    }
    public boolean getHasCareer () {
        return hasCareer;
    }
    public void setCareerType (String careertype) {
        careerType = careertype;
    }
    public String getCareerType () {
        return careerType;
    }
    
    //interface method
    public String getRandomFortune (java.util.ArrayList<String> careerFortunes) {
        careerfortunes = careerFortunes;
        int index = new Random().nextInt(careerfortunes.size());
        String random = careerfortunes.get(index);  
        return random;
    };       
    
    //create array of fortunes and add fortunes
    public static void main (String [] args) {        
        careerfortunes.add ("You will always be successful in your professional career.");
        careerfortunes.add ("The big issues are work, career, or status right now.");
        careerfortunes.add ("The possibility of a career change is near.");
        careerfortunes.add ("You will become the best of whatever you choose.");
    }
}
