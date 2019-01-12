package by.tc.task01.entity.util;

import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

public class ApplianceFactory {
    private static final ApplianceFactory instance=new ApplianceFactory();

    public static ApplianceFactory getInstance(){
        return instance;
    }

    public <E> Appliance createAppliance(Criteria<E> criteria){

        if (criteria.genericClassName().equals(Laptop.class.getSimpleName()))
            return new Laptop();
        if (criteria.genericClassName().equals(Oven.class.getSimpleName()))
            return new Oven();
        if (criteria.genericClassName().equals(Refrigerator.class.getSimpleName()))
            return new Refrigerator();
        if (criteria.genericClassName().equals(Speakers.class.getSimpleName()))
            return new Speakers();
        if (criteria.genericClassName().equals(TabletPC.class.getSimpleName()))
            return new TabletPC();
        if (criteria.genericClassName().equals(VacuumCleaner.class.getSimpleName()))
            return new VacuumCleaner();

        else return null;
    }

}
