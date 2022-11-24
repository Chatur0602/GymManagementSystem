package Vehicle;

import Vehicle.Vehicle;
import Customer.Customer;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class VehicleIoHandler {
    
    public VehicleIoHandler(){
        try{
        readInstructor();
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
    
    //Instructor Functions
    public static ArrayList<Vehicle> allInstructors = new ArrayList<Vehicle>();
    public static String iPath = "src/main/java/TextPack/Vehicles.txt"; 
    
    public static void readInstructor() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(iPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date date=new SimpleDateFormat("dd-MM-yyyy").parse(values[4]);
            Vehicle i = new Vehicle(Integer.parseInt(values[0]),Integer.parseInt(values[1]),values[2],values[3],values[4],values[5]);
            allInstructors.add(i);
        }
    }
    br.close();
}
     
     public static Vehicle checkInstructor(String eMail, String contact, String username){
        Vehicle found = null;
        
        for(Vehicle i : allInstructors){
            if(eMail.equals(i.geteMail()) || contact.equals(i.getContact()) || username.equals(i.getUsername())){
                found = i;
                break;
            }
        }    
        return found;
    }
    
    public static void addInstructor(){
        try{
            clearFile(iPath);
            BufferedWriter p = new BufferedWriter(
                new FileWriter(iPath, true));
            
            for(Vehicle i : allInstructors){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
               
               p.write(i.getID()+","+i.getMfgYear()+","+i.getManufacturer()+","+i.getModel()+","+i.getColor()+","+i.getvReg()+"\n");
            }
            
            p.close();
            allInstructors.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Instructor Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
}
