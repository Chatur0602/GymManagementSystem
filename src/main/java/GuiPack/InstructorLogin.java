package GuiPack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
<<<<<<< HEAD
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*; 
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/* @author Nikhil */
public class InstructorLogin extends javax.swing.JFrame {
=======

/* @author Nikhil */
public class AdminLogin extends javax.swing.JFrame {
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

    /**
     * Creates new form FirstGui
     */
<<<<<<< HEAD
    public InstructorLogin() {
=======
    public AdminLogin() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lockIcon = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        exitLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(153, 0, 102));

        jLabel4.setFont(new java.awt.Font("Rage Italic", 1, 36)); // NOI18N
        jLabel4.setText("SlymGym");

<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/external-exercise-sleep-photo3ideastudio-lineal-color-photo3ideastudio.png"))); // NOI18N

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-back-24.png"))); // NOI18N
=======
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\external-exercise-sleep-photo3ideastudio-lineal-color-photo3ideastudio.png")); // NOI18N

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\external-exercise-sleep-photo3ideastudio-lineal-color-photo3ideastudio.png")); // NOI18N

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
<<<<<<< HEAD
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\external-exercise-sleep-photo3ideastudio-lineal-color-photo3ideastudio.png")); // NOI18N

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-back-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backLabel)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(57, 57, 57))
        );

<<<<<<< HEAD
        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
=======
        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
<<<<<<< HEAD
        jLabel1.setText("Instructor Login");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 180, -1));

        usernameField.setBackground(new java.awt.Color(0, 153, 51));
=======
        jLabel1.setText("Admin Login");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 140, -1));

        usernameField.setBackground(new java.awt.Color(0, 51, 102));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        usernameField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setText("Username");
        usernameField.setToolTipText("Password");
        usernameField.setBorder(null);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });
        jPanel3.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 129, 20));

<<<<<<< HEAD
        passwordField.setBackground(new java.awt.Color(0, 153, 51));
=======
        passwordField.setBackground(new java.awt.Color(0, 51, 102));
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        passwordField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(204, 204, 204));
        passwordField.setText("Password");
        passwordField.setBorder(null);
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 129, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 130, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 130, 10));

<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
        lockIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-lock-24.png"))); // NOI18N
        jPanel3.add(lockIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-user-24.png"))); // NOI18N
=======
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        lockIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-lock-24.png")); // NOI18N
        jPanel3.add(lockIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        userIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-user-24.png")); // NOI18N
<<<<<<< HEAD
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
        lockIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-lock-24.png")); // NOI18N
        jPanel3.add(lockIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, 30));

        userIcon.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-user-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        jPanel3.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 30, 30));

        loginButton.setBackground(new java.awt.Color(204, 102, 0));
        loginButton.setText("Sign In");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
<<<<<<< HEAD
        jPanel3.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
<<<<<<< HEAD:src/main/java/GuiPack/InstructorLogin.java
        exitLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconPack/icons8-exit-24.png"))); // NOI18N
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine):src/main/java/Instructor/InstructorLogin.java
=======
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel3.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 80, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\IconPack\\icons8-exit-24.png")); // NOI18N
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        passwordField.setText("");
        passwordField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_passwordFieldFocusGained

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
       usernameField.setText("");
       usernameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
       usernameField.setForeground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_usernameFieldFocusGained

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
<<<<<<< HEAD
            
            String usernameInput = usernameField.getText();
            String passwordInput = passwordField.getText();
            String[] sArray = null ;
            String s ;
            boolean loginStatus = false ;
            
            try {
            Scanner in = new Scanner(new File("C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\TextPack\\Instructor Credentials.txt"));
            while (in.hasNextLine())
            {
            s = in.nextLine();
            sArray = s.split(",");
            
            System.out.println(sArray[0]+" "+sArray[1]);
            System.out.println(usernameInput +" "+passwordInput);
            
            if (sArray[0].equals(usernameInput) && sArray[1].equals(passwordInput))
                {
                JOptionPane.showMessageDialog(null,
                "Login Successful, Welcome " + sArray[0], "Success",
                JOptionPane.INFORMATION_MESSAGE);

                dispose();
                InstructorDashboard ID = new InstructorDashboard();
                ID.show();
                loginStatus = true;
                break;
                }           
            }
            
            if (loginStatus == false) {
                JOptionPane.showMessageDialog(null,"Incorrect Password!","Alert",JOptionPane.WARNING_MESSAGE);
            }
            
            in.close();
        }   catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null,
                "User Not Found", "Error",
                JOptionPane.ERROR_MESSAGE);
                }
      
        
         
            
           
     
     
     
            
=======

            dispose();
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
 
    }//GEN-LAST:event_loginButtonMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        
<<<<<<< HEAD
        dispose();
        LaunchPanel LP = new LaunchPanel();
        LP.show();
            
    }//GEN-LAST:event_backLabelMouseClicked

=======
            dispose();
            LaunchPanel LP = new LaunchPanel();
            LP.show();
            
    }//GEN-LAST:event_backLabelMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
         String userValue = usernameField.getText();        //get user entered username from the textField1  
        String passValue = passwordField.getText();        //get user entered pasword from the textField2  
          
        //check whether the credentials are authentic or not  
        if (userValue.equals("admin") && passValue.equals("nimda")) {
            dispose();
            AdminDashboard AD = new AdminDashboard();
            AD.show();
        }
        
        else{
             JOptionPane.showMessageDialog(null,"Incorrect Password!","Alert",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_loginButtonActionPerformed

>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
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
<<<<<<< HEAD
            java.util.logging.Logger.getLogger(InstructorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstructorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstructorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstructorLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
=======
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
<<<<<<< HEAD
                new InstructorLogin().setVisible(true);
            }
        });    
}

=======
                new AdminLogin().setVisible(true);
            }
        });
     
    }
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lockIcon;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel userIcon;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
<<<<<<< HEAD

=======
>>>>>>> parent of 7e27438 (Finally fucking done, I made the seperate packages as well, all runs fine)
