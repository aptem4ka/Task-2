package by.tc.task01.dao.impl;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ApplianceDAOImplTest {

    @Test
    public void find() {
        Appliance appliance;
        ServiceFactory factory = ServiceFactory.getInstance();
        ApplianceService service = factory.getApplianceService();

        //////////////////////////////////////////////////////////////////

        Criteria<SearchCriteria.Oven> criteria=new Criteria<>();
        criteria.add(SearchCriteria.Oven.HEIGHT,45.5);
        List<Appliance> appliances=service.find(criteria, "src\\main\\resources\\appliances_db.txt");

        for (Appliance appliance1:appliances)
        {
            System.out.println(appliance1.toString());
        }


    }
}