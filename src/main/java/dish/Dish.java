package dish;

import dish.components.Component;

import java.util.List;

public interface Dish {

    boolean addComponent(String compName, double compPrice);

    boolean deleteComponent(String compName);

    double getPrice();

    String getName();

    List<Component> getComponentList();



}
