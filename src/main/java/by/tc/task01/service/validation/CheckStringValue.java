package by.tc.task01.service.validation;

import java.util.List;

public class CheckStringValue implements CheckValue {
  private List<String> values;

    public CheckStringValue(List<String> values) {
        this.values = values;
    }

    @Override
    public boolean check() {

        for (String x:values)
        {
            if (x==null)
                return false;

            if (x!=null)
            {
                if (x.isEmpty())
                return false;
            }
        }

        return true;
    }
}
