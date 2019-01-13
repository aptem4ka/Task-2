package by.tc.task01.dao.util.convert;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CriteriaToCollection<E> {

    private final Criteria<E> criteria;

    public CriteriaToCollection(Criteria<E> criteria) {
        this.criteria = criteria;
    }

    public Map<String,String> criteriaMap(){
    Map<String,String> criteriasMap=new HashMap<>();

        for (Map.Entry<E,Object> pair:criteria.getCriteria().entrySet())
        {
        String key=pair.getKey().toString();
        String val=pair.getValue().toString();
        criteriasMap.put(key,val);
        }
    return criteriasMap;
    }

    public List<String> criteriaList() {//criteria list for PrintApplianceInfo

        List<String> criteriaList=new ArrayList<>();

        for (Map.Entry<E,Object> pair:criteria.getCriteria().entrySet())
        {
            String key=pair.getKey().toString();
            String val=pair.getValue().toString().toUpperCase();
            criteriaList.add(key+"="+val);
        }
        return criteriaList;
    }
}
