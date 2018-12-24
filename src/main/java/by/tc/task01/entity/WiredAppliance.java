package by.tc.task01.entity;

import java.util.Objects;

public abstract class WiredAppliance implements Appliance {
    private double powerConsumption;

    public WiredAppliance(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public WiredAppliance() {
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WiredAppliance that = (WiredAppliance) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption);
    }

    @Override
    public String toString() {
        return "Power consumption=" + powerConsumption;
    }
}
