package Manager;
import Admin.ManagerManagement;
import Manager.*;
import Manager.*;
import static Manager.ManagerIoHandler.addManager;
import static Manager.ManagerIoHandler.allManagers;
import java.io.IOException;
import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
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

public class EditManager extends javax.swing.JFrame {
    public static String [] columnsName = {"Manager ID", "Name", "Email ID", "Phone No.", "Address", "Username", "Password"};
    public static String dataRow [] ;
    
    
    ManagerIoHandler IIH; 
    public EditManager() {
        IIH = new ManagerIoHandler();
        initComponents(); 
        DefaultTableModel model = (DefaultTableModel)editManagerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
       
             for (Manager list : allManagers) {

                dataRow = new String[] {Integer.toString(list.getID()),list.getName(),list.geteMail(),list.getContact(),list.getAddress(), list.getUsername(), list.getPassword()};
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
        editManagerTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Edit Manager");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 180, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, -1, 20));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        jPanel3.add(saveChangesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 370, 110, -1));

        editManagerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        editManagerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editManagerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(editManagerTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 730, 300));

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
        ManagerManagement IM = new ManagerManagement();
        IM.show();
        allManagers.clear();
    }//GEN-LAST:event_backLabelMouseClicked
    
    
    private void editManagerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editManagerTableMouseClicked

    }//GEN-LAST:event_editManagerTableMouseClicked

    private void saveChangesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesButtonMouseClicked
            DefaultTableModel model = (DefaultTableModel)editManagerTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            int Id = 0;
            String name = null;
            String email = null;
            String contact = null;
            String address = null ;
            String username = null ;
            String password = null ;
            
            Manager m = null ; 
            
            allManagers.clear();
            
            for (int rowCount = 0; rowCount < model.getRowCount(); rowCount++){
    
                    Id = Integer.parseInt(model.getValueAt(rowCount, 0).toString());
                    name = model.getValueAt(rowCount, 1).toString();
                    email = model.getValueAt(rowCount, 2).toString();
                    contact = model.getValueAt(rowCount, 3).toString();
                    address = model.getValueAt(rowCount, 4).toString() ;
                    username = model.getValueAt(rowCount, 5).toString();
                    password = model.getValueAt(rowCount, 6).toString();
                    
                    
                //Date date = new SimpleDateFormat("dd-MM-yyyy").parse(d);
                //System.out.println(Id + " | " + name + " | " + eMail + " | " + contact + " | " + address + " | " + username + " | " + password);
                boolean characterFound = false;
                Pattern namePattern = Pattern.compile("[^a-z]", Pattern.CASE_INSENSITIVE);
                Matcher cName = namePattern.matcher(name);
                characterFound = cName.find();
                int Age;
                if(characterFound == true || name.length()<4){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect Name format, Minimum 4 letters & no special characters or numbers allowed", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else{
                    Pattern eMailPattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$");
                    Matcher eMail = eMailPattern.matcher(email);
                    characterFound = eMail.find();
                    
                    if(characterFound == false || email.length()<8){
                        JOptionPane.showMessageDialog(null,
                                "Incorrect E-Mail format, Minimum 8 letters & must contain '@'", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                        
                    } else{
                        Pattern contactPattern = Pattern.compile("^[0-9]");
                        Matcher cContact = contactPattern.matcher(contact);
                        characterFound = cContact.find();
                        
                        if(characterFound == false || contact.length() != 10){
                            JOptionPane.showMessageDialog(null,
                                    "Incorrect contact format, Must be 10 numeric digits long", "Warning",
                                    JOptionPane.WARNING_MESSAGE);
                        }else{
                            m = new Manager(Id, name, email, contact, address, username, password);
                            ManagerIoHandler.allManagers.add(m);
                            
                        }}}
                
                
                //m = new Manager(Id, name, eMail, contact, address, username, password);
                //ManagerIoHandler.allManagers.add(m);
        addManager();
         JOptionPane.showMessageDialog(null,
                        "Manager Data Successfully Updated", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_saveChangesButtonMouseClicked
    }                
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backLabel;
    private javax.swing.JTable editManagerTable;
    private javax.swing.JLabel exitLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveChangesButton;
    // End of variables declaration//GEN-END:variables
}
