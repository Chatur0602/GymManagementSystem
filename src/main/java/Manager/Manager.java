package Manager;
import Manager.ManagerIoHandler;

public class Manager {
    private int ID;
    private String name, contact, eMail, address, username, password;
    

    public Manager(int ID, String name, String eMail, String contact, String address, String username, String password) {
        this.ID = ID;
        this.name = name;
        this.eMail = eMail;
        this.contact = contact;
        this.address = address;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    
}

