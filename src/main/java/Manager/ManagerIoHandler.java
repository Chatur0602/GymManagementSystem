package Manager;
import Manager.Manager;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import javax.swing.JOptionPane;

public class ManagerIoHandler {

    public ManagerIoHandler(){
        try {
        readManager();
        System.out.println("inconstructor");
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
    public static ArrayList<Manager> allManagers = new ArrayList<Manager>();
    public static String mPath = "src/main/java/TextPack/Managers.txt";
    
    public static void readManager() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(mPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            //Date date=new SimpleDateFormat("dd-MM-yyyy").parse(values[4]);
            //char gender = values[5].charAt(0);
            Manager m = new Manager(Integer.parseInt(values[0]),values[1],values[2],values[3],values[4],values[5],values[6]);
            allManagers.add(m);
        }
    }
    br.close();
}
    
    public static Manager checkManager(String eMail, String contact, String username) throws IOException, ParseException{
        Manager found = null;
    
        for(Manager m : allManagers){
            if(eMail.equals(m.getEmail()) || contact.equals(m.getContact()) || username.equals(m.getUsername())){
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
                       
            for(Manager m : allManagers){
               p.write(m.getID()+","+m.getName()+","+m.getEmail()+","+m.getContact()+","+m.getAddress()+","+m.getUsername()+","+m.getPassword()+"\n");
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
}