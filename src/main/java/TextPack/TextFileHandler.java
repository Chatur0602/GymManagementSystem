package TextPack;

import Instructor.Instructor;
import Customer.Customer;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TextFileHandler {
    
    public TextFileHandler(){
        try{
        readCustomer();
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
    public static ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();
    public static String iPath = "src/main/java/TextPack/Instructors.txt"; 
    
     public static void readInstructor() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(iPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date date=new SimpleDateFormat("dd-MM-yyyy").parse(values[4]);
            Instructor i = new Instructor(Integer.parseInt(values[0]),values[1],values[2],values[3],date,values[5],values[6]);
            allInstructors.add(i);
        }
    }
    br.close();
}
     
     public static Instructor checkInstructor(String eMail, String contact, String username){
        Instructor found = null;
        
        for(Instructor i : allInstructors){
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
            
            for(Instructor i : allInstructors){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
               
               p.write(i.getID()+","+i.getName()+","+i.geteMail()+","+i.getContact()+","+dateForm.format(i.getDOB())+","+i.getUsername()+","+i.getPassword()+"\n");
            }
            
            p.close();
            allInstructors.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Instructor Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
    
 
    //Customer Functions
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    public static String cPath = "src/main/java/TextPack/Customers.txt";
    
    public static void readCustomer() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(cPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date date=new SimpleDateFormat("dd-MM-yyyy").parse(values[4]);
            char gender = values[5].charAt(0);
            
            Customer c = new Customer(Integer.parseInt(values[0]),values[1],values[2],values[3],date,gender);
            allCustomers.add(c);
        }
    }
    br.close();
}
    
    public static Customer checkCustomer(String email, String contact) throws IOException, ParseException{
        Customer found = null;
    
        for(Customer c : allCustomers){
            if(email.equals(c.geteMail()) || contact.equals(c.getContact())){
                found = c;
                break;  
            }
        }    
        return found;
    }
    
    public static void addCustomer(){
        try{
            clearFile(cPath);
            BufferedWriter p = new BufferedWriter(
                new FileWriter(cPath, true));
           
            SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
            
            for(Customer c : allCustomers){
               p.write(c.getID()+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender()+"\n");
               //System.out.println(ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
            }
            
            p.close();
            allCustomers.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Customer Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
}
