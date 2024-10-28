package org.example.demodevice;

public class Laptop extends Device {
    protected int ramSize;
    protected String processorType;

    // Default constructor
    public Laptop() {}

    // Constructor calling the parent class (Device) constructor
    public Laptop(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    // Full constructor with additional attributes for Laptop
    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

    // Getters and setters for the additional attributes
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", ramSize=" + ramSize +
                ", processorType='" + processorType + '\'' +
                '}';
    }
}
