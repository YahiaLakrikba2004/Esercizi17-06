package epicode.u5d1.entities;

import lombok.Data;

@Data
public class OrderItem {
    private String itemName;
    private double itemPrice;
    private int quantity;

    public OrderItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.quantity = 1;
    }

    public double getTotalPrice() {
        return itemPrice * quantity;
    }
}

