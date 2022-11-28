package Customer;

import Customer.CustomerIoHandler;
import java.util.Date;

public class Customer {
    private int ID ;
    private String name, eMail, contact, username, password;
    private Date DOB ;
    private char gender ; 

    public Customer(int ID, String name, String eMail, String contact, Date DOB, char gender, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.eMail = eMail;
        this.contact = contact;
        this.DOB = DOB;
        this.gender = gender;
        this.username = username;
        this.password = password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

  
    
    
}
