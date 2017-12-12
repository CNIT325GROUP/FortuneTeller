import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jaz
 */
public class FortuneTellerGUI extends javax.swing.JFrame {

    //global variables
    public String relationshipType;
    public String category;
    
    //instantiation of objects
    Career career = new Career();
    Education education = new Education();
    Health health = new Health();
    Hobbies hobbies = new Hobbies();
    Family family = new Family();
    Friend friend = new Friend();
    Romance romance = new Romance();
    
    /**
     * Creates new form FortuneTellerGUI
     */
    public FortuneTellerGUI() {
        initComponents();
        this.setLocationRelativeTo(null);        
    }

    public void setVisibilityAll() {
        lblQuestion1.setVisible(true);
        lblQuestion2.setVisible(true);
        txtQuestion1.setVisible(true);
        txtQuestion2.setVisible(true);  
        btnEnter.setVisible(true);      
    }
    
    public void setVisibilityQ1() {
        lblQuestion1.setVisible(true);
        txtQuestion1.setVisible(true);
        btnEnter.setVisible(true);       
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtQuestion1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        lblRelationshipType = new javax.swing.JLabel();
        cmbRelationshipType = new javax.swing.JComboBox<>();
        lblQuestion1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblQuestion2 = new javax.swing.JLabel();
        txtQuestion2 = new javax.swing.JTextField();
        btnGetFortune = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemRetry = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuItemRandomFortune = new javax.swing.JMenuItem();
        menuItemHoroscope = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(119, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Enter Name:");

        txtQuestion1.setMaximumSize(new java.awt.Dimension(6, 222));
        txtQuestion1.setName("txtQuestion1"); // NOI18N

        jLabel2.setText("Pick a category:");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Career", "Education", "Relationships", "Health", "Hobbies" }));
        cmbCategory.setName("cmbCategory"); // NOI18N
        cmbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCategoryItemStateChanged(evt);
            }
        });

        lblRelationshipType.setText("Relationship Type:");

        cmbRelationshipType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Family", "Friends", "Romance" }));
        cmbRelationshipType.setName("cmbCategory"); // NOI18N
        cmbRelationshipType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbRelationshipTypeItemStateChanged(evt);
            }
        });

        lblQuestion1.setText("jLabel3");

        txtName.setName("txtName"); // NOI18N

        lblQuestion2.setText("jLabel3");

        txtQuestion2.setMaximumSize(new java.awt.Dimension(6, 222));
        txtQuestion2.setName("txtQuestion1"); // NOI18N

        btnGetFortune.setText("Get Fortune!");
        btnGetFortune.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetFortuneActionPerformed(evt);
            }
        });

        btnEnter.setText("Enter");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        menuItemRetry.setText("Retry");
        menuItemRetry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRetryActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemRetry);

        menuItemExit.setText("Exit");
        menuItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemExitActionPerformed(evt);
            }
        });
        jMenu1.add(menuItemExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("More");

        menuItemRandomFortune.setText("Get Random Fortune");
        jMenu2.add(menuItemRandomFortune);

        menuItemHoroscope.setText("Get Horoscope");
        menuItemHoroscope.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemHoroscopeActionPerformed(evt);
            }
        });
        jMenu2.add(menuItemHoroscope);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblQuestion1)
                            .addComponent(lblQuestion2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblRelationshipType)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName)
                                    .addComponent(cmbCategory, 0, 170, Short.MAX_VALUE)
                                    .addComponent(cmbRelationshipType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(txtQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(btnEnter)
                            .addComponent(btnGetFortune))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRelationshipType)
                    .addComponent(cmbRelationshipType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(lblQuestion1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuestion2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEnter)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnGetFortune)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCategoryItemStateChanged
        
        if (cmbCategory.getSelectedItem() != null) {
           category = cmbCategory.getSelectedItem().toString();
        
            switch (category) {
                case "Career" :
                    setVisibilityAll();
                    lblQuestion1.setText("Do you currently have a career? (yes/no)");
                    lblQuestion2.setText("If so, what field is your career in?");
                    break;
                case "Education" :
                    setVisibilityAll();
                    lblQuestion1.setText("Are you a student? (yes/no)");
                    lblQuestion2.setText("What is your school year? (1/2/3/4)");
                    break;
                case "Relationships" :
                    lblRelationshipType.setVisible(true);
                    cmbRelationshipType.setVisible(true);
                    cmbRelationshipType.setSelectedIndex(-1);
                    break;
                case "Health" :
                    setVisibilityAll();
                    lblQuestion1.setText("Do you eat healthily? (yes/no)");
                    lblQuestion2.setText("Do you exercise regularly? (yes/no)");
                    break;
                case "Hobbies" :
                    setVisibilityQ1();
                    lblQuestion1.setText("What is your favorite hobby?");
                    break;
            } 
        }       
    }//GEN-LAST:event_cmbCategoryItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        lblRelationshipType.setVisible(false);
        cmbRelationshipType.setVisible(false);
        lblQuestion1.setVisible(false);
        lblQuestion2.setVisible(false);
        txtQuestion1.setVisible(false);
        txtQuestion2.setVisible(false);
        btnGetFortune.setVisible(false);
        cmbCategory.setSelectedIndex(-1);
        btnEnter.setVisible(false);        
    }//GEN-LAST:event_formWindowActivated

    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuItemExitActionPerformed

    private void menuItemRetryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRetryActionPerformed
        txtName.setText("");
        cmbCategory.setSelectedIndex(-1);
        lblRelationshipType.setVisible(false);
        cmbRelationshipType.setVisible(false);
        lblQuestion1.setVisible(false);
        lblQuestion2.setVisible(false);
        txtQuestion1.setVisible(false);
        txtQuestion2.setVisible(false);
        btnGetFortune.setVisible(false);
        btnEnter.setVisible(false);
    }//GEN-LAST:event_menuItemRetryActionPerformed

    private void cmbRelationshipTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRelationshipTypeItemStateChanged
        if (cmbRelationshipType.getSelectedItem() != null) {
            relationshipType = cmbRelationshipType.getSelectedItem().toString();                

            switch (relationshipType) {
                case "Family" :
                    setVisibilityQ1();
                    lblQuestion1.setText("Do you have siblings? (yes/no)");
                    break;
                case "Friends" :
                    setVisibilityAll();
                    lblQuestion1.setText("Are you a social person? (yes/no)");
                    lblQuestion2.setText("Do you have a best friend? (yes/no)");
                    break;
                case "Romance" :
                    setVisibilityAll();
                    lblQuestion1.setText("What is your relationship status? (single/taken)");
                    lblQuestion2.setText("Would you describe yourself as a romantic? (yes/no)");
                    break;
            }
        }
    }//GEN-LAST:event_cmbRelationshipTypeItemStateChanged

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        //can anyone think of a better way to do this???
        switch (category) {
            case "Career" :
                if (txtQuestion1.getText().equals("yes")) {
                    career.setHasCareer(true);
                }
                else {
                    career.setHasCareer(false);
                }                    
                career.setCareerType(txtQuestion2.getText().toUpperCase());
//                lblQuestion1.setText("Do you currently have a career? (yes/no)");
//                lblQuestion2.setText("If so, what field is your career in?");
                break;
            case "Education" :
                if (txtQuestion1.getText().equals("yes")) {
                    education.setIsStudent(true);
                }
                else {
                    education.setIsStudent(false);
                } 
                education.setSchoolYear(txtQuestion2.getText());
//                lblQuestion1.setText("Are you a student? (yes/no)");
//                lblQuestion2.setText("What is your school year? (1/2/3/4)");
                break;
            case "Relationships" : 
                switch (relationshipType) {
                    case "Family" :
                        if (txtQuestion1.getText().equals("yes")) {
                            family.setHasSiblings(true);
                        }
                        else {
                            family.setHasSiblings(false);
                        }                        
//                        lblQuestion1.setText("Do you have siblings? (yes/no)");
                        break;
                    case "Friends" :
                        if (txtQuestion1.getText().equals("yes")) {
                            friend.setIsSocial(true);
                        }
                        else {
                            friend.setIsSocial(false);
                        }
                        if (txtQuestion2.getText().equals("yes")) {
                            friend.setHasBestFriend(true);
                        }
                        else {
                            friend.setHasBestFriend(false);
                        }
//                        lblQuestion1.setText("Are you a social person? (yes/no)");
//                        lblQuestion2.setText("Do you have a best friend? (yes/no)");
                        break;
                    case "Romance" :                       
                        romance.setRelationshipStatus(txtQuestion1.getText().toUpperCase());
                        if (txtQuestion2.getText().equals("yes")) {
                            romance.setIsRomantic(true);
                        }
                        else {
                            romance.setIsRomantic(false);
                        }
//                        lblQuestion1.setText("What is your relationship status? (single/taken)");
//                        lblQuestion2.setText("Would you describe yourself as a romantic? (yes/no)");
                        break;
                }
            case "Health" :
                if (txtQuestion1.getText().equals("yes")) {
                    health.setEatsWell(true);
                }
                else {
                    health.setEatsWell(false);
                }
                if (txtQuestion2.getText().equals("yes")) {
                    health.setExercise(true);
                }
                else {
                    health.setExercise(false);
                }
//                lblQuestion1.setText("Do you eat healthily? (yes/no)");
//                lblQuestion2.setText("Do you exercise regularly? (yes/no)");
                break;
            case "Hobbies" :
                hobbies.setHobbyType(txtQuestion1.getText().toUpperCase());
//                lblQuestion1.setText("What is your favorite hobby?");
                break;
        } 
        
        btnGetFortune.setVisible(true);
    }//GEN-LAST:event_btnEnterActionPerformed

    private void btnGetFortuneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetFortuneActionPerformed
        switch (category) {
            //TODO implement case statements for each category
            case "Relationships" :  
                switch (relationshipType) {
                    //TODO implement case statements for each relationship type
                    case "Family" :
                        if (family.hasSiblings) {
                            ArrayList <String> siblingfortunes = new ArrayList <> ();
                            siblingfortunes.add("Your sibling(s) likes you.");
                            siblingfortunes.add("Your sibling(s) despises you.");
                            siblingfortunes.add("Your siblings(s) look up to you.");
                            siblingfortunes.add ("Your sibling(s) think you're beautiful.");
                            JOptionPane.showMessageDialog(null, family.getRandomFortune(siblingfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                        }  
                        else {
                            ArrayList <String> familyfortunes = new ArrayList <> ();
                            familyfortunes.add("Don’t worry about the stock market. Invest in family.");
                            familyfortunes.add("Your family has your best interests in mind.");
                            familyfortunes.add("You are a valuable asset to your family. ");
                            familyfortunes.add("Your family hates you. Your family has its difficulty. "); 
                            JOptionPane.showMessageDialog(null, family.getRandomFortune(familyfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                            
                        }
                        
                        break;
                    case "Romance" :
                        if (romance.isRomantic) {
                            ArrayList <String> romanticfortunes = new ArrayList <> ();
                            romanticfortunes.add("Someone will give you roses.");
                            romanticfortunes.add("You will soon get unexpected kisses in unexpected places.");
                            romanticfortunes.add("You will have the Valentine's day of your life.");
                            romanticfortunes.add("The one you think about thinks about you.");
                            JOptionPane.showMessageDialog (null, romance.getRandomFortune (romanticfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                        }
                        else
                        {
                            ArrayList <String> romancefortunes = new ArrayList <> ();
                            romancefortunes.add ("There will be a happy romance for you shortly.");
                            romancefortunes.add ("You will be successful in love.");
                            romancefortunes.add ("You will find your husband in college.");
                            romancefortunes.add ("You won't be happy even if you are in a relationship.");
                            romancefortunes.add ("A good friendship is often more important than a passionate romance");
                            romancefortunes.add ("Your friend may turn out to be more than that.");
                            romancefortunes.add ("Your soon-to-be partner will tell you something important in the near future."); 
                            JOptionPane.showMessageDialog (null, romance.getRandomFortune (romancefortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                        }
                        break;

                    case "Friends" :
                        if (friend.isSocial && friend.hasBestFriend) {
                            ArrayList <String> fortunes = new ArrayList <> ();
                            fortunes.add("Your social life is about to flourish.");
                            fortunes.add("You will connect with the right network of people.");
                            fortunes.add ("Your social network will bring prosperity to your future.");
                            fortunes.add ("Your social network is holding you back.");
                            fortunes.add ("Your social connections are going to be cut off.");
                            fortunes.add ("Your best friend is jealous of you.");
                            fortunes.add ("You're keeping your best friend closer...that may be a good thing for you.");
                            fortunes.add ("Your best friend looks up to you as a role model.");
                            fortunes.add ("You're not your best friend's best friend.");
                            fortunes.add ("Your best friend and you are like peas in a pod.");
                            fortunes.add ("Your best friend is the perfect friend for you.");
                            JOptionPane.showMessageDialog (null, friend.getRandomFortune (fortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                        }
                        else
                        {
                            ArrayList <String> friendfortunes = new ArrayList <> ();
                            friendfortunes.add ("A friend asks only for your time not your money.");
                            friendfortunes.add ("A chance meeting opens new doors to success and friendship.");
                            friendfortunes.add ("A stranger is a friend you have not spoken to yet.");
                            friendfortunes.add ("You will always be surrounded by true friends.");
                            friendfortunes.add ("Prosperity makes friends and adversity tries them.");
                            friendfortunes.add ("The worst of friends may become the worst of enemies, but you will always find yourself hanging on.");
                            friendfortunes.add ("Friendship is an ocean that you cannot see the bottom.");
                            friendfortunes.add ("Ask a friend to join you on your next voyage.");
                            friendfortunes.add ("Be a good friend and a fair enemy.");
                            friendfortunes.add ("Movies have pause buttons; friends do not.");
                            friendfortunes.add ("Old friends make best friends.");
                            friendfortunes.add ("A new friend helps you break out of an old routine.");
                            friendfortunes.add ("You will soon be surrounded by good friends and laughter.");
                            friendfortunes.add ("Everybody feels lucky for having you as a friend.");
                            JOptionPane.showMessageDialog (null, friend.getRandomFortune (friendfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);                            
                        }
                        break;
        }
                break;
            case "Career" : 
                if (career.hasCareer) {
                        ArrayList <String> career_fortunes = new ArrayList <> ();
                        career_fortunes.add("You are going to move up within your career.");
                        career_fortunes.add("You will soon be in another career field");
                        career_fortunes.add("Your boss wants to hire you.");
                        career_fortunes.add("Your boss wants to promote you.");
                        career_fortunes.add("You will soon be at the top.");
                        career_fortunes.add("Your coworkers despise you.");
                        career_fortunes.add("Your coworkers love you.");
                        career_fortunes.add("You produce great work.");
			JOptionPane.showMessageDialog (null, career.getRandomFortune (career_fortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                else 
                {
                    ArrayList <String> careerfortunes = new ArrayList <> ();
                    careerfortunes.add ("You will always be successful in whatever professional career.");
                    careerfortunes.add ("The big issues are work, career, or status right now.");
                    careerfortunes.add ("The possibility of a career change is near.");
                    careerfortunes.add ("You will become the best of whatever you choose.");
                    careerfortunes.add ("It may be time to look for a career.");
                    JOptionPane.showMessageDialog (null, career.getRandomFortune (careerfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            case "Education" : 
		if (education.isStudent) {
                    ArrayList <String> studentfortunes = new ArrayList <> ();
                    studentfortunes.add("You may be staying here longer than you expected.");
                    studentfortunes.add("Your GPA is very important.");
                    studentfortunes.add ("Listen to yourself, not your parents.");
                    studentfortunes.add ("Your loans will suddenly disappear.");
                    studentfortunes.add ("You will not graduate in 4 years.");
                    studentfortunes.add ("You will change your major two more times before you find the one that is right for you.");
                    studentfortunes.add ("You will go to graduate school.");
                    studentfortunes.add ("Your major is not the best choice for you. "); 
                    JOptionPane.showMessageDialog (null, education.getRandomFortune (studentfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    ArrayList <String> educationfortunes = new ArrayList <> ();
                    educationfortunes.add ("It may beneficial to begin applying for school.");
                    educationfortunes.add ("A degree does not make you intelligent.");
                    educationfortunes.add ("You are as educated as you want to be.");
                    educationfortunes.add ("The best teacher in life is experience.");
                    educationfortunes.add ("It feels good to not be in school."); 
                    JOptionPane.showMessageDialog (null, education.getRandomFortune (educationfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            case "Health" :
		if (health.eatsWell && health.doesExercise) {
                    ArrayList <String> fortunes = new ArrayList <> ();
                    fortunes.add("Do not forget your green veggies.");
                    fortunes.add ("Your body is thanking you for the healthy-eating habits.");
                    fortunes.add("Getting your vitamins and minerals from your food is much better than getting it from a pill.");
                    fortunes.add("Add more color to your plate");
                    fortunes.add ("Your heart is thanking you.");
                    fortunes.add ("Good health will be yours for a long time.");
                    fortunes.add ("Rest has a peaceful effect on your physical and emotional health.");
                    fortunes.add ("The secret of staying young is good health and lying about your age.");
                    fortunes.add ("You will enjoy good health, you will be surrounded by luxury.");
                    fortunes.add ("Travelling more often is important for your health and happiness.");
                    fortunes.add ("You need to go to the Co-Rec and work out to improve your health.");
                    fortunes.add ("Begin cooking more food at home instead of going out.");
                    fortunes.add ("A burger never hurt anyone. Did it?");
                    fortunes.add ("An apple a day keeps the doctor away... they say.");
                    fortunes.add ("It is time for a new exercise routine");
                    fortunes.add ("Weights build muscle.");
                    fortunes.add ("You are starting to slack off. You need to be dedicated to exercisng regularly.");
                    fortunes.add ("It is never a good idea to put too much strain on your body.");
                    fortunes.add ("Stretching before and after exercising are just as important as exercising.");
                    fortunes.add ("It may be time to get a trainer (or find a new one).");
                    fortunes.add ("Show those gains off.");
                    JOptionPane.showMessageDialog (null, health.getRandomFortune (fortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                else
                {
                    ArrayList <String> healthfortunes = new ArrayList <> ();
                    healthfortunes.add ("Good health will be yours for a long time.");
                    healthfortunes.add ("Rest has a peaceful effect on your physical and emotional health.");
                    healthfortunes.add ("The secret of staying young is good health and lying about your age.");
                    healthfortunes.add ("You will enjoy good health, you will be surrounded by luxury.");
                    healthfortunes.add ("Travelling more often is important for your health and happiness.");
                    healthfortunes.add ("You need to go to the Co-Rec and work out to improve your health.");
                    healthfortunes.add ("Begin cooking more food at home instead of going out.");
                    healthfortunes.add ("A burger never hurt anyone. Did it?");
                    healthfortunes.add ("An apple a day keeps the doctor away... they say.");
                    JOptionPane.showMessageDialog (null, health.getRandomFortune (healthfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                break;
            case "Hobbies" :
		{
                    ArrayList <String> hobbiesfortunes = new ArrayList <> ();
                    hobbiesfortunes.add ("You will be given the chance to take part in an exciting adventure.");
                    hobbiesfortunes.add ("To make your dreams real, first you need to have them.");
                    hobbiesfortunes.add ("Your favorite activity will bring you financial prosperity.");
                    hobbiesfortunes.add ("You're wasting your time investing in that hobby. ");
                    hobbiesfortunes.add ("You will gain valuable skills from doing what you love.");
                    JOptionPane.showMessageDialog (null, hobbies.getRandomFortune (hobbiesfortunes), "Fortune", JOptionPane.PLAIN_MESSAGE);
                }
                break;
        }
    }//GEN-LAST:event_btnGetFortuneActionPerformed

    private void menuItemHoroscopeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemHoroscopeActionPerformed
        JFrame mForm = new HoroscopeGUI();
        mForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mForm.setVisible(true);
    }//GEN-LAST:event_menuItemHoroscopeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FortuneTellerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FortuneTellerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FortuneTellerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FortuneTellerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FortuneTellerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnGetFortune;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbRelationshipType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblQuestion1;
    private javax.swing.JLabel lblQuestion2;
    private javax.swing.JLabel lblRelationshipType;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemHoroscope;
    private javax.swing.JMenuItem menuItemRandomFortune;
    private javax.swing.JMenuItem menuItemRetry;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQuestion1;
    private javax.swing.JTextField txtQuestion2;
    // End of variables declaration//GEN-END:variables
}
