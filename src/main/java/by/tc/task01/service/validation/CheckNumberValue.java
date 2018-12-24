package by.tc.task01.service.validation;

import java.util.List;

public class CheckNumberValue implements CheckValue {
    List<Number> values;

    public CheckNumberValue(List<Number> values) {
        this.values = values;
    }

    @Override
    public boolean check() {

        for (Number number: values)
        {
            if (number.doubleValue()<=0)
                return false;
        }

        return true;
    }
}
