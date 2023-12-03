/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;

/**
 *
 * @author joshokeeffe
 */
public class ProjectGUI extends javax.swing.JFrame {

    /**
     * Creates new form ProjectGUI
     */
    public ProjectGUI() {
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

        projectLbl = new javax.swing.JLabel();
        coursesBtn = new javax.swing.JButton();
        voluntierTeacherBtn = new javax.swing.JButton();
        dashboardBtn = new javax.swing.JButton();
        introductionLbl = new javax.swing.JLabel();
        notificationBtn = new javax.swing.JButton();
        loginBtn = new javax.swing.JButton();
        signupBtn = new javax.swing.JButton();
        DonateBtm = new javax.swing.JButton();
        applicationBtn1 = new javax.swing.JButton();
        feedbackBtn = new javax.swing.JButton();
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
        setMaximumSize(new java.awt.Dimension(600, 450));
        setMinimumSize(new java.awt.Dimension(600, 450));

        projectLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        projectLbl.setText("Project");

        coursesBtn.setText("Courses");
        coursesBtn.setMinimumSize(new java.awt.Dimension(600, 450));
        coursesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coursesBtnActionPerformed(evt);
            }
        });

        voluntierTeacherBtn.setText("Volunteer");
        voluntierTeacherBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voluntierTeacherBtnActionPerformed(evt);
            }
        });

        dashboardBtn.setText("Dashboard");

        introductionLbl.setText("[Picture]     Introduction goes here");

        notificationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/notification.png"))); // NOI18N
        notificationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notificationBtnActionPerformed(evt);
            }
        });

        loginBtn.setText("Log In");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        signupBtn.setText("Sign Up");
        signupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupBtnActionPerformed(evt);
            }
        });

        DonateBtm.setText("Donate");
        DonateBtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonateBtmActionPerformed(evt);
            }
        });

        applicationBtn1.setText("Application");
        applicationBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applicationBtn1ActionPerformed(evt);
            }
        });

        feedbackBtn.setText("Feedback");
        feedbackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                feedbackBtnActionPerformed(evt);
            }
        });

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
                .addGap(265, 265, 265)
                .addComponent(projectLbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(introductionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(loginBtn)
                                        .addGap(18, 18, 18)
                                        .addComponent(signupBtn))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(feedbackBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(applicationBtn1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(DonateBtm, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(coursesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dashboardBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(voluntierTeacherBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(notificationBtn)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notificationBtn)
                .addGap(4, 4, 4)
                .addComponent(projectLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dashboardBtn)
                    .addComponent(DonateBtm)
                    .addComponent(coursesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(applicationBtn1)
                    .addComponent(voluntierTeacherBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(feedbackBtn)
                .addGap(12, 12, 12)
                .addComponent(introductionLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginBtn)
                    .addComponent(signupBtn))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // APPLICATION BUTTON
    private void voluntierTeacherBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voluntierTeacherBtnActionPerformed
        TeacherGUI newApplication = new TeacherGUI();
        
        newApplication.setVisible(true);
        
        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_voluntierTeacherBtnActionPerformed

    private void notificationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notificationBtnActionPerformed
        // TODO add your handling code here:
        SubscribeGUI newSubscribe = new SubscribeGUI();
        
        newSubscribe.setVisible(true);
        
        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_notificationBtnActionPerformed

    // sign up button
    private void signupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupBtnActionPerformed
        // create an instance of the sign up gui
        SignupGUI newSignUp = new SignupGUI();
        
        // make the sign up screen visible
        newSignUp.setVisible(true);
        
        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_signupBtnActionPerformed

    // login button
    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // create an instance of the sign up gui
        LoginGUI newLogin = new LoginGUI();
        
        // make the sign up screen visible
        newLogin.setVisible(true);
        
        // close the project gui screen
        this.dispose();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void coursesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coursesBtnActionPerformed
        // create  a new instance of the Courses GUI
        CoursesGUI appGUI = new CoursesGUI();
        
        // make the new ui appear
        appGUI.setVisible(true);
        
        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_coursesBtnActionPerformed
    //Donation Button
    private void DonateBtmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonateBtmActionPerformed
         // create  a new instance of the Donation GUI
        DonationGUI newDonation = new DonationGUI();
        
        // make the new ui appear
        newDonation.setVisible(true);
        
        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_DonateBtmActionPerformed

    private void applicationBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applicationBtn1ActionPerformed
         // create  a new instance of the Application GUI
        ApplicationGUI newApplication = new ApplicationGUI();
        
        // make the new ui appear
        newApplication.setVisible(true);
        
        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_applicationBtn1ActionPerformed

    private void feedbackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_feedbackBtnActionPerformed
         // create  a new instance of the Donation GUI
        FeedbackGUI newFeedback = new FeedbackGUI();
        
        // make the new ui appear
        newFeedback.setVisible(true);
        
        // close the Project GUI
        this.dispose();
    }//GEN-LAST:event_feedbackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DonateBtm;
    private javax.swing.JButton applicationBtn1;
    private javax.swing.JButton coursesBtn;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JButton dashboardBtn;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JButton feedbackBtn;
    private javax.swing.JMenuItem feedbackItem;
    private javax.swing.JMenu feedbackT;
    private javax.swing.JMenu homeF;
    private javax.swing.JMenuItem homeItem;
    private javax.swing.JLabel introductionLbl;
    private javax.swing.JButton loginBtn;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JButton notificationBtn;
    private javax.swing.JLabel projectLbl;
    private javax.swing.JMenu schoolF;
    private javax.swing.JMenuItem schoolItem;
    private javax.swing.JButton signupBtn;
    private javax.swing.JMenuItem teacherItem;
    private javax.swing.JButton voluntierTeacherBtn;
    // End of variables declaration//GEN-END:variables
}