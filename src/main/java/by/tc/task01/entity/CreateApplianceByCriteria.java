package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class CreateApplianceByCriteria {
    private static final CreateApplianceByCriteria instance=new CreateApplianceByCriteria();

    public static CreateApplianceByCriteria getInstance(){
        return instance;
    }

    public <E> Appliance createAppliance(Criteria<E> criteria){

        if (criteria.getGenericClassName().equals(Laptop.class.getSimpleName()))
            return new Laptop();
        if (criteria.getGenericClassName().equals(Oven.class.getSimpleName()))
            return new Oven();
        if (criteria.getGenericClassName().equals(Refrigerator.class.getSimpleName()))
            return new Refrigerator();
        if (criteria.getGenericClassName().equals(Speakers.class.getSimpleName()))
            return new Speakers();
        if (criteria.getGenericClassName().equals(TabletPC.class.getSimpleName()))
            return new TabletPC();
        if (criteria.getGenericClassName().equals(VacuumCleaner.class.getSimpleName()))
            return new VacuumCleaner();


        else return null;
    }

}
