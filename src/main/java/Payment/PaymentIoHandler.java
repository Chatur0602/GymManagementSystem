package Payment;

import Payment.*;
import Payment.Payment;
import Customer.Customer;
import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class PaymentIoHandler {
    
    public PaymentIoHandler(){
        try{
        readPayment();
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
    
    //Payment Functions
    public static ArrayList<Payment> allPayments = new ArrayList<Payment>();
    public static String pPath = "src/main/java/TextPack/Payments.txt"; 
    
    public static void readPayment() throws IOException, ParseException{
    BufferedReader br = new BufferedReader(new FileReader(pPath));
    String line = null;
    
    while ((line = br.readLine()) != null) {
      String[] value = line.split("\n");
      String[] values = line.split(",");
      
      for (String lines : value) {
            Date date=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").parse(values[5]);
            Payment p = new Payment(Integer.parseInt(values[0]),Integer.parseInt(values[1]),Integer.parseInt(values[2]),values[3],values[4],date);
            allPayments.add(p);
        }
    }
    br.close();
}
     
    public static Payment checkPayment(int ID){
        Payment found = null;
        
        for(Payment p : allPayments){
            if(ID == p.getAppointmentID()){
                found = p;
                break;
            }
        }    
        return found;
    }
    
    public static void addPayment(){
        try{
            clearFile(pPath);
            BufferedWriter bw = new BufferedWriter(
                new FileWriter(pPath, true));
            
            for(Payment p : allPayments){
               SimpleDateFormat dateForm = new SimpleDateFormat("dd-MM-YYYY HH:mm:ss");
               
               bw.write(p.getID()+","+p.getAmount()+","+p.getAppointmentID()+","+p.getName() +","+p.getFeedback()+","+dateForm.format(p.getDOP())+"\n");
            }
            
            bw.close();
            allPayments.clear();
            
        }catch(Exception e){
                JOptionPane.showMessageDialog(null,
                "Payment Not Added, Please Try Again", "Error",
                JOptionPane.ERROR_MESSAGE);
        }   
    }
}
