package org.example.demodevice;

public class Laptop extends Device {
    private int ramSize;
    private String processorType;

    public Laptop() {}

    public Laptop(DeviceType type, String name, double price, double weight, int ramSize, String processorType) {
        super(type, name, price, weight);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }

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
                "type=" + getType() +
                ", name='" + getName() + '\'' +
                ", price=" + getPrice() +
                ", weight=" + getWeight() +
                ", RAM Size=" + ramSize +
                "GB, Processor='" + processorType + '\'' +
                '}';
    }
}
