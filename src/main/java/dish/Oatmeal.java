package dish;

import dish.components.Component;
import dish.components.Milk;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Oatmeal  implements Dish{
    private String name;
    private Milk milk;
    private List<Component> componentList = new LinkedList<>();
    private double price;

    public Oatmeal(String name, Milk milk) {
        this.name = name;
        this.milk = milk;
    }


    @Override
    public boolean addComponent(String compName, double compPrice) {
        try {
            componentList.add(new Component(compName, compPrice));
            System.out.println("Składnik " + compName + " został dodany do owsianki");
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
            System.out.println("Składnik został usunięty");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public double getPrice() {
        price = milk.getPrice();
        componentList.stream()
                .forEach(component -> price += component.getPrice());
        return price;
    }
}
