package Manager;
import Manager.ManagerIoHandler;

public class Manager {
    private String Name, Contact, Email, Address, Username, Password;
    private int ID;

    public Manager(int ID,String Name, String Contact, String Email, String Address, String Username, String Password) {
        this.Name = Name;
        this.Contact = Contact;
        this.Email = Email;
        this.Address = Address;
        this.Username = Username;
        this.Password = Password;
        this.ID = ID;
    }
    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String Contact) {
        this.Contact = Contact;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

