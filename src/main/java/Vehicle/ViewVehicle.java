package Vehicle;

import static Customer.CustomerIoHandler.allCustomers;
import static Vehicle.VehicleIoHandler.allVehicles;
import java.awt.List;
import java.text.Format;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ViewVehicle extends javax.swing.JFrame {
    public static String dataRow [] ;
    public static String [] columnsName = {"Vehicle ID", "Manufacturer", "Model", "Mfg Year", "Color", "Vehicle Registration","Daily Rate"};
    
    VehicleIoHandler IIH;
    public ViewVehicle() {
        allVehicles.clear();
        IIH = new VehicleIoHandler();
        initComponents();
       
        viewCustomerTable.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel)viewCustomerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
        Format date =new SimpleDateFormat("dd-MM-yyyy");
 
            for (Vehicle list : allVehicles) {
                dataRow = new String[] {Integer.toString(list.getID()),list.getManufacturer(),list.getModel(),Integer.toString(list.getMfgYear()),list.getColor(),list.getvReg(),Integer.toString(list.getdRate())};
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
        searchInstructorButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        viewCustomerTable = new javax.swing.JTable();
        usernameField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("View Vehicle");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backLabelMouseClicked(evt);
            }
        });
        jPanel3.add(backLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        searchInstructorButton.setText("Search Vehicle");
        searchInstructorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInstructorButtonActionPerformed(evt);
            }
        });
        jPanel3.add(searchInstructorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 920, 450));

        usernameField.setBackground(new java.awt.Color(0, 51, 102));
        usernameField.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        usernameField.setForeground(new java.awt.Color(204, 204, 204));
        usernameField.setText("        Enter Vehicle Name");
        usernameField.setToolTipText("Password");
        usernameField.setBorder(null);
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });
        jPanel3.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 520, 180, 20));
        jPanel3.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 180, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 961, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        VehicleManagement IM= new VehicleManagement();
        IM.show();
        allVehicles.clear();
    }//GEN-LAST:event_backLabelMouseClicked

    private void searchInstructorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInstructorButtonActionPerformed
        viewCustomerTable.setDefaultEditor(Object.class, null);
        DefaultTableModel model = (DefaultTableModel)viewCustomerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
        
        for (Vehicle list : allVehicles) {
                  if (list.getModel().toLowerCase().contains(usernameField.getText().toLowerCase()) || list.getManufacturer().toLowerCase().contains(usernameField.getText().toLowerCase())){
                      
                      dataRow = new String[] {Integer.toString(list.getID()),list.getManufacturer(),list.getModel(),Integer.toString(list.getMfgYear()),list.getColor(),list.getvReg(),Integer.toString(list.getdRate())};
                      model.addRow(dataRow);      
            }
        }  
    }//GEN-LAST:event_searchInstructorButtonActionPerformed

    private void viewCustomerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewCustomerTableMouseClicked
        /*JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint( evt.getPoint() );
        String s=source.getModel().getValueAt(row, column).toString();*/
        
    }//GEN-LAST:event_viewCustomerTableMouseClicked

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        usernameField.setText("");
        usernameField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    }//GEN-LAST:event_usernameFieldFocusGained

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
            java.util.logging.Logger.getLogger(ViewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewVehicle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewVehicle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JButton searchInstructorButton;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTable viewCustomerTable;
    // End of variables declaration//GEN-END:variables
}
