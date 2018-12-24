package by.tc.task01.entity;

import java.util.Objects;

public class Laptop extends PortableElectronics{
    private String OS;
    private int systemMemory;
    private double CPU;

    public Laptop(double batteryCapacity, double weight, double memoryRom, String OS, int systemMemory, double CPU) {
        super(batteryCapacity, weight, memoryRom);
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
    }

    public Laptop(String OS, int systemMemory, double CPU) {
        this.OS = OS;
        this.systemMemory = systemMemory;
        this.CPU = CPU;
    }

    public Laptop(double batteryCapacity, double weight, double memoryRom) {
        super(batteryCapacity, weight, memoryRom);
    }

    public Laptop() {
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCPU() {
        return CPU;
    }

    public void setCPU(double CPU) {
        this.CPU = CPU;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return systemMemory == laptop.systemMemory &&
                Double.compare(laptop.CPU, CPU) == 0 &&
                Objects.equals(OS, laptop.OS);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), OS, systemMemory, CPU);
    }

    @Override
    public String toString() {
        return "Laptop{" + super.toString()+
                ", OS='" + OS + '\'' +
                ", systemMemory=" + systemMemory +
                ", CPU=" + CPU +
                '}';
    }

    // you may add your own code here
}
