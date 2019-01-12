package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Validator {

    public static <E> boolean criteriaValidator(Criteria<E> criteria){
	    List<Object> valuesList=new ArrayList<>();

	    Collections.addAll(valuesList,criteria.criteriaValues());

        if (valuesList.contains(null)){
            return false;
        } else return checkNumericValues(valuesList);
    }


    private static boolean checkNumericValues(List<Object> values)
    {
        for (Object value:values)
        {
            if (value instanceof Number){
                if (((Number) value).doubleValue()<0){
                      return false;
                }
            } else return false;
        }

            return true;
    }

}

