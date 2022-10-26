import dish.Dish;
import dish.DishReadModel;

public class OrderReaderModel {

    public static void orderReader(Order order) {
        System.out.println("Zamówienie nr " + order.getId());
        for (Dish dish: order.getDishes()) {
            DishReadModel.dishReader(dish);
        }
    }
}
