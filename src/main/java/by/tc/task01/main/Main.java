package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.io.File;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Properties;

public class Main {

	public static void main(String[] args) throws Exception {
		List<Appliance> appliance;
		ClassLoader classLoader= new Main().getClass().getClassLoader();
		String dataSource=classLoader.getResource("appliances_db.txt").getPath();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<>();
		criteriaOven.addCriteria(Oven.CAPACITY, 33);

		appliance = service.find(criteriaOven,dataSource);

		PrintApplianceInfo.print(appliance, criteriaOven);

		//////////////////////////////////////////////////////////////////


		criteriaOven = new Criteria<>();
		criteriaOven.addCriteria(Oven.HEIGHT, 45.5);
		criteriaOven.addCriteria(Oven.DEPTH, 60);

		appliance = service.find(criteriaOven,dataSource);


			PrintApplianceInfo.print(appliance, criteriaOven);


		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.addCriteria(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.addCriteria(TabletPC.DISPLAY_INCHES, 14);

		appliance = service.find(criteriaTabletPC,dataSource);

		PrintApplianceInfo.print(appliance,criteriaTabletPC);

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.addCriteria(TabletPC.MEMORY_ROM, 9999);

		appliance = service.find(criteriaTabletPC,dataSource);

		PrintApplianceInfo.print(appliance,criteriaTabletPC);

	}

}
