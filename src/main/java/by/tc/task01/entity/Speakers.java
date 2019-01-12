package by.tc.task01.entity;

import java.util.Objects;

public class Speakers extends WiredAppliance{
    private int numberOfSpeakers;
    private double minFrequency;
    private double maxFrequency;
    private double cordLength;

    public Speakers(double powerConsumption, int numberOfSpeakers, double minFrequency, double maxFrequency, double cordLength) {
        super(powerConsumption);
        this.numberOfSpeakers = numberOfSpeakers;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
        this.cordLength = cordLength;
    }

    public Speakers(int numberOfSpeakers, double minFrequency, double maxFrequency, double cordLength) {
        this.numberOfSpeakers = numberOfSpeakers;
        this.minFrequency = minFrequency;
        this.maxFrequency = maxFrequency;
        this.cordLength = cordLength;
    }

    public Speakers(double powerConsumption) {
        super(powerConsumption);
    }

    public Speakers() {
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public double getMinFrequency() {
        return minFrequency;
    }

    public void setMinFrequency(double minFrequency) {
        this.minFrequency = minFrequency;
    }

    public double getMaxFrequency() {
        return maxFrequency;
    }

    public void setMaxFrequency(double maxFrequency) {
        this.maxFrequency = maxFrequency;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return numberOfSpeakers == speakers.numberOfSpeakers &&
                Double.compare(speakers.minFrequency, minFrequency) == 0 &&
                Double.compare(speakers.maxFrequency, maxFrequency) == 0 &&
                Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSpeakers, minFrequency, maxFrequency, cordLength);
    }

    @Override
    public String toString() {
        return "Speakers{" + super.toString()+
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", minFrequency=" + minFrequency +
                ", maxFrequency=" + maxFrequency +
                ", cordLength=" + cordLength +
                '}';
    }
    // you may addCriteria your own code here
}
