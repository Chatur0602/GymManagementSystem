package Customer;

import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import Customer.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerIoHandler {
    public CustomerIoHandler(){
        try{
        readCustomer();
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
            
            Customer c = new Customer(Integer.parseInt(values[0]),values[1],values[2],values[3],date,gender, values[6], values[7]);
            allCustomers.add(c);
        }
    }
    br.close();
}
    
    public static Customer checkCustomer(String email, String contact, String username) throws IOException, ParseException{
        Customer found = null;
    
        for(Customer c : allCustomers){
            if(email.equals(c.geteMail()) || contact.equals(c.getContact()) || username.equals(c.getUsername())){
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
                p.write(c.getID()+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender()+","+c.getUsername()+","+c.getPassword()+"\n");
                    //System.out.println(c.getID()+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender())
            } 
            
              p.close();
            allCustomers.clear(); 
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Customer Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
                System.exit(0);
     
        }   
    }
}
