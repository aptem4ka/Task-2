package by.tc.task01.dao.util;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceToMap {
    private Map<String,String> characteristicsMap=new HashMap<>();
    private final Pattern PATTERN=Pattern.compile("(\\w+)=(\\w+[-]?[\\.]?\\w*)");

    public Map<String,String> convert(String appliance)
    {
        Matcher matcher=PATTERN.matcher(appliance);
        while (matcher.find())
        {
          characteristicsMap.put(matcher.group(1),matcher.group(2).toUpperCase());
        }
        return characteristicsMap;
    }

}
