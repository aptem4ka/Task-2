package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

import java.util.HashMap;
import java.util.Map;

public class Criteria<E> {
//Чтобы узнать тип Е, можно использовать переменную типа Класс
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Object[] getValues()
	{
		return criteria.values().toArray();
	}

	public String getGenericClassName(){
		Map.Entry<E,Object> pair=null;
		if (!criteria.isEmpty())
		{
			pair=criteria.entrySet().iterator().next();

		return pair.getKey().getClass().getSimpleName();}
		else return null; //КИНУТЬ ИСКЛЮЧЕНИЕ???????????????????????????????????????????
	}

	public Map<E, Object> getCriteria() {
		return criteria;
	}

// you may add your own code here
//Создаем карту, у которой ключи - это енумы, а их пара - это объект значения, будь то число или строк, по которой едт поиск

	//прочие методы, такие как извлечение из критериев
}
