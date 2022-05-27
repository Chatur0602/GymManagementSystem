package Customer;

import static Customer.CustomerIoHandler.*;
import Manager.ManagerDashboard;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* @author Nikhil */
public class AddCustomer extends javax.swing.JFrame {

    CustomerIoHandler CIH; 
    public AddCustomer() {
        allCustomers.clear();
        CIH = new CustomerIoHandler();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        addCustomerButton = new javax.swing.JButton();
        contactField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        FemaleRadioButton = new javax.swing.JRadioButton();
        MaleRadioButton = new javax.swing.JRadioButton();
        dateOfBirthDC = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Add Customer");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 170, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-exit-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 50, 30));

        nameField.setBackground(new java.awt.Color(0, 51, 102));
        nameField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        nameField.setForeground(new java.awt.Color(204, 204, 204));
        nameField.setToolTipText("Password");
        nameField.setBorder(null);
        nameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFieldFocusGained(evt);
            }
        });
        jPanel3.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 129, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 130, 10));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Phone No.");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 30));

        emailField.setBackground(new java.awt.Color(0, 51, 102));
        emailField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.setToolTipText("Password");
        emailField.setBorder(null);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
        });
        emailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailFieldActionPerformed(evt);
            }
        });
        jPanel3.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 129, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 130, 10));

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Email ID");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 80, 30));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 130, 10));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("D.O.B");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 60, 40));

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        contactField.setBackground(new java.awt.Color(0, 51, 102));
        contactField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        contactField.setForeground(new java.awt.Color(204, 204, 204));
        contactField.setToolTipText("Password");
        contactField.setBorder(null);
        jPanel3.add(contactField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 129, 20));

        jLabel16.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Gender");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 80, 20));

        genderGroup.add(FemaleRadioButton);
        FemaleRadioButton.setText("Female");
        FemaleRadioButton.setActionCommand("F");
        FemaleRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FemaleRadioButtonMouseClicked(evt);
            }
        });
        jPanel3.add(FemaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, -1));

        genderGroup.add(MaleRadioButton);
        MaleRadioButton.setText("Male");
        MaleRadioButton.setActionCommand("M");
        MaleRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MaleRadioButtonMouseClicked(evt);
            }
        });
        jPanel3.add(MaleRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 60, -1));
        jPanel3.add(dateOfBirthDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 130, -1));

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
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        CustomerManagement CM = new CustomerManagement();
        CM.show();

    }//GEN-LAST:event_backLabelMouseClicked

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldFocusGained

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldFocusGained

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed

        try {
                boolean characterFound = false;
                
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String dateString ;
                LocalDate DOB ;
                int Age;
                
                Pattern namePattern = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
                Matcher name = namePattern.matcher(nameField.getText());
                characterFound = name.find();
                
                if(characterFound == true || nameField.getText().length()<4){
                    JOptionPane.showMessageDialog(null,
                    "Incorrect Name format, Minimum 4 letters & no special characters or numbers allowed", "Warning",
                    JOptionPane.WARNING_MESSAGE);
                } else{
                    Pattern eMailPattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$");
                    Matcher eMail = eMailPattern.matcher(emailField.getText());
                    characterFound = eMail.find();

                    if(characterFound == false || emailField.getText().length()<8){
                        JOptionPane.showMessageDialog(null,
                        "Incorrect E-Mail format, Minimum 8 letters & must contain '@'", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                        
                    } else{
                        Pattern contactPattern = Pattern.compile("[^0-9]");
                        Matcher contact = contactPattern.matcher(contactField.getText());
                        characterFound = contact.find();
                        
                        if(characterFound == true || contactField.getText().length() != 10){
                            JOptionPane.showMessageDialog(null,
                        "Incorrect contact format, Must be 10 numeric digits long", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                        }else{
                            dateString = format.format(dateOfBirthDC.getDate());
                            DOB = LocalDate.parse(dateString, formatter);
                            Age = Period.between(DOB, LocalDate.now()).getYears();
                            
                            if(Age<18){
                                JOptionPane.showMessageDialog(null,
                            "Incorrect Age, Customer must be at least 18 years old", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                            }else{
                            
                            if(CustomerIoHandler.checkCustomer(emailField.getText(), contactField.getText()) == null){
                
                                String selection = genderGroup.getSelection().getActionCommand().toString();
                                char gender = selection.charAt(0);
                                int ID = 1 ;


                                for (Customer list : allCustomers) {
                                    ID = allCustomers.get(allCustomers.size() - 1).getID() + 1;
                            }

                                Customer c = new Customer(ID, nameField.getText(), emailField.getText(), contactField.getText(), dateOfBirthDC.getDate(), gender);
                                allCustomers.add(c);
                                addCustomer();

                                JOptionPane.showMessageDialog(null,
                                        "Customer Successfully Added", "Success",
                                        JOptionPane.INFORMATION_MESSAGE);

                                dispose();
                                CustomerManagement CM = new CustomerManagement();
                                CM.show();
                            }
                            else{
                                JOptionPane.showMessageDialog(null,
                                        "Customer Already Exists, Please Try Again", "Error",
                                        JOptionPane.WARNING_MESSAGE);
                
                            }
                        }                 
                    }
                }
            }
                
            
            
        } catch (IOException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,
                                        "Please make sure all the fields are filled", "Error",
                                        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void emailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailFieldActionPerformed

    private void MaleRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MaleRadioButtonMouseClicked
        
    }//GEN-LAST:event_MaleRadioButtonMouseClicked

    private void FemaleRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FemaleRadioButtonMouseClicked
        
    }//GEN-LAST:event_FemaleRadioButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddCustomer().setVisible(true); 
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton FemaleRadioButton;
    private javax.swing.JRadioButton MaleRadioButton;
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JLabel backLabel;
    private javax.swing.JTextField contactField;
    private com.toedter.calendar.JDateChooser dateOfBirthDC;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel exitLabel;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField nameField;
    // End of variables declaration//GEN-END:variables
}
