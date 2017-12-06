
import java.util.Random;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class FortuneTeller implements IRandom {
    //attributes
    String tellerLevel;
    
    //set and get methods
    public void setTellerLevel (String tellerlevel) {
        tellerLevel = tellerlevel;
    }
    public String getTellerLevel () {
        return tellerLevel;
    }
    
    //interface IRandom methods
    public String getRandomFortune (String [] arrayList) {
        int index = new Random().nextInt(arrayList.length);
        String random = (arrayList [index]);  
        return random;
    };
    public static void main(String[] args) {
//        JFrame mForm = new FortuneTellerGUI();
//        mForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mForm.setVisible(true);

        JFrame mForm = new LoginGUI();
        mForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mForm.setVisible(true);
    }
    
}
