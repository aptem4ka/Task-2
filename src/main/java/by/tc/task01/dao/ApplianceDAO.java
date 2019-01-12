package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.DAOException;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
	<E> List<Appliance> find(Criteria<E> criteria, String dataSource) throws DAOException;
//Ищет по набору критериев и возвращает соответствующую сущность
}
