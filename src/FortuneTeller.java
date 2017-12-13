
import java.util.Random;
import javax.swing.JFrame;
import java.io.*;
import java.net.*;
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
public class FortuneTeller  {
    //attributes
    String tellerLevel;
    
    
    //*******************************
    //input:    N/A
    //output:   N/A
    //purpose:  start authentication server to login to app
    //*******************************
    public static void startServer()
    {
        try
        {
            ServerSocket serverSock = new ServerSocket (1738);
            System.out.println("Server Started:");
            boolean over = false;            
            
            //put in a loop that keeps running
            while(!over)
            {
                Socket incoming = serverSock.accept();   //accept a connection from a client
                try
                {
                    System.out.println("Connection has been established");
                    
                    //the INPUT stream handler
                    InputStream inStream = incoming.getInputStream();
                    // the OUTPUT stream handler
                    OutputStream outStream = incoming.getOutputStream();
                    //setup of input
                    Scanner in = new Scanner(inStream);
                    //setup of output
                    PrintWriter out = new PrintWriter(outStream, true);
                    boolean done = false;
                    
                    //while there are lines to read, for this connection
                    while(!done && in.hasNextLine())
                    {
                        String lineIn = in.nextLine();
                        System.out.println("From Client: " + lineIn.trim());
                        
                        //send to client
                        //out.println("Server Received: " + lineIn.trim());
                        
                        //to kill the server, enter "pass" from the client
                        if(lineIn.trim().equals("pass"))
                        {
                            done = true;
                            over = true;
                            System.out.println("accepted pass");
                            out.println("correct");
                            break;
                        }
                        else {
                            out.println("wrong");
                            System.out.println("password is wrong");
                        }
                    }//end while !done && in.hasNextLine()
                }
                catch(Exception exc1)
                {
                    exc1.printStackTrace();
                }
                finally
                {
                    serverSock.close();
                }
            }
        }
        
        catch(Exception exc2)
        {
            exc2.printStackTrace();
        }
    }//end startServer()
    
   
    public static void main(String[] args) {
        //JFrame mForm = new FortuneTellerGUI();
        //mForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //mForm.setVisible(true);

        JFrame mForm = new LoginGUI();
        mForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mForm.setVisible(true);
        
        //start authentication server
        startServer();
        
    }
    
}
