package by.tc.task01.dao.util.convert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharacteristicsToMap {
    private final static Pattern PATTERN=Pattern.compile("(\\w+)=(\\w+[-]?[\\.]?\\w*)");
    private final Map<String,String> characteristicsMap=new HashMap<>();
    private final String charasteristicsLine;

    public CharacteristicsToMap(String charasteristicsLine) {
        this.charasteristicsLine = charasteristicsLine;
    }

    public Map<String, String> getCharacteristicsMap() {
        Matcher matcher=PATTERN.matcher(charasteristicsLine);
        while (matcher.find())
        {
            characteristicsMap.put(matcher.group(1),matcher.group(2).toUpperCase());
        }
        return characteristicsMap;
    }



}
