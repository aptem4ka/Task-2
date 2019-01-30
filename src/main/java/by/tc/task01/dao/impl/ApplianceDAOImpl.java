package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.util.*;
import by.tc.task01.dao.util.convert.CharacteristicsToMap;
import by.tc.task01.dao.util.convert.CriteriaToCollection;
import by.tc.task01.dao.util.Reader;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.util.ApplianceSetup;
import by.tc.task01.entity.util.ApplianceFactory;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.DAOException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO {

	public <E> List<Appliance> find(Criteria<E> criteria, String dataSource) throws DAOException {

		List<String> applianceLines;
		try {
			applianceLines = new Reader().takeData(dataSource, criteria);
		} catch (IOException e) {
			throw new DAOException(e);
		}
		return searchFromLines(applianceLines, criteria);

	}

	private <E> List<Appliance> searchFromLines(List<String> applianceLines, Criteria<E> criteria) {
		List<Appliance> appliances = new ArrayList<>();

		Map<String, String> criteriaMap = new CriteriaToCollection(criteria).criteriaMap();    //map "search criteria - criteria value"
		for (String line : applianceLines) {
			Map<String, String> charasteristicsMap = new CharacteristicsToMap(line).getCharacteristicsMap();//map "char.name - char.value" from datasource

			if (MapMatcher.matches(charasteristicsMap, criteriaMap)) {
				Appliance appliance = ApplianceFactory.getInstance().createAppliance(criteria);
				ApplianceSetup.set(appliance, line);
				appliances.add(appliance);
			}
		}
		return appliances;


	}
}
