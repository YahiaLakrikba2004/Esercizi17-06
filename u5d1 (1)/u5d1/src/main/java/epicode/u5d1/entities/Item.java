package epicode.u5d1.entities;


import lombok.Getter;

@Getter
public abstract class Item {
    protected int calories;
    protected double price;

    public Item(int calories, double price) {
        this.price = price;
        this.calories = calories;
    }
}
