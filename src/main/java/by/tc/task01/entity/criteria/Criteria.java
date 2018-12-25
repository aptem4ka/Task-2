package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private final Map<E, Object> criteria = new HashMap<>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object[] getValues()
	{
		return criteria.values().toArray();
	}

	public String getGenericClassName(){
		Map.Entry<E,Object> pair;
		if (!criteria.isEmpty())
		{
			pair=criteria.entrySet().iterator().next();
		return pair.getKey().getClass().getSimpleName();}
		else return null; //КИНУТЬ ИСКЛЮЧЕНИЕ???????????????????????????????????????????
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

}
