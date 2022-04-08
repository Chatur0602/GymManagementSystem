/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Customer;

import static Customer.CustomerIoHandler.allCustomers;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nikhi
 */
public class EditCustomer extends javax.swing.JFrame {
    public static String [] columnsName = {"Customer ID", "Name", "Email ID", "Phone No.", "DOB", "Gender"};
    public static String dataRow [] ;
    
    
    CustomerIoHandler CIH; 
    public EditCustomer() {
        CIH = new CustomerIoHandler();
        initComponents(); 
        
        DefaultTableModel model = (DefaultTableModel)viewCustomerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
        Format date =new SimpleDateFormat("dd-MM-yyyy");
       
             for (Customer list : allCustomers) {
                 
                dataRow = new String[] {Integer.toString(list.getID()),list.getName(),list.geteMail(),list.getContact(),date.format(list.getDOB()),Character.toString(list.getGender())};
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
        searchCustomerButton = new javax.swing.JButton();
        editCustomerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCustomerTable = new javax.swing.JTable();
        emailField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("View Customer");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 180, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchCustomerButton.setText("Search Customer");
        searchCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerButtonActionPerformed(evt);
            }
        });
        jPanel3.add(searchCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        editCustomerButton.setText("Edit");
        editCustomerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editCustomerButtonMouseClicked(evt);
            }
        });
        jPanel3.add(editCustomerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 110, -1));

        viewCustomerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        viewCustomerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewCustomerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(viewCustomerTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 730, 300));

        emailField.setBackground(new java.awt.Color(0, 51, 102));
        emailField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        emailField.setForeground(new java.awt.Color(204, 204, 204));
        emailField.setText("            Enter Email ID");
        emailField.setToolTipText("Password");
        emailField.setBorder(null);
        emailField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailFieldFocusGained(evt);
            }
        });
        jPanel3.add(emailField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 180, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        CustomerManagement CM= new CustomerManagement();
        CM.show();
    }//GEN-LAST:event_backLabelMouseClicked
    
    
    private void searchCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerButtonActionPerformed
        
        DefaultTableModel model = (DefaultTableModel)viewCustomerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
        Format date =new SimpleDateFormat("dd-MM-yyyy");  
        
        for (Customer list : allCustomers) {
                  if (list.geteMail().toLowerCase().contains(emailField.getText().toLowerCase())){
                      
                      System.out.println(emailField.getText() + " " + list.geteMail());
                      dataRow = new String[] {Integer.toString(list.getID()),list.getName(),list.geteMail(),list.getContact(),date.format(list.getDOB()),Character.toString(list.getGender())};
                      model.addRow(dataRow);
            }
        }
    }//GEN-LAST:event_searchCustomerButtonActionPerformed

    private void viewCustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerTableMouseClicked

    }//GEN-LAST:event_viewCustomerTableMouseClicked

    private void emailFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFieldFocusGained
        emailField.setText("");
        emailField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    }//GEN-LAST:event_emailFieldFocusGained

    private void editCustomerButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editCustomerButtonMouseClicked
            /*JTable source = (JTable)evt.getSource();
            int row = source.rowAtPoint( evt.getPoint() );
            int column = source.columnAtPoint( evt.getPoint() );
            String s=source.getModel().getValueAt(row,column).toString();*/
           
            ArrayList<String> ID = new ArrayList<String>();
            ArrayList<String> name = new ArrayList<String>();
            
            DefaultTableModel model = (DefaultTableModel)viewCustomerTable.getModel();
            model.setColumnIdentifiers(columnsName);
 
            for (int rowCount = 0; rowCount < model.getRowCount(); rowCount++){
                //Customer c = new Customer(Integer.parseInt(model.getValueAt(rowCount, 0)), model.getValueAt(rowCount, 1).toString(), model.getValueAt(rowCount, 2).toString(), model.getValueAt(rowCount, 3).toString(), model.getValueAt(rowCount, 4),Character.toString(model.getValueAt(rowCount, 5)));
                //ID.add(model.getValueAt(rowCount, 0).toString()+ " "+ model.getValueAt(rowCount, 1).toString());
                
                //name.add(model.getValueAt(rowCount, 1).toString());
                //System.out.println(name);
                
                /*for (int columnCount = 0; columnCount < model.getColumnCount(); columnCount++){
                System.out.println(model.getValueAt(rowCount, columnCount));
                }*/
            }
            
            System.out.println(ID + "\n");
    }//GEN-LAST:event_editCustomerButtonMouseClicked

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
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JButton editCustomerButton;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton searchCustomerButton;
    private javax.swing.JTable viewCustomerTable;
    // End of variables declaration//GEN-END:variables
}
