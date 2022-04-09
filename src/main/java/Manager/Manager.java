package Manager;
import Manager.ManagerIoHandler;

public class Manager {
    private int ID;
    private String Name, Contact, Email, Address, Username, Password;
    

    public Manager(int ID,String Name,String Email,String Contact, String Address, String Username, String Password) {
        this.ID = ID;
        this.Name = Name;
        this.Email = Email;
        this.Contact = Contact;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
        
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
     public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    
}

