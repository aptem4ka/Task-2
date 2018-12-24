package by.tc.task01.entity;

import java.util.Objects;

public class TabletPC extends PortableElectronics{
    private int flashMemory;
    private String color;

    public TabletPC(double batteryCapacity, double weight, double memoryRom, int flashMemory, String color) {
        super(batteryCapacity, weight, memoryRom);
        this.flashMemory = flashMemory;
        this.color = color;
    }

    public TabletPC(int flashMemory, String color) {
        this.flashMemory = flashMemory;
        this.color = color;
    }

    public TabletPC(double batteryCapacity, double weight, double memoryRom) {
        super(batteryCapacity, weight, memoryRom);
    }

    public TabletPC() {
    }

    public int getFlashMemory() {
        return flashMemory;
    }

    public void setFlashMemory(int flashMemory) {
        this.flashMemory = flashMemory;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return flashMemory == tabletPC.flashMemory &&
                Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), flashMemory, color);
    }

    @Override
    public String toString() {
        return "TabletPC{" + super.toString()+
                ", flashMemory=" + flashMemory +
                ", color='" + color + '\'' +
                '}';
    }

    // you may add your own code here
}
