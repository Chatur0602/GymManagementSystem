package Booking;

import static Booking.BookingIoHandler.allBookings;
import Booking.BookingIoHandler.*;
import Customer.Customer;
import Customer.CustomerIoHandler;
import static Customer.CustomerIoHandler.allCustomers;
import Vehicle.Vehicle;
import Vehicle.VehicleIoHandler;
import static Vehicle.VehicleIoHandler.allVehicles;
import Admin.AdminDashboard;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import static java.lang.String.format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* @author Nikhil */
public class AddBooking extends javax.swing.JFrame {

    BookingIoHandler AIH ;
    CustomerIoHandler CIH ;
    VehicleIoHandler IIH ;
    private static String vReg = null;
    
    public AddBooking(){
        allBookings.clear();
        allCustomers.clear();
        allVehicles.clear();
        AIH = new BookingIoHandler() ;
        CIH = new CustomerIoHandler();
        IIH = new VehicleIoHandler();
        initComponents();
        
    String [] time = {"07:00", "07:30", "08:00", "08:30", "09:00", "09:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30", "17:00", "17:30", "18:00", "18:30", "19:00", "19:30", "20:00"};
    timeComboBox.setModel(new DefaultComboBoxModel(time));
    
    for (Customer list : allCustomers) {
            customerComboBox.addItem(list.getUsername());
        }
    
    for (Vehicle list : allVehicles){
            vehicleComboBox.addItem(list.getID() + " | " + list.getvReg());
        } 
    
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
        instructorLabel = new javax.swing.JLabel();
        crmLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        nameField1 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        vehicleComboBox = new javax.swing.JComboBox<>();
        timeComboBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        addAppointmentButton = new javax.swing.JButton();
        customerComboBox = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        appointmentDate = new com.toedter.calendar.JDateChooser();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        totalField = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        totalField1 = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Add  Booking");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 220, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-logout-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, 30));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-go-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(instructorLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));
        jPanel3.add(crmLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Name");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 50, 30));

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
        jPanel3.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 190, 20));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 190, 10));

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Customer");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 100, 20));

        nameField1.setBackground(new java.awt.Color(0, 51, 102));
        nameField1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        nameField1.setForeground(new java.awt.Color(204, 204, 204));
        nameField1.setToolTipText("Password");
        nameField1.setBorder(null);
        nameField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameField1FocusGained(evt);
            }
        });
        jPanel3.add(nameField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 129, 20));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 130, 10));

        vehicleComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                vehicleComboBoxItemStateChanged(evt);
            }
        });
        jPanel3.add(vehicleComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 160, -1));

        timeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        timeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeComboBoxActionPerformed(evt);
            }
        });
        jPanel3.add(timeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 90, -1));

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Days");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 70, 20));

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Car Reg No.");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 90, 20));

        addAppointmentButton.setText("Add Appointment");
        addAppointmentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAppointmentButtonActionPerformed(evt);
            }
        });
        jPanel3.add(addAppointmentButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jPanel3.add(customerComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 160, -1));

        jLabel9.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Pick up");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 70, 20));
        jPanel3.add(appointmentDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 30));

        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jPanel3.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 140, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel14.setText("TOTAL");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 90, 30));

        totalField.setBackground(new java.awt.Color(0, 153, 51));
        totalField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        totalField.setForeground(new java.awt.Color(204, 204, 204));
        totalField.setToolTipText("Password");
        totalField.setBorder(null);
        totalField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalFieldFocusGained(evt);
            }
        });
        jPanel3.add(totalField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 510, 190, 20));
        jPanel3.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 530, 190, 10));

        jLabel15.setBackground(new java.awt.Color(0, 0, 0));
        jLabel15.setFont(new java.awt.Font("Segoe Print", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("TOTAL");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 90, 20));

        totalField1.setBackground(new java.awt.Color(0, 51, 102));
        totalField1.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        totalField1.setForeground(new java.awt.Color(204, 204, 204));
        totalField1.setToolTipText("Password");
        totalField1.setBorder(null);
        totalField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                totalField1FocusGained(evt);
            }
        });
        jPanel3.add(totalField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 190, 20));
        jPanel3.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 190, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        BookingManagement AM = new BookingManagement();
        AM.show();

    }//GEN-LAST:event_backLabelMouseClicked

    private void nameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameFieldFocusGained

    private void nameField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameField1FocusGained

    
    private void addAppointmentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAppointmentButtonActionPerformed
    
        try {     
                boolean characterFound = false;
                Pattern namePattern = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
                Matcher name = namePattern.matcher(nameField.getText());
                characterFound = name.find();
                SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String dateString;
                LocalDate DOA ; 
              
                if(characterFound == true || nameField.getText().length()<4){
                    JOptionPane.showMessageDialog(null,
                    "Incorrect Name format, Minimum 4 letters & no special characters or numbers allowed", "Warning",
                    JOptionPane.WARNING_MESSAGE);
                } else{
                    dateString = format.format(appointmentDate.getDate());
                    DOA = LocalDate.parse(dateString, formatter);
                    
                    if(DOA.isBefore(LocalDate.now())){
                        JOptionPane.showMessageDialog(null,
                        "Incorrect Date, Can't book an appointment for the past", "Warning",
                        JOptionPane.WARNING_MESSAGE);
                    }else{
                
        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-yyyy");
        String date = dateForm.format(appointmentDate.getDate());
        String dateSlot = date + " " + timeComboBox.getSelectedItem().toString();
        SimpleDateFormat slotFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm");  
        Date slot = slotFormat.parse(dateSlot) ;
        
            if(BookingIoHandler.checkBooking(slotFormat.format(slot), vehicleComboBox.getSelectedItem().toString(), customerComboBox.getSelectedItem().toString(), jSpinner1.getValue().toString()) == null){

                int ID = 1 ;

                for (Booking list : allBookings) {
                    ID = allBookings.get(allBookings.size() - 1).getID() + 1;
                }
            
                Booking c = new Booking(ID, Integer.parseInt(jSpinner1.getValue().toString()), Integer.parseInt(totalField1.getText()), nameField.getText(), customerComboBox.getSelectedItem().toString(), vReg ,slot,'O');
                
                BookingIoHandler.allBookings.add(c);
                BookingIoHandler.addBooking();

                JOptionPane.showMessageDialog(null,
                        "Booking Successfully Added", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
                
                allCustomers.clear();
                allVehicles.clear();
                
                dispose();
                BookingManagement AM = new BookingManagement();
                AM.show();
                
                
            }
            else{
                JOptionPane.showMessageDialog(null,
                        "Booking Already Exists or Vehicle Busy, try a different Vehicle or Slot", "Error",
                        JOptionPane.WARNING_MESSAGE);
                
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(AddBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(AddBooking.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null,
                                        "Please make sure all the fields are filled", "Error",
                                        JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addAppointmentButtonActionPerformed

    private void timeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeComboBoxActionPerformed
       // System.out.println("Time: " + timeComboBox.getSelectedItem().toString());
    }//GEN-LAST:event_timeComboBoxActionPerformed

    private void vehicleComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_vehicleComboBoxItemStateChanged
 int dRate = 0;
        
        
        String vehicle = vehicleComboBox.getSelectedItem().toString();
        char vehicleID = vehicle.charAt(0);
        int vID = Character.getNumericValue(vehicleID);
        
        for (Vehicle list : allVehicles) {
            if(list.getID() == vID){
               
               dRate = list.getdRate();
               vReg = list.getvReg();
            }
        }
       
        
        
        int total = dRate * Integer.parseInt(jSpinner1.getValue().toString());
        totalField1.setText(Integer.toString(total));
        
    }//GEN-LAST:event_vehicleComboBoxItemStateChanged

    private void totalFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalFieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_totalFieldFocusGained

    private void totalField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_totalField1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_totalField1FocusGained

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        int dRate = 0;
        
        
        String vehicle = vehicleComboBox.getSelectedItem().toString();
        char vehicleID = vehicle.charAt(0);
        int vID = Character.getNumericValue(vehicleID);
        
        for (Vehicle list : allVehicles) {
            if(list.getID() == vID){
               
               dRate = list.getdRate();
               vReg = list.getvReg();
            }
        }
       
        
        
        int total = dRate * Integer.parseInt(jSpinner1.getValue().toString());
        totalField1.setText(Integer.toString(total));
        
    }//GEN-LAST:event_jSpinner1StateChanged
    
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
            java.util.logging.Logger.getLogger(AddBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AddBooking().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAppointmentButton;
    private com.toedter.calendar.JDateChooser appointmentDate;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel crmLabel1;
    private javax.swing.JComboBox<String> customerComboBox;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel instructorLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField nameField1;
    private javax.swing.JComboBox<String> timeComboBox;
    private javax.swing.JTextField totalField;
    private javax.swing.JTextField totalField1;
    private javax.swing.JComboBox<String> vehicleComboBox;
    // End of variables declaration//GEN-END:variables
}
