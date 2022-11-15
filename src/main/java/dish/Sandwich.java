package dish;

import dish.components.Bread;
import dish.components.Component;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor

public class Sandwich implements Dish{
    private String name;
    private Bread bread;
    private List<Component> componentList = new LinkedList<>();
    private double price;

    public Sandwich(String name, Bread bread) {
        this.name = name;
        this.bread = bread;
    }

    @Override
    public boolean addComponent(String compName, double compPrice) {
        try {
            componentList.add(new Component(compName, compPrice));
            System.out.println("Component " + compName + "  has been added");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteComponent(String compName) {
        try {
            Component temp = componentList.stream()
                    .filter(component -> compName.equals(component.getName()))
                    .findAny()
                    .orElse(null);
            componentList.remove(temp);
            System.out.println("Component deleted");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public double getPrice() {
        price = bread.getPrice();
        componentList
                .forEach(component -> price += component.getPrice());
        return price;
    }
}
