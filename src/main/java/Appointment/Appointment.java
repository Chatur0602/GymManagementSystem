package Appointment;

import java.util.Date;

public class Appointment {
    private int ID ;
    private String name, instructorUsername, customerEmail;
    private Date slot ;
    private char status ;

    public Appointment(int ID, String name, Date slot, String customerEmail, String instructorUsername, char status) {
        this.ID = ID;
        this.name = name;
        this.instructorUsername = instructorUsername;
        this.customerEmail = customerEmail;
        this.slot = slot;
        this.status = status;
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

    public String getInstructorUsername() {
        return instructorUsername;
    }

    public void setInstructorUsername(String InstructorUsername) {
        this.instructorUsername = instructorUsername;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Date getSlot() {
        return slot;
    }

    public void setSlot(Date slot) {
        this.slot = slot;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    
    
}
