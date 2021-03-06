package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.exception.DAOException;
import by.tc.task01.exception.ServiceException;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.io.IOException;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public <E> List<Appliance> find(Criteria<E> criteria, String dataSource) throws ServiceException  {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();

		List<Appliance> appList=null;
		try {
			appList=applianceDAO.find(criteria, dataSource);
		}catch (DAOException e){
			throw new ServiceException(e);
		}

		return  appList;

	}

}

//you may addCriteria your own new classes
