package GuiPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* @author Nikhil */
public class AppointmentManagement extends javax.swing.JFrame {

    /**
     * Creates new form FirstGui
     */
    public AppointmentManagement() {
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
        crmLabel = new javax.swing.JLabel();
        instructorLabel = new javax.swing.JLabel();
        crmLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        crmLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText(" Appointment Management");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 310, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-exit-24.png"))); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-back-24.png"))); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
        crmLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-view-64.png"))); // NOI18N
        crmLabel.setText("  ");
        jPanel3.add(crmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 70));

        instructorLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-add-64.png"))); // NOI18N
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        crmLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-delete-64.png"))); // NOI18N
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
        crmLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-view-64.png")); // NOI18N
        crmLabel.setText("  ");
        jPanel3.add(crmLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 70, 70));

        instructorLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-add-64.png")); // NOI18N
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        crmLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-delete-64.png")); // NOI18N
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
        jPanel3.add(crmLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("  Delete");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 60, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("  Add");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 40, 20));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Edit");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, 30, 20));

<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
<<<<<<< HEAD:src/main/java/GuiPack/AppointmentManagement.java
        crmLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-edit-file-64.png"))); // NOI18N
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-edit-file-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-edit-file-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
=======
        crmLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\Resources\\icons8-edit-file-64.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Appointment/AppointmentManagement.java
        crmLabel2.setText("  ");
        jPanel3.add(crmLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 60, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Search & View");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 100, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        ManagerLogin ML = new ManagerLogin();
        ML.show();

    }//GEN-LAST:event_backLabelMouseClicked

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
            java.util.logging.Logger.getLogger(AppointmentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppointmentManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppointmentManagement().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel crmLabel;
    private javax.swing.JLabel crmLabel1;
    private javax.swing.JLabel crmLabel2;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel instructorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
