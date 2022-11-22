package Booking;

import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Booking.Booking;

public class BookingIoHandler {
    
    public BookingIoHandler(){
        try{
        readBooking();
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
    
 
    //Booking Functions
    public static ArrayList<Booking> allBookings = new ArrayList<Booking>();
    public static String aPath = "src/main/java/TextPack/Bookings.txt";
    
    public static void readBooking() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(aPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date slot=new SimpleDateFormat("dd-MM-yyyy HH:mm").parse(values[5]);
            char status = values[6].charAt(0);
            
            Booking a = new Booking(Integer.parseInt(values[0]),Integer.parseInt(values[1]),values[2],values[3],values[4],slot,status);
            allBookings.add(a);
        }
    }
    br.close();
}
    
    public static Booking checkBooking(String slot, String vReg, String customerEmail) throws IOException, ParseException{
        Booking found = null;
        SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY HH:mm");
        
        for(Booking a : allBookings){
            if(slot.equals(dateForm.format(a.getSlot())) && vReg.equals(a.getvReg()) || slot.equals(dateForm.format(a.getSlot())) && customerEmail.equals(a.getCustomerEmail())){
                found = a;
                break;  
            }
        }    
        return found;
    }
    
    public static void addBooking(){
        try{
            clearFile(aPath);
            BufferedWriter p = new BufferedWriter(
                new FileWriter(aPath, true));
           
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY HH:mm");
            
            for(Booking a : allBookings){
               p.write(a.getID()+","+a.getDays()+","+a.getName()+","+a.getCustomerEmail()+","+a.getvReg()+","+dateForm.format(a.getSlot())+","+a.getStatus()+"\n");
               //System.out.println(ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
            }
            
            p.close();
            allBookings.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Booking Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
                System.exit(0);
        }   
    }
}
