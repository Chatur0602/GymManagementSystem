package GuiPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* @author Nikhil */
<<<<<<< HEAD
<<<<<<< HEAD
public class InstructorDashboard extends javax.swing.JFrame {
=======
public class AdminDashboard extends javax.swing.JFrame {
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
public class AdminDashboard extends javax.swing.JFrame {
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

    /**
     * Creates new form FirstGui
     */
<<<<<<< HEAD
<<<<<<< HEAD
    public InstructorDashboard() {
=======
    public AdminDashboard() {
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
    public AdminDashboard() {
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
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

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
<<<<<<< HEAD
<<<<<<< HEAD
        instructorLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        crmLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        crmLabel = new javax.swing.JLabel();
        instructorLabel = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        crmLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        crmLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

<<<<<<< HEAD
<<<<<<< HEAD
        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
=======
        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
<<<<<<< HEAD
<<<<<<< HEAD
        jLabel1.setText("Instructor Dashboard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 250, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-lock-24.png"))); // NOI18N
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jLabel1.setText("Admin Dashboard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 210, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-back-24.png"))); // NOI18N
=======
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
        instructorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-update-user-64.png"))); // NOI18N
=======
        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-update-user-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-update-user-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-update-user-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, 70));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("  Update");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("  Profile");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 20));

<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorDashboard.java
        crmLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-appointment-64.png"))); // NOI18N
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-appointment-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-appointment-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-appointment-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorDashboard.java
        crmLabel2.setText("  ");
        jPanel3.add(crmLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, -1));
=======
=======
<<<<<<< HEAD:src/main/java/GuiPack/AdminDashboard.java
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
<<<<<<< HEAD:src/main/java/GuiPack/AdminDashboard.java
        crmLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-report-64.png")); // NOI18N
        crmLabel.setText("  ");
        jPanel3.add(crmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, 70));
=======
<<<<<<< HEAD
        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-update-user-64.png")); // NOI18N
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, 70));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/GuiPack/InstructorDashboard.java
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/GuiPack/InstructorDashboard.java
        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-update-user-64.png")); // NOI18N
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, 70));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/GuiPack/InstructorDashboard.java
=======
        crmLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-report-64.png")); // NOI18N
        crmLabel.setText("  ");
        jPanel3.add(crmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 70, 70));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-trainer-64.png")); // NOI18N
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("  Management");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 100, 20));

<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/AdminDashboard.java
=======
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/AdminDashboard.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        crmLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-customer-60.png")); // NOI18N
        jPanel3.add(crmLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText(" Instructor");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 20));

<<<<<<< HEAD
=======
<<<<<<< HEAD:src/main/java/GuiPack/AdminDashboard.java
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("  Customer");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 80, 20));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("  Management");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 100, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText(" Instructor");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 80, 20));
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/GuiPack/InstructorDashboard.java
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-appointment-64.png")); // NOI18N
        crmLabel2.setText("  ");
        jPanel3.add(crmLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 70, -1));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/GuiPack/InstructorDashboard.java
<<<<<<< HEAD
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Appointment");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 90, 20));
=======
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 20));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 90, 20));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("   Management");
<<<<<<< HEAD
<<<<<<< HEAD
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 100, 20));
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 20));

        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-appointment-64.png")); // NOI18N
        crmLabel2.setText("  ");
        jPanel3.add(crmLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 70, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Report");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 50, 20));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Generator");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 70, 20));
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.requestFocusInWindow();
        EventQueue.invokeLater(() -> jPanel1.requestFocusInWindow());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked

        dispose();
<<<<<<< HEAD
<<<<<<< HEAD
        InstructorLogin IL = new InstructorLogin();
        IL.show();
=======
        AdminLogin AD = new AdminLogin();
        AD.show();
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
        AdminLogin AD = new AdminLogin();
        AD.show();
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

    }//GEN-LAST:event_backLabelMouseClicked

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
<<<<<<< HEAD
=======
    
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
    
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
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
<<<<<<< HEAD
<<<<<<< HEAD
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
<<<<<<< HEAD
<<<<<<< HEAD
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
<<<<<<< HEAD
                new InstructorDashboard().setVisible(true);
            }
        });
     
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
                new AdminDashboard().setVisible(true);
            }
        });
       
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private javax.swing.JLabel crmLabel;
    private javax.swing.JLabel crmLabel1;
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
    private javax.swing.JLabel crmLabel;
    private javax.swing.JLabel crmLabel1;
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
    private javax.swing.JLabel crmLabel2;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel instructorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
<<<<<<< HEAD
<<<<<<< HEAD
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
