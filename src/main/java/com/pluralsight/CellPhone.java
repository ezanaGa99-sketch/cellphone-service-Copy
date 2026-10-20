
package com.pluralsight;

public class CellPhone {

    // Cell phone properties
    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    // Constructor
    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    // Serial Number Getter
    public int getSerialNumber() {
        return serialNumber;
    }

    // Serial Number Setter
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    // Model Getter
    public String getModel() {
        return model;
    }

    // Model Setter
    public void setModel(String model) {
        this.model = model;
    }

    // Carrier Getter
    public String getCarrier() {
        return carrier;
    }

    // Carrier Setter
    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    // Phone Number Getter
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Phone Number Setter
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Owner Getter
    public String getOwner() {
        return owner;
    }

    // Owner Setter
    public void setOwner(String owner) {
        this.owner = owner;
    }
}
