package by.tc.task01.dao.util;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriteriaToString<E> {



    public Map<String,String> criteriasMap(Criteria<E> criteria){
    Map<String,String> criteriasMap=new HashMap<>();
        for (Map.Entry<E,Object> pair:criteria.getCriteria().entrySet())
        {
        String key=pair.getKey().toString();
        String val=pair.getValue().toString().toUpperCase();
        criteriasMap.put(key,val);
        }
    return criteriasMap;
    }

    public List<String> criteriasList(Criteria<E> criteria)
    {
        List<String> criteriasList=new ArrayList<>();

        for (Map.Entry<E,Object> pair:criteria.getCriteria().entrySet())
        {
            String key=pair.getKey().toString();
            String val=pair.getValue().toString().toUpperCase();
            criteriasList.add(key+"="+val);
        }
        return criteriasList;
    }
}
