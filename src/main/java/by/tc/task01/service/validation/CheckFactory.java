package by.tc.task01.service.validation;

import java.util.List;

public class CheckFactory {
    private static final CheckFactory instance=new CheckFactory();

    private CheckFactory(){};

    public static CheckFactory getInstance(){return instance;}

    public CheckValue checkNumber(List<Number> numbers){return new CheckNumberValue(numbers);}
    public CheckValue checkString(List<String> strings ) {return new CheckStringValue(strings);}


}
