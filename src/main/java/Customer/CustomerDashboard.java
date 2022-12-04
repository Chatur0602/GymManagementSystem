package Customer;

import Customer.CustomerLogin;
import Customer.UpdateProfile;
import static Booking.BookingIoHandler.allBookings;
import Booking.ViewBooking;
import Payment.AddPaymentFeedback;
import static Payment.PaymentIoHandler.allPayments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/* @author Nikhil */
public class CustomerDashboard extends javax.swing.JFrame {

    public static String user ;
    
     public CustomerDashboard(String user) {
        initComponents();
        CustomerDashboard.user = user ;
        jLabel2.setText("Welcome, " + user);
        
        allPayments.clear();
        allBookings.clear();
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
        updateLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        paymentLabel = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        appointmentLabel = new javax.swing.JLabel();
        bookingLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 153, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Customer Dashboard");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 250, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-logout-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 30));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-go-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        updateLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-update-user-skin-type-7-64.png")); // NOI18N
        updateLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateLabelMouseClicked(evt);
            }
        });
        jPanel3.add(updateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 70, 70));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("  Update");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 60, 20));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("  Profile");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 60, 20));

        paymentLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-get-cash-64.png")); // NOI18N
        paymentLabel.setText("  ");
        paymentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLabelMouseClicked(evt);
            }
        });
        jPanel3.add(paymentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 70, 60));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("View Personal");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 90, 20));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setText("Bookings");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 60, 20));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Payment &");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 70, 20));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("  Notes");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 70, 20));

        jLabel2.setText("Welcome, ");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 180, -1));

        appointmentLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-appointment-64.png")); // NOI18N
        appointmentLabel.setText("  ");
        appointmentLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentLabelMouseClicked(evt);
            }
        });
        jPanel3.add(appointmentLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 70, 70));

        bookingLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-fiat-500-64.png")); // NOI18N
        bookingLabel.setText("  ");
        bookingLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookingLabelMouseClicked(evt);
            }
        });
        jPanel3.add(bookingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 70, 70));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setText("Vehicle");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 60, 20));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setText("Booking");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 60, 20));

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
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        CustomerLogin IL = new CustomerLogin();
        IL.show();

    }//GEN-LAST:event_backLabelMouseClicked

    private void updateLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateLabelMouseClicked
        dispose();
        UpdateProfile UP = new UpdateProfile(user);
        UP.show();
    }//GEN-LAST:event_updateLabelMouseClicked

    private void appointmentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentLabelMouseClicked
        dispose();
        PersonalBookings MA = new PersonalBookings(user);
        MA.show();
    }//GEN-LAST:event_appointmentLabelMouseClicked

    private void paymentLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLabelMouseClicked
        dispose();
        AddPaymentFeedback AP = new AddPaymentFeedback(user);
        AP.show();
    }//GEN-LAST:event_paymentLabelMouseClicked

    private void bookingLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookingLabelMouseClicked
        dispose();
        AddCustomerBooking ACP = new AddCustomerBooking(user);
        ACP.show();
    }//GEN-LAST:event_bookingLabelMouseClicked

    /**
     * @param args the command line arguments
     */
     public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard(user).setVisible(true);
            }
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentLabel;
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel bookingLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel paymentLabel;
    private javax.swing.JLabel updateLabel;
    // End of variables declaration//GEN-END:variables
}
