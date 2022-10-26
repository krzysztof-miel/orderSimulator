package dish;

import dish.components.Component;

import java.util.List;

public class DishReadModel {

//    public static void sandwichReader(Sandwich sandwich) {
//        System.out.println("Kanapka " + sandwich.getName() +
//                " z " + getComponentsString(sandwich.getComponentList()) +
//                " -> koszt: " + sandwich.getPrice());
//    }
//
//    public static void oatmealReader(Oatmeal oatmeal) {
//        System.out.println("Owsianka " + oatmeal.getName() +
//                " z " + getComponentsString(oatmeal.getComponentList()) +
//                " -> koszt: " + oatmeal.getPrice());
//    }


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
            System.out.println("Kanapka " + dish.getName() +
                    " z " + getComponentsString(dish.getComponentList()) +
                    " -> koszt: " + dish.getPrice());
        }else {
            System.out.println("Owsianka " + dish.getName() +
                    " z " + getComponentsString(dish.getComponentList()) +
                    " -> koszt: " + dish.getPrice());
        }
    }
}
