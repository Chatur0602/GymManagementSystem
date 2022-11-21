package Booking;

import java.util.Date;

public class Booking {
    private int ID,days ;
    private String name, customerEmail, vReg;
    private Date slot ;
    private char status ;

    public Booking(int ID, int days, String name, String customerEmail, String vReg, Date slot, char status) {
        this.ID = ID;
        this.days = days;
        this.name = name;
        this.customerEmail = customerEmail;
        this.vReg = vReg;
        this.slot = slot;
        this.status = status;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getvReg() {
        return vReg;
    }

    public void setvReg(String vReg) {
        this.vReg = vReg;
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
