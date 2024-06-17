package epicode.u5d1.entities;

import lombok.Getter;

import java.util.List;

@Getter
public class Pizza extends Item {
    private String name;
    private List<Topping> toppingList;
    private boolean isXl;

    public Pizza(String name, List<Topping> toppingList, boolean isXl) {
        super(800, 5.0);
        this.name = name;
        this.toppingList = toppingList;
        this.isXl = isXl;
        this.calories = calculateCalories(toppingList, isXl);
        this.price = calculatePrice(toppingList, isXl);
    }

    private int calculateCalories(List<Topping> toppingList, boolean isXl) {
        int baseCalories = 800;
        int totalCalories = baseCalories + getTotalCalories(toppingList);
        return isXl ? totalCalories + (totalCalories * 20 / 100) : totalCalories;
    }

    private int getTotalCalories(List<Topping> toppingList) {
        int totalCalories = 0;
        if (toppingList != null) {
            for (Topping topping : toppingList) {
                totalCalories += topping.getCalories();
            }
        }
        return totalCalories;
    }

    private double calculatePrice(List<Topping> toppingList, boolean isXl) {
        double basePrice = 5.0;
        double totalPrice = basePrice + getTotalPrice(toppingList);
        return isXl ? totalPrice + (totalPrice * 15 / 100) : totalPrice;
    }

    private double getTotalPrice(List<Topping> toppingList) {
        double totalPrice = 0.0;
        if (toppingList != null) {
            for (Topping topping : toppingList) {
                totalPrice += topping.getPrice();
            }
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return
                 name + '\'' +
                ", toppingList=" + toppingList +
                ", isXl=" + isXl +
                ", calories=" + calories +
                ", price=" + price
                ;
    }
}
