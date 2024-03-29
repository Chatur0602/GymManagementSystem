package Booking;

import static Booking.BookingIoHandler.allBookings;
import Admin.AdminDashboard;
import javax.swing.*;
import java.awt.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


/* @author Nikhil */
public class BookingManagement extends javax.swing.JFrame {

    BookingIoHandler AIH;
    public BookingManagement() {
        initComponents();
        allBookings.clear();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        exitLabel = new javax.swing.JLabel();
        backLabel = new javax.swing.JLabel();
        searchLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        deleteLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        editLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText(" Booking Management");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 260, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-logout-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 10, 30, 30));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-go-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-eye-64.png")); // NOI18N
        searchLabel.setText("  ");
        searchLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchLabelMouseClicked(evt);
            }
        });
        jPanel3.add(searchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 70, 70));

        addLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-add-new-64.png")); // NOI18N
        addLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addLabelMouseClicked(evt);
            }
        });
        jPanel3.add(addLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, -1, -1));

        deleteLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-remove-64.png")); // NOI18N
        deleteLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteLabelMouseClicked(evt);
            }
        });
        jPanel3.add(deleteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("  Delete");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, 60, 20));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jLabel9.setText("  Add");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 40, 20));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("Edit");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 30, 20));

        editLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-edit-file-64.png")); // NOI18N
        editLabel.setText("  ");
        editLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editLabelMouseClicked(evt);
            }
        });
        jPanel3.add(editLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Search & View");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 100, 20));

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
        AdminDashboard MD = new AdminDashboard();
        MD.show();


    }//GEN-LAST:event_backLabelMouseClicked

    private void addLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addLabelMouseClicked
        dispose();
        AddBooking AA = new AddBooking();
        AA.show();
    }//GEN-LAST:event_addLabelMouseClicked

    private void deleteLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteLabelMouseClicked
     try{
        String Id = JOptionPane.showInputDialog("Enter the ID of the Booking you'd like to Delete");
        int ID = Integer.parseInt(Id);
        
        AIH = new BookingIoHandler();
        boolean userFound = false ;
        int index = 0 ;
        String name = "", customerEmail = "", vReg = "", status = ""; 
        Date slot = null ;
        
            System.out.println(Id +" " + ID);
            for (Booking list : allBookings) {
                  System.out.println(list.getID());
                  if (ID == list.getID()){
                    index = allBookings.indexOf(list);
                    name = list.getName();
                    slot = list.getSlot();
                    customerEmail = list.getCustomerEmail();
                    vReg = list.getvReg();
                    status = Character.toString(list.getStatus());
                    userFound = true;
                }
            }
            
            if(userFound == true){
                Format dateForm = new SimpleDateFormat("dd-MM-yyyy HH:mm");
                
                if(status.charAt(0) == 'O'){
                    status = "Ongoing" ;
                } else{
                    status = "Completed" ;
                }
                
                int confirmation = JOptionPane.showConfirmDialog(null,
                "Booking ID: " + ID + "\n"
                        + "Name: " + name + "\n"
                        + "Time Slot: " + dateForm.format(slot) + "\n"
                        + "Customer Email: " + customerEmail + "\n"
                        + "Registration Number: " + vReg + "\n"
                        + "Status: " + status + "\n"
                        + "Would you like to delete?" , "Delete Confirmation", JOptionPane.YES_NO_OPTION);
                
                if (confirmation == JOptionPane.YES_OPTION) {
                    allBookings.remove(index);
                    BookingIoHandler.addBooking();
                    JOptionPane.showMessageDialog(null, "Booking " + name + " deleted", "Booking Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Booking " + name + " not deleted", "Booking Not Deleted", JOptionPane.INFORMATION_MESSAGE);
                   
                }
            }
                    
            if (userFound == false) {
                JOptionPane.showMessageDialog(null,"Booking doesn't exist! Please try again","Alert",JOptionPane.WARNING_MESSAGE);
            }
    allBookings.clear();  
     }catch(NullPointerException e){
         
     }
    }//GEN-LAST:event_deleteLabelMouseClicked

    private void searchLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchLabelMouseClicked
        dispose();
        ViewBooking VA = new ViewBooking();
        VA.show();
    }//GEN-LAST:event_searchLabelMouseClicked

    private void editLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editLabelMouseClicked
        dispose();
        EditBooking EA = new EditBooking() ;
        EA.show();
    }//GEN-LAST:event_editLabelMouseClicked

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
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new BookingManagement().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel deleteLabel;
    private javax.swing.JLabel editLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel searchLabel;
    // End of variables declaration//GEN-END:variables
}
