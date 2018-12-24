package by.tc.task01.entity;

import java.util.Objects;

public class VacuumCleaner extends WiredAppliance{
    private String filterType;
    private String bagType;
    private String wandType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(double powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        super(powerConsumption);
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }

    public VacuumCleaner(double powerConsumption) {
        super(powerConsumption);
    }

    public VacuumCleaner() {
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return motorSpeedRegulation == that.motorSpeedRegulation &&
                cleaningWidth == that.cleaningWidth &&
                Objects.equals(filterType, that.filterType) &&
                Objects.equals(bagType, that.bagType) &&
                Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }

    @Override
    public String toString() {
        return "VacuumCleaner{" + super.toString()+
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation=" + motorSpeedRegulation +
                ", cleaningWidth=" + cleaningWidth +
                '}';
    }
    // you may add your own code here
}
