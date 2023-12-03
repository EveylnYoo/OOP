/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author
 */
public class CoursesGUI extends javax.swing.JFrame {

    /**
     * Creates new form ApplicationGUI
     */
    public CoursesGUI() {
        initComponents();

        // Add a listener for lsit selection
        // code adapted from StackOverflow: https://stackoverflow.com/questions/32922623/java-swing-how-to-detect-a-list-selection-event
        courseList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                String selectedCourse = courseList.getSelectedValue();
                displayCourseDetails(selectedCourse);
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcomeLbl = new javax.swing.JLabel();
        welcomeTxtLbl = new javax.swing.JLabel();
        searchBox = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        courseList = new javax.swing.JList<>();
        selectedCourseLbl = new javax.swing.JLabel();
        selectedCourseTxt = new javax.swing.JLabel();
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

        welcomeLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        welcomeLbl.setText("Welcome to the Courses Page!");

        welcomeTxtLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        welcomeTxtLbl.setText("  Feel free to browse our availabel courses!");

        searchBtn.setText("Search");

        courseList.setFont(new java.awt.Font("Helvetica Neue", 0, 15)); // NOI18N
        courseList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = {
                "Object Orientated Programming",
                "Web Application Development",
                "Advanced Databases",
                "Data Communications & Networking"
            };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(courseList);

        selectedCourseLbl.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        selectedCourseLbl.setText("Selected Course");

        selectedCourseTxt.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N

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
                .addGap(157, 157, 157)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(welcomeTxtLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(welcomeLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(161, 161, 161))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(searchBtn))
                            .addComponent(selectedCourseTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(163, 163, 163))))
            .addGroup(layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(selectedCourseLbl)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(welcomeLbl)
                .addGap(18, 18, 18)
                .addComponent(welcomeTxtLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(selectedCourseLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedCourseTxt)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(CoursesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CoursesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CoursesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CoursesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CoursesGUI().setVisible(true);
            }
        });
    }

    /*
     * List Selection
     */
    // Add a ListSelectionListener to the course list
    private void displayCourseDetails(String courseName) {
//        selectedCourseTxt.setText(courseName);
        if (courseName == "Object Orientated Programming") {
            selectedCourseTxt.setText("Course name: Object Orientated Programming\nCourse Times: Mon: 12:00-14:00, Tue: 10:00-12:00\nSpaces:25");
        } else if (courseName == "Web Application Development") {
            selectedCourseTxt.setText("Course name: Web Application Development\nCourse Times: Wed: 14:00-16:00, Mon: 12:00-15:00\nSpaces: 20");
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> courseList;
    private javax.swing.JMenu coursesF;
    private javax.swing.JMenuItem coursesItem;
    private javax.swing.JMenuItem donationItem;
    private javax.swing.JMenuItem feedbackItem;
    private javax.swing.JMenu feedbackT;
    private javax.swing.JMenu homeF;
    private javax.swing.JMenuItem homeItem;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuBar navBar;
    private javax.swing.JMenu schoolF;
    private javax.swing.JMenuItem schoolItem;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchBtn;
    private javax.swing.JLabel selectedCourseLbl;
    private javax.swing.JLabel selectedCourseTxt;
    private javax.swing.JMenuItem teacherItem;
    private javax.swing.JLabel welcomeLbl;
    private javax.swing.JLabel welcomeTxtLbl;
    // End of variables declaration//GEN-END:variables
}
