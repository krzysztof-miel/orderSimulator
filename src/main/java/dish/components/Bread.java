package dish.components;

public enum Bread {
    WHITE_BREAD (5),
    MULTIGRAIN (6),
    RYE_BREAD (6);

    private final int price;
    Bread(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
