package Admin;
import Admin.Admin;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.JOptionPane;

public class AdminIoHandler {

    public AdminIoHandler(){
        try {
        readManager();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Can't Read In Constructor");
        }
    }
    
    //General Functions
     public static void clearFile(String path) throws IOException{
        FileWriter fwOb = new FileWriter(path, false); 
        PrintWriter pwOb = new PrintWriter(fwOb, false);
        pwOb.flush();
        pwOb.close();
        fwOb.close();
    }
    
    
    //Manager Functions
    public static ArrayList<Admin> allManagers = new ArrayList<Admin>();
    public static String mPath = "src/main/java/TextPack/Admins.txt";
    
    public static void readManager() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(mPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            //Date date=new SimpleDateFormat("dd-MM-yyyy").parse(values[4]);
            //char gender = values[5].charAt(0);
            Admin m = new Admin(Integer.parseInt(values[0]),values[1],values[2],values[3],values[4],values[5],values[6]);
            allManagers.add(m);
        }
    }
    br.close();
}
    
    public static Admin checkManager(String eMail, String contact, String username) throws IOException, ParseException{
        Admin found = null;
    
        for(Admin m : allManagers){
            if(eMail.equals(m.geteMail()) || contact.equals(m.getContact()) || username.equals(m.getUsername())){
                found = m;
                break;  
            }
        }    
        return found;
    }
    
    public static void addManager(){
        try{
            clearFile(mPath);
            BufferedWriter p = new BufferedWriter(
                new FileWriter(mPath, true));
                       
            for(Admin m : allManagers){
               p.write(m.getID()+","+m.getName()+","+m.geteMail()+","+m.getContact()+","+m.getAddress()+","+m.getUsername()+","+m.getPassword()+"\n");
               //System.out.println(ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
            }
            
            p.close();
            allManagers.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Manager Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }   
    }

    //ManagerIoHandler() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    //ManagerIoHandler() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}