
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class Career extends Category {
    //attributes
    boolean hasCareer;
    String careerOpinion;
    
    //methods
    public void setHasCareer (boolean hascareer) {
        hasCareer = hascareer;
    }
    public boolean getHasCareer () {
        return hasCareer;
    }
    public void setCareerOpinion (String careeropinion) {
        careerOpinion = careeropinion;
    }
    public String getCareerOption () {
        return careerOpinion;
    }
    
    //create array of fortunes and add fortunes
    public static void main (String [] args) {
        ArrayList <String> careerfortunes = new ArrayList <> ();
        careerfortunes.add ("A friend asks only for your time not your money.");
        careerfortunes.add ("A chance meeting opens new doors to success and friendship.");
        careerfortunes.add ("A stranger is a friend you have not spoken to yet.");
        careerfortunes.add ("You will always be surrounded by true friends.");
        careerfortunes.add ("Prosperity makes friends and adversity tries them.");
        careerfortunes.add ("The worst of friends may become the worst of enemies, but you will always find yourself hanging on.");
        careerfortunes.add ("Friendship is an ocean that you cannot see the bottom.");
        careerfortunes.add ("Ask a friend to join on your next voyage");
        careerfortunes.add ("Be a good friend and a fair enemy.");
        careerfortunes.add ("Movies have pause buttons; friends do not.");
        careerfortunes.add ("Old friends make best friends.");
        careerfortunes.add ("A new friend helps you break out of an old routine.");
        careerfortunes.add ("You will soon be surrounded by good friends and laughter.");
        careerfortunes.add ("Everybody feels lucky for having you as a friend.");
    }
}
