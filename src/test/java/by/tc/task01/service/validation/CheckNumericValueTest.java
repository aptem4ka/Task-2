package by.tc.task01.service.validation;
import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.dao.util.convert.CriteriaToStringCollection;

import by.tc.task01.entity.criteria.Criteria;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumericValueTest {

   @Test
    public void testmethod()
   {
      // BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\appliances_db.txt"));
       Criteria<Oven> criteria=new Criteria<>();
       criteria.addCriteria(Oven.CAPACITY,100);

       String regex="\\w+=\\w";
       String text="Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70;";
        Pattern pattern=Pattern.compile(regex);
       Matcher matcher=pattern.matcher(text);

       Pattern pattern2=Pattern.compile("(\\w+)=(\\w*)");
       Matcher matcher2=pattern2.matcher("Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70;");


       while (matcher2.find())
       {
           System.out.println(matcher2.group(1)+"_____"+matcher2.group(2));

       }
       CriteriaToStringCollection criteriaToStringCollection =new CriteriaToStringCollection(criteria);
       Map<String,String> criteriasMap= criteriaToStringCollection.criteriaMap();
        for (Map.Entry<String,String> pair:criteriasMap.entrySet())
        {
            System.out.println(pair.getKey()+"___"+pair.getValue());
        }
    }

}