package Appointment;

import Appointment.*;
import static Appointment.AppointmentIoHandler.addAppointment;
import static Appointment.AppointmentIoHandler.allAppointments;
import static Appointment.ViewAppointment.dataRow;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;


public class EditAppointment extends javax.swing.JFrame {
    public static String [] columnsName = {"Appointment ID", "Name", "Slot", "Customer Email", "Instructor Email", "Status"};
    public static String dataRow [] ;
    
    
    AppointmentIoHandler CIH; 
    public EditAppointment() {
        allAppointments.clear();
        CIH = new AppointmentIoHandler();
        initComponents(); 
        
        DefaultTableModel model = (DefaultTableModel)editAppointmentTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
        Format date =new SimpleDateFormat("dd-MM-yyyy HH:mm");
       
             for (Appointment list : allAppointments) {
               
                dataRow = new String[] {Integer.toString(list.getID()),list.getName(),date.format(list.getSlot()),list.getCustomerEmail(),list.getInstructorUsername(),Character.toString(list.getStatus())};
                model.addRow(dataRow);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        saveChangesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        editAppointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Edit Appointment");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 200, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-exit-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\pc\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        saveChangesButton.setText("Save Changes");
        saveChangesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveChangesButtonMouseClicked(evt);
            }
        });
        jPanel3.add(saveChangesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 520, 110, -1));

        editAppointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        editAppointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editAppointmentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(editAppointmentTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 920, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitLabelMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitLabelMouseClicked

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        dispose();
        AppointmentManagement CM= new AppointmentManagement();
        CM.show();
        allAppointments.clear();
    }//GEN-LAST:event_backLabelMouseClicked
    
    
    private void editAppointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editAppointmentTableMouseClicked

    }//GEN-LAST:event_editAppointmentTableMouseClicked

    private void saveChangesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesButtonMouseClicked
            allAppointments.clear();
        
            DefaultTableModel model = (DefaultTableModel)editAppointmentTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            String ID = null;
            String name = null;
            String d = null ;
            String cEmail = null;
            String iUsername = null ;
            String status ;
            Appointment a = null ; 
            boolean validated = false ;
            boolean characterFound = false;
            Date date = null;
            
            for (int rowCount = 0; rowCount < model.getRowCount(); rowCount++){
        
                    ID = model.getValueAt(rowCount, 0).toString();
                    name = model.getValueAt(rowCount, 1).toString();
                    d = model.getValueAt(rowCount, 2).toString() ;
                    cEmail = model.getValueAt(rowCount, 3).toString();
                    iUsername = model.getValueAt(rowCount, 4).toString();
                    status = model.getValueAt(rowCount, 5).toString().toUpperCase();
                    char s = status.charAt(0);
                    
                try{
                    //System.out.println(Id + " | " + name + " | " + eMail + " | " + contact + " | " + date + " | " + g);
                    
                    date = new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(d);
                
              
                Pattern idPattern = Pattern.compile("[^0-9]");
                Matcher id = idPattern.matcher(ID);
                characterFound = id.find();

                if(characterFound == true || Integer.parseInt(ID) == 0){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect Customer ID, Use numeric characters only", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                    validated = false;
                    break;
                }else{

                    Pattern namePattern = Pattern.compile("[^a-z ]", Pattern.CASE_INSENSITIVE);
                    Matcher cName = namePattern.matcher(name);
                    characterFound = cName.find();

                    if(characterFound == true || name.length()<4){
                        JOptionPane.showMessageDialog(null,
                                "Incorrect Name Format, Minimum 4 letters & no special characters or numbers allowed", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        validated = false ;
                        break;
                    } else{
                   
                            
                                Pattern eMailPattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                                        "[a-zA-Z0-9_+&*-]+)*@" +
                                        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                                        "A-Z]{2,7}$");
                                Matcher eMail = eMailPattern.matcher(cEmail);
                                characterFound = eMail.find();

                                if(characterFound == false || cEmail.length()<8){
                                    JOptionPane.showMessageDialog(null,
                                            "Incorrect E-Mail Format, Minimum 8 letters & must contain '@'", "Warning",
                                            JOptionPane.WARNING_MESSAGE);
                                    validated = false ;
                                    break;
                                } else{
                                            Pattern usernamePattern = Pattern.compile("[^a-z-0-9]", Pattern.CASE_INSENSITIVE);
                                            Matcher userName = usernamePattern.matcher(iUsername);
                                            characterFound = userName.find();
                                            if(characterFound == true || iUsername.length()<8){
                                                        JOptionPane.showMessageDialog(null,
                                                            "Incorrect Username Format, Minimum 8 letters & no special characters or numbers allowed", "Warning",
                                                            JOptionPane.WARNING_MESSAGE);
                                                    validated = false;
                                                    break;
                                                    }
                                                        else{
           
                                                        a = new Appointment(Integer.parseInt(ID), name, date, cEmail, iUsername, s);
                                                        AppointmentIoHandler.allAppointments.add(a);
                                                        validated = true ;
                   
                    
                    
                }}}}
                //System.out.println(ID + "\n");
                            
            
                
                
                } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,
                            "Please enter a valid Appointment ID", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                            validated = false ;
                            break;
                            
                } catch (ParseException e) {
                            JOptionPane.showMessageDialog(null,
                            "Incorrect Appointment Date Format", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                            validated = false ;
                            break;
                } 
            } 
            
            if(validated == true){
                    JOptionPane.showMessageDialog(null,
                        "Appointment Data Successfully Updated", "Success",
                        JOptionPane.INFORMATION_MESSAGE);

                   addAppointment();
                }
    }//GEN-LAST:event_saveChangesButtonMouseClicked

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
            java.util.logging.Logger.getLogger(EditAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditAppointment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAppointment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JTable editAppointmentTable;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveChangesButton;
    // End of variables declaration//GEN-END:variables
}
