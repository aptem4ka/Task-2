package by.tc.task01.main;

import by.tc.task01.dao.util.CriteriaToString;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;
import java.util.Map;

public class PrintApplianceInfo {
	
	public static <E> void print(List<Appliance> appliances, Criteria<E> criteria) {
		List<String> criterias = new CriteriaToString<E>().criteriasList(criteria);


		System.out.printf("Searching %s with such criterias:", criteria.getGenericClassName());
		criterias.stream().forEach(s -> {
			System.out.print(s + " ");
				});
		System.out.println();
		if (appliances.isEmpty())
			System.out.println("There is no such appliances in DB");
		else {

				for (Appliance app : appliances) {
				System.out.println(app.toString());

				}
			}




		
	}
	
	// you may add your own code here

}
