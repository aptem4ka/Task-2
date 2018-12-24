package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.util.ApplianceToMap;
import by.tc.task01.dao.util.CompareMaps;
import by.tc.task01.dao.util.CriteriaToString;
import by.tc.task01.dao.util.SetCharachteristics;
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

	public <E> List<Appliance> find(Criteria<E> criteria)  {

		List<Appliance> appliances=new ArrayList<>();

		BufferedReader br=null;
		try {

			br = new BufferedReader(new FileReader("src\\main\\resources\\appliances_db.txt"));
		}catch (IOException e){};

		List<String> strings=new ArrayList<>();

		try {
			while (br.ready()){
				String buffer=br.readLine();
				if (buffer.startsWith(criteria.getGenericClassName()))
					strings.add(buffer);			//strings-все строчки с данным товаром
			}
		}catch (IOException e){}

		CriteriaToString criteriaToString =new CriteriaToString();
		Map<String,String> criteriasMap= criteriaToString.criteriasMap(criteria);	//карта "критерий поиска-значение"
		Map<String, String> charasteristicsMap;
		boolean isFound=true;

		for (String x:strings) {
			ApplianceToMap applianceToMap = new ApplianceToMap();
			charasteristicsMap = applianceToMap.convert(x);		//Характеристики из списка, собранные в карту
			if (CompareMaps.checkMaps(charasteristicsMap,criteriasMap))
			{
				Appliance appliance= CreateApplianceByCriteria.getInstance().createAppliance(criteria);
				SetCharachteristics.set(appliance,x); //Реализовать иначе
				appliances.add(appliance);
			}
		}

				return appliances;

	}


}
