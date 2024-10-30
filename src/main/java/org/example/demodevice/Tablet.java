package org.example.demodevice;

public class Tablet extends Device {
    private double batteryLife;
    private boolean hasStylus;

    public Tablet() {}

    public Tablet(DeviceType type, String name, double price, double weight, double batteryLife, boolean hasStylus) {
        super(type, name, price, weight);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "type=" + getType() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", Battery Life=" + batteryLife +
                " hours, Has Stylus=" + (hasStylus ? "Yes" : "No") +
                '}';
    }
}
