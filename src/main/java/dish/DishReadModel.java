package dish;

import dish.components.Component;

import java.util.List;

public class DishReadModel {

    private static String getComponentsString(List<Component> compList) {
        String components = "";

        for (Component component: compList) {
            components += (component.getName() + ", ");
        }
        components = components.substring(0, components.length()-2);

        return components ;
    }

    public static void dishReader(Dish dish) {
        if (dish.getClass() == Sandwich.class) {
            System.out.println("Sandwich " + dish.getName() +
                    " with " + getComponentsString(dish.getComponentList()) +
                    " on " + ((Sandwich) dish).getBread() +
                    " -> cost: " + dish.getPrice());
        }else {
            System.out.println("Oatmeal " + dish.getName() +
                    " with " + getComponentsString(dish.getComponentList()) +
                    " on " + ((Oatmeal) dish).getMilk() +
                    " -> cost: " + dish.getPrice());
        }
    }
}
