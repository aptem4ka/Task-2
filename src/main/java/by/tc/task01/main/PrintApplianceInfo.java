package by.tc.task01.main;

import by.tc.task01.dao.util.convert.CriteriaToStringCollection;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import java.util.List;

public class PrintApplianceInfo {
	
	public static <E> void print(List<Appliance> appliances, Criteria<E> criteria) {
		List<String> criteriaList = new CriteriaToStringCollection(criteria).criteriaList();

		System.out.printf("Searching %s by criteria:", criteria.genericClassName());

		for (String line:criteriaList)
		{
			System.out.print(line+" ");
		}
		System.out.println();

		if (appliances.isEmpty()){
			System.out.println("The search has no results\n" +
					"==================================");
		} else {
			for (Appliance appliance:appliances)
			{
				System.out.println(appliance.toString());
			}
			System.out.println("==================================");
			}




		
	}
	


}
