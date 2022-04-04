package TextPack;

import Instructor.Instructor;
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
            String path = "C:\\Users\\Nikhi\\OneDrive\\Documents\\NetBeansProjects\\FirstProject\\src\\main\\java\\TextPack\\Instructors.txt";
            BufferedWriter p = new BufferedWriter(
                new FileWriter(path, true));
            int ID = generateID(path);
            
            for(Instructor i : allInstructors){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY");
               p.write("\n"+ID+","+i.getName()+","+i.geteMail()+","+i.getContact()+","+dateForm.format(i.getDOB())+","+i.getUsername()+","+i.getPassword());
               //System.out.println(ID+","+i.getName()+","+i.geteMail()+","+i.getContact()+","+i.getDOB()+","+i.getUsername()+","+i.getPassword());
            }
            p.close();
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Instructor Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
}
