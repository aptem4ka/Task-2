package by.tc.task01.dao.util;

import by.tc.task01.entity.*;

import java.sql.Ref;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SetCharachteristics {

    private Map<String,String> characteristicsMap=new HashMap<>();
    private static final Pattern PATTERN=Pattern.compile("(\\w+)=(\\w+[-]?[\\.]?\\w*)");

    public static void set(Appliance appliance, String characteristics)
    {
        if (appliance instanceof Oven)
            setOven((Oven)appliance,characteristics);
        if (appliance instanceof Laptop)
            setLaptop((Laptop)appliance,characteristics);
        if (appliance instanceof Refrigerator)
            setRefrigerator((Refrigerator)appliance,characteristics);
        if (appliance instanceof VacuumCleaner)
            setVacuumCleaner((VacuumCleaner)appliance,characteristics);
        if (appliance instanceof TabletPC)
            setTabletPC((TabletPC)appliance,characteristics);
        if (appliance instanceof Speakers)
            setSpeakers((Speakers)appliance,characteristics);


    }

    public static void setOven(Oven appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setPowerConsumption(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setWeight(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setCapacity(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setDepth(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setHeight(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setWidth(Double.parseDouble(matcher.group(2)));

    }

    public static void setLaptop(Laptop appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setBatteryCapacity(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setOS(matcher.group(2));
        if (matcher.find())
            appliance.setMemoryRom(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setSystemMemory(Integer.parseInt(matcher.group(2)));
        if (matcher.find())
            appliance.setCPU(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setDisplayInches(Double.parseDouble(matcher.group(2)));
    }

    public static void setRefrigerator(Refrigerator appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setPowerConsumption(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setWeight(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setFreezerCapacity(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setOverallCapacity(Integer.parseInt(matcher.group(2)));
        if (matcher.find())
            appliance.setHeight(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setWidth(Double.parseDouble(matcher.group(2)));

    }
    public static void setVacuumCleaner(VacuumCleaner appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setPowerConsumption(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setFilterType(matcher.group(2));
        if (matcher.find())
            appliance.setBagType(matcher.group(2));
        if (matcher.find())
            appliance.setWandType(matcher.group(2));
        if (matcher.find())
            appliance.setMotorSpeedRegulation(Integer.parseInt(matcher.group(2)));
        if (matcher.find())
            appliance.setCleaningWidth(Integer.parseInt(matcher.group(2)));
    }

    public static void setTabletPC(TabletPC appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setBatteryCapacity(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setDisplayInches(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setMemoryRom(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setFlashMemory(Integer.parseInt(matcher.group(2)));
        if (matcher.find())
            appliance.setColor(matcher.group(2));

    }

    public static void setSpeakers(Speakers appliance, String characteristics)
    {
        Matcher matcher=PATTERN.matcher(characteristics);
        if (matcher.find())
            appliance.setPowerConsumption(Double.parseDouble(matcher.group(2)));
        if (matcher.find())
            appliance.setNumberOfSpeakers(Integer.parseInt(matcher.group(2)));
        if (matcher.find())
            //appliance.set(Double.parseDouble(matcher.group(2)));
        {
            String range=matcher.group(2);
            String delimeter="-";
            String[] minMax=range.split(delimeter);
            appliance.setMinFrequency(Double.parseDouble(minMax[0]));
            appliance.setMaxFrequency(Double.parseDouble(minMax[1]));
        }
        if (matcher.find())
            appliance.setCordLength(Double.parseDouble(matcher.group(2)));

    }

}
