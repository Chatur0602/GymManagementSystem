package TextPack;

import Instructor.Instructor;
import Customer.Customer;
import java.io.*;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class TextFileHandler {
    public static ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();
    
    public static int generateID(String filePath) throws IOException{
        int lines = 0;
        try{
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        while (reader.readLine() != null) lines++;
        reader.close();
        }catch(Exception e) {
            e.getStackTrace();
    }
        return lines + 1;
}
    
    public static void addInstructor(){
        try{
            String path = "src/main/java/TextPack/Instructors.txt";
            BufferedWriter p = new BufferedWriter(
                new FileWriter(path, true));
            int ID = generateID(path);
            
            for(Instructor i : allInstructors){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
               p.write("\n"+ID+","+i.getName()+","+i.geteMail()+","+i.getContact()+","+dateForm.format(i.getDOB())+","+i.getUsername()+","+i.getPassword());
               //System.out.println(ID+","+i.getName()+","+i.geteMail()+","+i.getContact()+","+i.getDOB()+","+i.getUsername()+","+i.getPassword());
            }
            p.close();
            allInstructors.clear();
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Instructor Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
    
    public static Instructor checkInstructor(String eMail, String contact, String username){
        
        Instructor found = null;
        System.out.println(allInstructors.size());
        System.out.println("Second: " + eMail + " " + contact + " " + username);
        for(Instructor i : allInstructors){
            System.out.println("Third: " + i.geteMail() + " " + i.getContact() + " " + i.getUsername());
            if(eMail.equals(i.geteMail()) || contact.equals(i.getContact()) || username.equals(i.getUsername())){
                found = i;
                break;
            }
        }    
        return found;
    }
    
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    
    public static void addCustomer(){
        try{
            String path = "src/main/java/TextPack/Customers.txt";
            BufferedWriter p = new BufferedWriter(
                new FileWriter(path, true));
            int ID = generateID(path);
            
            for(Customer c : allCustomers){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
               p.write("\n"+ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
               //System.out.println(ID+","+c.getName()+","+c.geteMail()+","+c.getContact()+","+dateForm.format(c.getDOB())+","+c.getGender());
            }
            p.close();
            allCustomers.clear();
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Instructor Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
    
}
