
import java.util.HashSet;
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
        jMenu2.add(menuItemHoroscope);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGetFortune)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnEnter)))
                .addGap(0, 0, Short.MAX_VALUE))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.LEADING, 0, 123, Short.MAX_VALUE)
                            .addComponent(cmbRelationshipType, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addComponent(txtQuestion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtQuestion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
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
                    //is there a better way to do this than repeat these 4 lines of code
                    //for every case statement??????
                    lblQuestion1.setVisible(true);
                    lblQuestion2.setVisible(true);
                    txtQuestion1.setVisible(true);
                    txtQuestion2.setVisible(true);
                    lblQuestion1.setText("Do you currently have a career? (yes/no)");
                    lblQuestion2.setText("If so, what field is your career in?");
                    break;
                case "Education" :
                    lblQuestion1.setVisible(true);
                    lblQuestion2.setVisible(true);
                    txtQuestion1.setVisible(true);
                    txtQuestion2.setVisible(true);
                    lblQuestion1.setText("Are you a student? (yes/no)");
                    lblQuestion2.setText("What is your school year? (1/2/3/4)");
                    break;
                case "Relationships" : 
                    lblRelationshipType.setVisible(true);
                    cmbRelationshipType.setVisible(true);
                    cmbRelationshipType.setSelectedIndex(-1);
                    break;
                case "Health" :
                    lblQuestion1.setVisible(true);
                    lblQuestion2.setVisible(true);
                    txtQuestion1.setVisible(true);
                    txtQuestion2.setVisible(true);
                    lblQuestion1.setText("Do you eat healthily? (yes/no)");
                    lblQuestion2.setText("Do you exercise regularly? (yes/no)");
                    break;
                case "Hobbies" :
                    lblQuestion1.setVisible(true);
                    txtQuestion1.setVisible(true);
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
    }//GEN-LAST:event_menuItemRetryActionPerformed

    private void cmbRelationshipTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbRelationshipTypeItemStateChanged
        if (cmbRelationshipType.getSelectedItem() != null) {
            relationshipType = cmbRelationshipType.getSelectedItem().toString();                

            switch (relationshipType) {
                case "Family" :
                    lblQuestion1.setVisible(true);
                    txtQuestion1.setVisible(true);
                    lblQuestion1.setText("Do you have siblings? (yes/no)");
                    break;
                case "Friends" :
                    lblQuestion1.setVisible(true);
                    lblQuestion2.setVisible(true);
                    txtQuestion1.setVisible(true);
                    txtQuestion2.setVisible(true);
                    lblQuestion1.setText("Are you a social person? (yes/no)");
                    lblQuestion2.setText("Do you have a best friend? (yes/no)");
                    break;
                case "Romance" :
                    lblQuestion1.setVisible(true);
                    lblQuestion2.setVisible(true);
                    txtQuestion1.setVisible(true);
                    txtQuestion2.setVisible(true);
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
            //implement case statements for each category
            case "Relationships" :  
                switch (relationshipType) {
                    //implement case statements for each relationship type
                    case "Family" :
                        if (family.hasSiblings) {
                            //add relevant fortunes to arraylist relating to class attribute                            
                            family.familyfortunes.add(0, "You will have a nephew.");
                            //FUTURE IMPLEMENTATION: could use IRandom here to randomize 
                            //what fortune is given instead of hard-coding an index (family.familyfortunes.get(0))                           
                            JOptionPane.showMessageDialog(null, family.familyfortunes.get(0), "Fortune", JOptionPane.PLAIN_MESSAGE);
                        }                        
                }
        }
    }//GEN-LAST:event_btnGetFortuneActionPerformed

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
