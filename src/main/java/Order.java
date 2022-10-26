import dish.Dish;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Getter
@Setter

public class Order {
    private int id;
    private List<Dish> dishes = new ArrayList<>();
    private static AtomicInteger ID_GENERATOR = new AtomicInteger(1);

    public Order() {
        id = ID_GENERATOR.getAndIncrement();
    }

    public boolean addDishToOrder(Dish dish) {
        if (dish != null) {
            dishes.add(dish);
            System.out.println("Danie " + dish.getName() + " zostało dodane");
            return true;
        }
        System.out.println("Dodawanie nie powiodło się");
        return false;
    }

    public boolean removeDishFromList(Dish dish) {
        if (dish != null && dishes.contains(dish)) {
            dishes.remove(dish);
            System.out.println("Danie" + dish.getName() + " zostało usunięte");
            return true;
        }
        System.out.println("Usuwanie nie powiodło się");
        return false;
    }





}
