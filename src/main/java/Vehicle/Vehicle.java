package Vehicle;
import Vehicle.VehicleIoHandler;

import java.util.Date;

public class Vehicle {
    private int ID,mfgYear, dRate;
    private String manufacturer, model, vReg, color;

    public Vehicle(int ID, int mfgYear, int dRate, String manufacturer, String model, String vReg, String color) {
        this.ID = ID;
        this.mfgYear = mfgYear;
        this.dRate = dRate;
        this.manufacturer = manufacturer;
        this.model = model;
        this.vReg = vReg;
        this.color = color;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getMfgYear() {
        return mfgYear;
    }

    public void setMfgYear(int mfgYear) {
        this.mfgYear = mfgYear;
    }

    public int getdRate() {
        return dRate;
    }

    public void setdRate(int dRate) {
        this.dRate = dRate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getvReg() {
        return vReg;
    }

    public void setvReg(String vReg) {
        this.vReg = vReg;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    




}
