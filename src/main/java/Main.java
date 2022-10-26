import dish.DishReadModel;
import dish.Oatmeal;
import dish.Sandwich;
import dish.components.Bread;
import dish.components.Milk;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Sandwich sandwich = new Sandwich("Sandwich test", Bread.WHITE_BREAD);

        sandwich.addComponent("Jajko", 2);
        sandwich.addComponent("Bekon", 3);
        sandwich.addComponent("Majonez", 1);

        System.out.println(sandwich.getPrice());

        DishReadModel.dishReader(sandwich);

        System.out.println("///////////////////////////////////////");


        Oatmeal oatmeal = new Oatmeal("Oatmeal test", Milk.SOY_MILK);

        oatmeal.addComponent("Czekolada", 2);
        oatmeal.addComponent("Masło orzechowe", 3);
        oatmeal.addComponent("Banan", 2);

        System.out.println(oatmeal.getPrice());

        DishReadModel.dishReader(oatmeal);


        System.out.println("////////////////////////////////////////");

        Order testOrder = new Order();

        testOrder.addDishToOrder(sandwich);
        testOrder.addDishToOrder(oatmeal);

        OrderReaderModel.orderReader(testOrder);








    }
}
