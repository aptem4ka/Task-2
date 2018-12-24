package by.tc.task01.service.validation;
import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.dao.util.CriteriaToString;

import by.tc.task01.entity.criteria.Criteria;
import org.junit.Test;

import java.io.IOException;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckNumberValueTest {

   @Test
    public void testmethod() throws IOException
   {
      // BufferedReader br = new BufferedReader(new FileReader("src\\main\\resources\\appliances_db.txt"));
       Criteria<Oven> criteria=new Criteria<Oven>();
       criteria.add(Oven.CAPACITY,100);

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
       CriteriaToString criteriaToString =new CriteriaToString();
       Map<String,String> criteriasMap= criteriaToString.criteriasMap(criteria);
        for (Map.Entry<String,String> pair:criteriasMap.entrySet())
        {
            System.out.println(pair.getKey()+"___"+pair.getValue());
        }
    }

}