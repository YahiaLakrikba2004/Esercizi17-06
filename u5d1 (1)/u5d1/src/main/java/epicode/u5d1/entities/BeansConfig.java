package epicode.u5d1.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {

    @Bean
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 22, 0.50);
    }

    @Bean
    public Topping toppingTunaBean() {
        return new Topping("Tuna", 132, 1.50);
    }

    @Bean
    public Topping toppingOnionBean() {
        return new Topping("Onion", 40, 0.79);
    }

    @Bean
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean
    public Pizza pizzaMargheritaBean() {
        return createPizza("Pizza Margherita", false, toppingTomatoBean(), toppingCheeseBean());
    }

    @Bean
    public Pizza pizzaHawaiianBean() {
        return createPizza("Hawaiian Pizza", false, toppingTomatoBean(), toppingCheeseBean(), toppingHamBean(), toppingPineappleBean());
    }

    @Bean
    public Pizza pizzaSalamiBean() {
        return createPizza("Salami Pizza", false, toppingTomatoBean(), toppingCheeseBean(), toppingSalamiBean());
    }

    @Bean
    public Pizza pizzaSalamiXlBean() {
        return createPizza("Salami Pizza XL", true, toppingTomatoBean(), toppingCheeseBean(), toppingSalamiBean());
    }

    @Bean
    public Pizza pizzaTonnoECipolleBean() {
        return createPizza("Tuna & onion pizza", false, toppingTomatoBean(), toppingOnionBean(), toppingTunaBean() );
    }

    @Bean
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean
    public Drink wineBean() {
        return new Drink("Wine", 607, 7.49);
    }

    @Bean(name = "menu")
    public Menu menuBean() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        List<Topping> toppingsList = new ArrayList<>();

        pizzaList.add(pizzaMargheritaBean());
        pizzaList.add(pizzaHawaiianBean());
        pizzaList.add(pizzaSalamiBean());
        pizzaList.add(pizzaSalamiXlBean());
        pizzaList.add(pizzaTonnoECipolleBean());

        drinkList.add(lemonadeBean());
        drinkList.add(waterBean());
        drinkList.add(wineBean());

        toppingsList.add(toppingTomatoBean());
        toppingsList.add(toppingCheeseBean());
        toppingsList.add(toppingHamBean());
        toppingsList.add(toppingPineappleBean());
        toppingsList.add(toppingSalamiBean());
        toppingsList.add(toppingOnionBean());
        toppingsList.add(toppingTunaBean());

        return new Menu(pizzaList, drinkList, toppingsList);
    }

    private Pizza createPizza(String name, boolean isXl, Topping... toppings) {
        List<Topping> toppingList = new ArrayList<>();
        for (Topping topping : toppings) {
            toppingList.add(topping);
        }
        return new Pizza(name, toppingList, isXl);
    }
}
