package by.tc.task01.dao.util;

import java.util.Map;

public class CompareMaps {

    public static boolean checkMaps(Map<String,String> charasteristics, Map<String,String> criterias)
    {
        for(Map.Entry<String,String> pair:criterias.entrySet())
        {
            if (charasteristics.containsKey(pair.getKey())) {
                String charasteristicValue=charasteristics.get(pair.getKey());
                if (pair.getValue().equals(charasteristicValue)); else return false;
            }

        }
        return true;
    }

}
