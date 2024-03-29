package Admin;


import Customer.Customer;
import Customer.CustomerIoHandler;
import static Customer.CustomerIoHandler.allCustomers;
import Admin.AdminLogin;
import Payment.Payment;
import Payment.PaymentIoHandler;
import static Payment.PaymentIoHandler.allPayments;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/* @author Nikhil */
public class ReportGenerator extends javax.swing.JFrame {

    PaymentIoHandler PIH ;
    CustomerIoHandler CIH ;
    private static int fCount ;
    private static int mCount ;
    private static int fAmount ;
    private static int mAmount ;
    private static int firstCount ;
    private static int firstAmount ;
    private static int secondCount ;
    private static int secondAmount ;
    private static int thirdCount ;
    private static int thirdAmount ;
    private static int fourthCount ;
    private static int fourthAmount ;
    
    public ReportGenerator() {
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
        firstDateDC = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        lastDateDC = new com.toedter.calendar.JDateChooser();
        reportGeneratorButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Report Generator");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 210, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-logout-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-go-back-24.png")); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));
        jPanel3.add(firstDateDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 130, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("  To");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));
        jPanel3.add(lastDateDC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 130, -1));

        reportGeneratorButton.setText("Generate Report");
        reportGeneratorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportGeneratorButtonActionPerformed(evt);
            }
        });
        jPanel3.add(reportGeneratorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void reportGeneratorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportGeneratorButtonActionPerformed
        PIH = new PaymentIoHandler();
        CIH = new CustomerIoHandler();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dateString ;
        LocalDate DOB ;
        int Age;
        
         for (Payment list : allPayments) {  
          
            
                if (list.getDOP().after(firstDateDC.getDate()) && list.getDOP().before(lastDateDC.getDate())){
                    for(Customer c : allCustomers){
                        if(list.getName().toLowerCase() == null ? c.geteMail().toLowerCase() == null : list.getName().toLowerCase().equals(c.getUsername().toLowerCase())){
                            
                            dateString = format.format(c.getDOB());
                            DOB = LocalDate.parse(dateString, formatter);
                            Age = Period.between(DOB, LocalDate.now()).getYears();

                            if(Age >= 18 && Age< 25){
                                firstCount ++ ;
                                firstAmount = firstAmount + list.getAmount();
                            }
                            
                            else if(Age >= 25 && Age< 35){
                                secondCount ++ ;
                                secondAmount = secondAmount + list.getAmount();
                            }
                            
                            else if(Age >= 35 && Age< 50){
                                thirdCount ++ ;
                                thirdAmount = thirdAmount + list.getAmount();
                            }
                            else if(Age >= 50){
                                fourthCount ++ ;
                                fourthAmount = fourthAmount + list.getAmount();
                            }
                            
                            if(c.getGender() == 'F'){
                                fCount ++ ;
                                fAmount = fAmount + list.getAmount() ;
                            }
                            else{
                                mCount++ ;
                                mAmount = mAmount + list.getAmount();
                            }
                        }
                    }
                
                }
            }
 
         GenderReport GR = new GenderReport(fCount, mCount, fAmount, mAmount);
         GR.show();
         
         AgeReport AR = new AgeReport(firstCount, secondCount, thirdCount, fourthCount, firstAmount, secondAmount, thirdAmount, fourthAmount);
         AR.show();
        
         allPayments.clear();
         allCustomers.clear();
         fAmount = 0;
         mAmount = 0;
         fCount = 0;
         mCount = 0 ;
         firstCount = 0;
         secondCount = 0;
         thirdCount = 0;
         fourthCount = 0;
         firstAmount = 0;
         secondAmount = 0;
         thirdAmount = 0;
         fourthAmount = 0 ;
    }//GEN-LAST:event_reportGeneratorButtonActionPerformed

    private void backLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backLabelMouseClicked
        dispose();
        AdminDashboard MD = new AdminDashboard();
        MD.show();
    }//GEN-LAST:event_backLabelMouseClicked

    private DefaultCategoryDataset createDataset(int fAmount, int mAmount) {
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(fAmount, "Revenue", "F");
        dataset.addValue(mAmount, "Revenue", "M");
        
        return dataset;
    }
    
    
    
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
            java.util.logging.Logger.getLogger(ReportGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportGenerator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new ReportGenerator().setVisible(true);
            }
        });
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel exitLabel;
    private com.toedter.calendar.JDateChooser firstDateDC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private com.toedter.calendar.JDateChooser lastDateDC;
    private javax.swing.JButton reportGeneratorButton;
    // End of variables declaration//GEN-END:variables
}
