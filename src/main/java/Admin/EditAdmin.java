package Admin;
import SuperAdmin.AdminManagement;
import static Admin.AdminIoHandler.addManager;
import static Admin.AdminIoHandler.allManagers;
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

public class EditAdmin extends javax.swing.JFrame {
    public static String [] columnsName = {"Manager ID", "Name", "Email ID", "Phone No.", "Address", "Username", "Password"};
    public static String dataRow [] ;
    
    
    AdminIoHandler IIH; 
    public EditAdmin() {
        allManagers.clear();
        IIH = new AdminIoHandler();
        initComponents(); 
        DefaultTableModel model = (DefaultTableModel)editManagerTable.getModel();
        model.setRowCount(0);
        model.setColumnIdentifiers(columnsName);
       
             for (Admin list : allManagers) {

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

        jPanel3.setBackground(new java.awt.Color(102, 0, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("STCaiyun", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Edit Manager");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 180, -1));

        exitLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        exitLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-logout-24.png")); // NOI18N
        exitLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitLabelMouseClicked(evt);
            }
        });
        jPanel3.add(exitLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, -1, 30));

        backLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        backLabel.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\GymManagementSystem\\src\\main\\java\\Resources\\icons8-go-back-24.png")); // NOI18N
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
        saveChangesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveChangesButtonActionPerformed(evt);
            }
        });
        jPanel3.add(saveChangesButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 520, 120, -1));

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

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 920, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 961, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        AdminManagement IM = new AdminManagement();
        IM.show();
        allManagers.clear();
    }//GEN-LAST:event_backLabelMouseClicked
    
    
    private void editManagerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editManagerTableMouseClicked

    }//GEN-LAST:event_editManagerTableMouseClicked

    private void saveChangesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveChangesButtonMouseClicked
            DefaultTableModel model = (DefaultTableModel)editManagerTable.getModel();
            model.setColumnIdentifiers(columnsName);
            
            String ID = null;
            //String ID = null;
            String name = null;
            String email = null;
            String contact = null;
            String address = null;
            String username = null;
            String password = null;
            boolean characterFound = false;
            boolean validated = false;
            Admin m = null ; 
            
            allManagers.clear();
            
            for (int rowCount = 0; rowCount < model.getRowCount(); rowCount++){
    
                    ID = model.getValueAt(rowCount, 0).toString();
                    name = model.getValueAt(rowCount, 1).toString();
                    email = model.getValueAt(rowCount, 2).toString();
                    contact = model.getValueAt(rowCount, 3).toString();
                    address = model.getValueAt(rowCount, 4).toString() ;
                    username = model.getValueAt(rowCount, 5).toString();
                    password = model.getValueAt(rowCount, 6).toString();
                    
                try{
                //Date date = new SimpleDateFormat("dd-MM-yyyy").parse(d);
                //System.out.println(Id + " | " + name + " | " + eMail + " | " + contact + " | " + address + " | " + username + " | " + password);
        
                
              
                
                Pattern idPattern = Pattern.compile("[^0-9]");
                Matcher id = idPattern.matcher(ID);
                characterFound = id.find();
                
                if(characterFound == true || Integer.parseInt(ID) == 0){
                    JOptionPane.showMessageDialog(null,
                            "Incorrect Manager ID, Use numeric characters only", "Warning",
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
                    validated = false;
                    break;
                } else{
                        Pattern eMailPattern = Pattern.compile("^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$");
                        Matcher eMail = eMailPattern.matcher(email);
                        characterFound = eMail.find();
                    
                        if(characterFound == false || email.length()<8){
                            JOptionPane.showMessageDialog(null,
                                "Incorrect E-Mail Format, Minimum 8 letters & must contain '@'", "Warning",
                                JOptionPane.WARNING_MESSAGE);
                            validated = false;
                            break;
                        
                        }else{
                                Pattern contactPattern = Pattern.compile("[^0-9]");
                                Matcher cContact = contactPattern.matcher(contact);
                                characterFound = cContact.find();
                        
                                if(characterFound == true || contact.length() != 10){
                                    JOptionPane.showMessageDialog(null,
                                        "Incorrect Contact Format, Must be 10 numeric digits long", "Warning",
                                        JOptionPane.WARNING_MESSAGE);
                                validated = false;
                                break;
                        
                                }else{
                                        if(address.length()<16 || address.contains(",")){
                                                JOptionPane.showMessageDialog(null,
                                                    "Incorrect Address Format(use '|' instead of ','), Address is to short", "Warning",
                                                     JOptionPane.WARNING_MESSAGE);
                                        validated = false;
                                        break;
                                        
                                        }else{
                                                Pattern usernamePattern = Pattern.compile("[^a-z-0-9]", Pattern.CASE_INSENSITIVE);
                                                Matcher userName = usernamePattern.matcher(username);
                                                characterFound = userName.find();
                                
                                                if(characterFound == true || username.length()<8){
                                                    JOptionPane.showMessageDialog(null,
                                                        "Incorrect Username format, Minimum 8 letters & no special characters or numbers allowed", "Warning",
                                                        JOptionPane.WARNING_MESSAGE);
                                                validated = false;
                                                break;
                                    
                                                }else{
                                                        if(password.length()<8){
                                                            JOptionPane.showMessageDialog(null,
                                                                "Incorrect Password Format, Minimum 8 letters","Warning",
                                                                JOptionPane.WARNING_MESSAGE);
                                                        validated = false;
                                                        break;
                                                }else{
                                                m = new Admin(Integer.parseInt(ID), name, email, contact, address, username, password);
                                                AdminIoHandler.allManagers.add(m);
                                                validated = true;
                                               
                    }}}}}}}
                
                
                } catch (NumberFormatException e){
                        JOptionPane.showMessageDialog(null,
                            "Please enter a valid Appointment ID", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                            validated = false ;
                            break;
                            
                } 
            }
            if (validated == true){
            JOptionPane.showMessageDialog(null,
                        "Manager Data Successfully Updated", "Success",
                        JOptionPane.INFORMATION_MESSAGE);
            AdminIoHandler.addManager();
        }
            
    }//GEN-LAST:event_saveChangesButtonMouseClicked

    private void saveChangesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveChangesButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_saveChangesButtonActionPerformed
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditAdmin().setVisible(true);
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