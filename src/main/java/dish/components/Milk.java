package dish.components;

public enum Milk {
    WATER (3),
    MILK (5),
    OAT_MILK (6),
    SOY_MILK (6);

    private final int price;
    Milk(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
