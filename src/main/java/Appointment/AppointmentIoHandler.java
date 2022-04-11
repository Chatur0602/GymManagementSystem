package Appointment;

import Appointment.*;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Appointment.Appointment;

public class AppointmentIoHandler {
    
    public AppointmentIoHandler(){
        try{
        readAppointment();
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
    
 
    //Appointment Functions
    public static ArrayList<Appointment> allAppointments = new ArrayList<Appointment>();
    public static String aPath = "src/main/java/TextPack/Appointments.txt";
    
    public static void readAppointment() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(aPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date slot=new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(values[2]);
            char status = values[5].charAt(0);
            
            Appointment a = new Appointment(Integer.parseInt(values[0]),values[1],slot,values[3],values[4],status);
            allAppointments.add(a);
        }
    }
    br.close();
}
    
    public static Appointment checkAppointment(String slot, String instructorUsername, String customerEmail) throws IOException, ParseException{
        Appointment found = null;
        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY HH:mm");
        
        for(Appointment a : allAppointments){
            if(slot.equals(dateForm.format(a.getSlot())) && instructorUsername.equals(a.getInstructorUsername()) || slot.equals(dateForm.format(a.getSlot())) && customerEmail.equals(a.getCustomerEmail())){
                found = a;
                break;  
            }
        }    
        return found;
    }
    
    public static void addAppointment(){
        try{
            clearFile(aPath);
            BufferedWriter p = new BufferedWriter(
                new FileWriter(aPath, true));
           
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY HH:mm");
            
            for(Appointment a : allAppointments){
               p.write(a.getID()+","+a.getName()+","+dateForm.format(a.getSlot())+","+a.getCustomerEmail()+","+a.getInstructorUsername()+","+a.getStatus()+"\n");
               //System.out.println(ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
            }
            
            p.close();
            allAppointments.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Appointment Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }   
    }
}
