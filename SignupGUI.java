/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

/**
 *
 * @author joshokeeffe
 */
public class SignupGUI extends javax.swing.JFrame {

    /**
     * Creates new form SignUp
     */
    public SignupGUI() {
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

        signupLbl = new javax.swing.JLabel();
        firstNameLbl = new javax.swing.JLabel();
        firstNameTxt = new javax.swing.JTextField();
        lastNameLbl = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        emailLbl = new javax.swing.JLabel();
        emailTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        loginLbl = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        navBar = new javax.swing.JMenuBar();
        homeF = new javax.swing.JMenu();
        homeItem = new javax.swing.JMenuItem();
        coursesF = new javax.swing.JMenu();
        coursesItem = new javax.swing.JMenuItem();
        schoolF = new javax.swing.JMenu();
        donationItem = new javax.swing.JMenuItem();
        schoolItem = new javax.swing.JMenuItem();
        teacherItem = new javax.swing.JMenuItem();
        feedbackT = new javax.swing.JMenu();
        feedbackItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        signupLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        signupLbl.setText("Sign Up");

        firstNameLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        firstNameLbl.setText("First Name:");

        firstNameTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTxtActionPerformed(evt);
            }
        });

        lastNameLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        lastNameLbl.setText("Last Name:");

        emailLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        emailLbl.setText("Email:");

        submitBtn.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        submitBtn.setText("Submit");

        loginLbl.setText("Already have an account?");

        loginBtn.setText("Log In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel1.setText("Password:");

        passwordField.setText("jPasswordField1");

        homeF.setText("Home");

        homeItem.setText("Home");
        homeItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeItemActionPerformed(evt);
            }
        });
        homeF.add(homeItem);

        navBar.add(homeF);

        coursesF.setText("Courses");

        coursesItem.setText("Courses");
        coursesItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesItemActionPerformed(evt);
            }
        });
        coursesF.add(coursesItem);

        navBar.add(coursesF);

        schoolF.setText("School");

        donationItem.setText("Donation");
        donationItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donationItemActionPerformed(evt);
            }
        });
        schoolF.add(donationItem);

        schoolItem.setText("School Application");
        schoolItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                schoolItemActionPerformed(evt);
            }
        });
        schoolF.add(schoolItem);

        teacherItem.setText("Voluntarily Teacher");
        teacherItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherItemActionPerformed(evt);
            }
        });
        schoolF.add(teacherItem);

        navBar.add(schoolF);

        feedbackT.setText("Feedback");

        feedbackItem.setText("Feedback");
        feedbackItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackItemActionPerformed(evt);
            }
        });
        feedbackT.add(feedbackItem);

        navBar.add(feedbackT);

        setJMenuBar(navBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(signupLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(firstNameLbl)
                            .addComponent(lastNameLbl)
                            .addComponent(emailLbl)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(lastNameTxt)
                            .addComponent(passwordField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(loginLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(submitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(loginBtn)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(signupLbl)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(firstNameLbl)
                    .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lastNameLbl)
                    .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(submitBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(loginLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginBtn)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTxtActionPerformed

    // log in button
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // create an instance of the sign up gui
        LoginGUI newLogin = new LoginGUI();
        
        // make the sign up screen visible
        newLogin.setVisible(true);
        
        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void homeItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeItemActionPerformed
        // TODO add your handling code here:
        ProjectGUI appGUI = new ProjectGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_homeItemActionPerformed

    private void coursesItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesItemActionPerformed
        // TODO add your handling code here:
        CoursesGUI appGUI = new CoursesGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_coursesItemActionPerformed

    private void donationItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donationItemActionPerformed
        // TODO add your handling code here:
        DonationGUI appGUI = new DonationGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_donationItemActionPerformed

    private void schoolItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_schoolItemActionPerformed
        // TODO add your handling code here:
        ApplicationGUI appGUI = new ApplicationGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_schoolItemActionPerformed

    private void teacherItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherItemActionPerformed
        // TODO add your handling code here:
        TeacherGUI appGUI = new TeacherGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_teacherItemActionPerformed

    private void feedbackItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackItemActionPerformed
        // TODO add your handling code here:
        FeedbackGUI appGUI = new FeedbackGUI();

        // make the new ui appear
        appGUI.setVisible(true);

        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_feedbackItemActionPerformed

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
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignupGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignupGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JLabel emailLbl;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JMenuItem feedbackItem;
    private javax.swing.JMenu feedbackT;
    private javax.swing.JLabel firstNameLbl;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JMenu homeF;
    private javax.swing.JMenuItem homeItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lastNameLbl;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JMenu schoolF;
    private javax.swing.JMenuItem schoolItem;
    private javax.swing.JLabel signupLbl;
    private javax.swing.JButton submitBtn;
    private javax.swing.JMenuItem teacherItem;
    // End of variables declaration//GEN-END:variables
}
