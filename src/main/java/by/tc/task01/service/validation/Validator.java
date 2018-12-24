package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) {
		// you may add your own code here
        List<String> stringValues=new ArrayList<>();
        List<Number> numericValues=new ArrayList<>();
        boolean isCorrect=true;
		for (Object object:criteria.getValues())
        {
            if (object instanceof String)
            {stringValues.add((String)object);}
            else if (object instanceof Number)
            {numericValues.add((Number)object);}
        }

        if (!stringValues.isEmpty())
            isCorrect=CheckFactory.getInstance().checkString(stringValues).check();
        if (isCorrect)
        {if (!numericValues.isEmpty())
            isCorrect=CheckFactory.getInstance().checkNumber(numericValues).check();
        }
		
		return isCorrect;
	}

}

//you may add your own new classes