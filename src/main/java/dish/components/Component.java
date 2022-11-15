package dish.components;

import lombok.Getter;

@Getter
public class Component {
    String name;
    double price;


    public Component(String name, double price) {
        this.name = name;
        this.price = price;

    }
}
