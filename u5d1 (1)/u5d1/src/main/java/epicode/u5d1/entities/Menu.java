package epicode.u5d1.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;

public void printMenu() {
    System.out.println("--------------- Menu ---------------");
    System.out.println("ALL PIZZAS");
    this.pizzaList.forEach(System.out::println);
    System.out.println();

    System.out.println("ALL TOPPINGS");
    this.toppingList.forEach(System.out::println);
    System.out.println();

    System.out.println("ALL DRINKS");
    this.drinkList.forEach(System.out::println);
    System.out.println();

}
}



