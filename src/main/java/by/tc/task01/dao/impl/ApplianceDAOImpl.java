package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.util.*;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.CreateApplianceByCriteria;
import by.tc.task01.entity.criteria.Criteria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	public <E> List<Appliance> find(Criteria<E> criteria, String dataSource)  {

		List<Appliance> appliances=new ArrayList<>();
		List<String> strings=new DataFromFile().getData(dataSource, criteria);
		CriteriaToString criteriaToString =new CriteriaToString();
		Map<String,String> criteriasMap= criteriaToString.criteriasMap(criteria);	//карта "критерий поиска - искомое значение"

		for (String x:strings) {
			Map<String, String> charasteristicsMap = ApplianceToMap.convert(x);		//Характеристики из списка, собранные в карту

			if (CompareMaps.checkMaps(charasteristicsMap,criteriasMap))
			{
				Appliance appliance= CreateApplianceByCriteria.getInstance().createAppliance(criteria);
				SetCharachteristics.set(appliance,x);
				appliances.add(appliance);
			}
		}
				return appliances;

	}


}
