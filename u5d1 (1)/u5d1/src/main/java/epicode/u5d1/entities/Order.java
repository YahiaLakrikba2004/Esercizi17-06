package epicode.u5d1.entities;

import lombok.Data;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Setter
@Data
public class Order {
    private static int nextOrderId = 1;

    private int orderId;
    private OrderStatus status;
    private int numberOfSeats;
    private LocalDateTime orderTime;
    private List<OrderItem> orderItems;
    private double coverCharge;

    public Order(int numberOfSeats) {
        this.orderId = nextOrderId++;
        this.status = OrderStatus.IN_PROGRESS;
        this.numberOfSeats = numberOfSeats;
        this.orderTime = LocalDateTime.now();
        this.orderItems = new ArrayList<>();

        this.coverCharge = Double.parseDouble(System.getProperty("cover.charge"));
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setOrderTime(LocalDateTime orderTime) {
        this.orderTime = orderTime;
    }

    public double getTotalAmount() {
        double totalAmount = coverCharge;
        for (OrderItem item : orderItems) {
            totalAmount += item.getItemPrice();
        }
        return totalAmount;
    }
}
