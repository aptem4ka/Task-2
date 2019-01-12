package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {

	private final Map<E, Object> criteria = new HashMap<>();

	public void addCriteria(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object[] criteriaValues()
	{
		return criteria.values().toArray();
	}

	public String genericClassName(){
		Map.Entry<E,Object> pair;
		if (!criteria.isEmpty())
		{
			pair=criteria.entrySet().iterator().next();
			return pair.getKey().getClass().getSimpleName();
		}
			else return null;
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

}
