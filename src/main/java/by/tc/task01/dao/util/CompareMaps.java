package by.tc.task01.dao.util;

import java.util.Map;

public class CompareMaps {

    public static boolean checkMaps(Map<String,String> charasteristics, Map<String,String> criterias)
    {
        for(Map.Entry<String,String> pairCriteria:criterias.entrySet())
        {
            if (charasteristics.containsKey(pairCriteria.getKey())) {
                String charasteristicValue=charasteristics.get(pairCriteria.getKey());
                if (pairCriteria.getValue().equals(charasteristicValue)); else return false;
            }

        }
        return true;
    }

}
