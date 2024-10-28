package org.example.demodevice;

public class Tablet extends Device {
    protected double batteryLife;
    protected boolean hasStylus;

    // Default constructor
    public Tablet() {}

    // Constructor calling the parent class (Device) constructor
    public Tablet(DeviceType type, String name, double price, double weight) {
        super(type, name, price, weight);
    }

    // Full constructor with additional attributes for Tablet
    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    // Getters and setters for the additional attributes
    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean hasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", batteryLife=" + batteryLife +
                ", hasStylus=" + hasStylus +
                '}';
    }
}
