import dish.DishReadModel;
import dish.Oatmeal;
import dish.Sandwich;
import dish.components.Bread;
import dish.components.Milk;

public class Main {
    public static void main(String[] args) {

        Sandwich sandwich = new Sandwich("Sandwich test", Bread.WHITE_BREAD);

        sandwich.addComponent("Egg", 2);
        sandwich.addComponent("Bacon", 3);
        sandwich.addComponent("Lettuce", 2);
        sandwich.addComponent("Mayo", 1);

        System.out.println(sandwich.getPrice());

        DishReadModel.dishReader(sandwich);

        System.out.println("///////////////////////////////////////");


        Oatmeal oatmeal = new Oatmeal("Oatmeal test", Milk.MILK);

        oatmeal.addComponent("Chocolate", 2);
        oatmeal.addComponent("Peanut", 3);
        oatmeal.addComponent("Banana", 2);

        System.out.println(oatmeal.getPrice());

        DishReadModel.dishReader(oatmeal);


        System.out.println("////////////////////////////////////////");

        Order testOrder = new Order();

        testOrder.addDishToOrder(sandwich);
        testOrder.addDishToOrder(oatmeal);

        OrderReaderModel.orderReader(testOrder);

    }
}
