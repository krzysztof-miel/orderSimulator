package dish.components;

import lombok.Getter;

@Getter
public class Component {
    String name = null;
    double price = 0.0;


    public Component(String name, double price) {
        this.name = name;
        this.price = price;

    }
}
