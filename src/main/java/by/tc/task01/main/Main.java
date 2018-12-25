package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;
		String dataSource="src\\main\\resources\\appliances_db.txt";
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria<Oven> criteriaOven = new Criteria<>();
		criteriaOven.add(Oven.CAPACITY, 33);

		appliance = service.find(criteriaOven,dataSource);

		PrintApplianceInfo.print(appliance, criteriaOven);

		//////////////////////////////////////////////////////////////////


		criteriaOven = new Criteria<>();
		criteriaOven.add(Oven.HEIGHT, 45.5);
		criteriaOven.add(Oven.DEPTH, 60);

		appliance = service.find(criteriaOven,dataSource);


			PrintApplianceInfo.print(appliance, criteriaOven);


		//////////////////////////////////////////////////////////////////

		Criteria<TabletPC> criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);

		appliance = service.find(criteriaTabletPC,dataSource);

		PrintApplianceInfo.print(appliance,criteriaTabletPC);

		criteriaTabletPC = new Criteria<>();
		criteriaTabletPC.add(TabletPC.MEMORY_ROM, 9999);

		appliance = service.find(criteriaTabletPC,dataSource);

		PrintApplianceInfo.print(appliance,criteriaTabletPC);

	}

}
