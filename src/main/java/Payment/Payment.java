package Payment;

import java.util.Date;

public class Payment {
    private int ID, amount, appointmentID;
    private String cName, feedback ;
    private Date DOP;

    public Payment(int ID, int amount, int appointmentID, String cName, String feedback, Date DOP) {
        this.ID = ID;
        this.amount = amount;
        this.appointmentID = appointmentID;
        this.cName = cName;
        this.feedback = feedback;
        this.DOP = DOP;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getName() {
        return cName;
    }

    public void setName(String cName) {
        this.cName = cName;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getDOP() {
        return DOP;
    }

    public void setDOP(Date DOP) {
        this.DOP = DOP;
    }
    
    
}
