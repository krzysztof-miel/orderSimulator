import dish.Dish;
import dish.DishReadModel;

public class OrderReaderModel {

    public static void orderReader(Order order) {
        System.out.println("Order number " + order.getId());
        for (Dish dish: order.getDishes()) {
            DishReadModel.dishReader(dish);
        }
    }
}
