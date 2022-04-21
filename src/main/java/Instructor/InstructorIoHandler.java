package Instructor;

import Instructor.Instructor;
import Customer.Customer;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class InstructorIoHandler {
    
    public InstructorIoHandler(){
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
    public static ArrayList<Instructor> allInstructors = new ArrayList<Instructor>();
    public static String iPath = "src/main/java/TextPack/Instructors.txt"; 
    
     public static void readInstructor() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(iPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            System.out.println(values[0]);
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
}
