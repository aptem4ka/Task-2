package by.tc.task01.entity;

import java.util.Objects;

public abstract class PortableElectronics implements Appliance{
    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;

    public PortableElectronics(double batteryCapacity, double displayInches, double memoryRom) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
    }

    public PortableElectronics() {
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double weight) {
        this.displayInches = weight;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PortableElectronics that = (PortableElectronics) o;
        return Double.compare(that.batteryCapacity, batteryCapacity) == 0 &&
                Double.compare(that.displayInches, displayInches) == 0 &&
                Double.compare(that.memoryRom, memoryRom) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom);
    }

    @Override
    public String toString() {
        return "batteryCapacity=" + batteryCapacity +
                ", displayInches=" + displayInches +
                ", memoryRom=" + memoryRom;
    }
}
