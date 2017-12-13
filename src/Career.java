
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
    public ArrayList <String> careerfortunes = new ArrayList <> ();
    
    //methods
    //*******************************
    //input:    boolean
    //output:   N/A
    //purpose:  set hasCareer attribute
    //*******************************
    public void setHasCareer (boolean hascareer) {
        hasCareer = hascareer;
    }
    
    //*******************************
    //input:    N/A
    //output:   boolean
    //purpose:  return hasCareer attribute
    //*******************************
    public boolean getHasCareer () {
        return hasCareer;
    }
    
    //*******************************
    //input:    String
    //output:   N/A
    //purpose:  set careerType attribute
    //*******************************
    public void setCareerType (String careertype) {
        careerType = careertype;
    }
    
    //*******************************
    //input:    N/A
    //output:   String
    //purpose:  return careerType attribute
    //*******************************
    public String getCareerType () {
        return careerType;
    }
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  add all fortunes based on attributes 
    //*******************************
    public void addFortunes() {
        if (hasCareer) {
            careerfortunes.add("You are going to move up within your career.");
            careerfortunes.add("You will soon be in another career field.");
            careerfortunes.add("Your boss wants to promote you.");
            careerfortunes.add("You will soon be at the top.");
            careerfortunes.add("Your coworkers despise you.");
            careerfortunes.add("Your coworkers love you.");
            careerfortunes.add("You produce great work.");
            careerfortunes.add(careerType + " will not fulfill you.");
            careerfortunes.add("The possibility of a career change is near.");
            careerfortunes.add(careerType + " is not your true passion.");
        }
        else {
            careerfortunes.add("You will find a career soon.");
            careerfortunes.add("You will discover a career that is your passion.");
            careerfortunes.add("You will always be successful in whatever professional career you choose.");
            careerfortunes.add("The big issues are work, career, or status right now.");
            careerfortunes.add("You will become the best of whatever you choose.");
            careerfortunes.add("It may be time to look for a career.");
        }
    }
    
    //interface method
    //*******************************
    //input:    ArrayList<String>
    //output:   String
    //purpose:  utilize IRandom interface method to randomize fortune
    //*******************************
    public String getRandomFortune (java.util.ArrayList<String> careerFortunes) {
        int index = new Random().nextInt(careerFortunes.size());
        String random = careerFortunes.get(index);  
        return random;
    };
}
