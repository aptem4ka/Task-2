package by.tc.task01.dao.util;

import java.util.Map;

public class MapMatcher {

    public static boolean matches(Map<String,String> charasteristics, Map<String,String> criteria)
    {
        for(Map.Entry<String,String> criteriaPair:criteria.entrySet())
        {
            if (charasteristics.containsKey(criteriaPair.getKey())) {
                String charasteristicValue=charasteristics.get(criteriaPair.getKey());
                if (criteriaPair.getValue().equals(charasteristicValue)){
                    continue;
                }
                    else return false;
            }
        }
        return true;
    }

}
