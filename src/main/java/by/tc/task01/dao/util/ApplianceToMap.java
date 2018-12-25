package by.tc.task01.dao.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceToMap {

    private final static Pattern PATTERN=Pattern.compile("(\\w+)=(\\w+[-]?[\\.]?\\w*)");

    public static Map<String,String> convert(String appliance)
    {
        Map<String,String> characteristicsMap=new HashMap<>();
        Matcher matcher=PATTERN.matcher(appliance);
        while (matcher.find())
        {
          characteristicsMap.put(matcher.group(1),matcher.group(2).toUpperCase());
        }
        return characteristicsMap;
    }

}
