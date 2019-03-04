import pizza.Pizza;
import pizza.PizzaType;
import store.PizzaStore;
import store.chicago.ChicagoPizzaStore;
import store.newyork.NYPizzaStore;

public class PizzaTestDrive
{
    public static void main(String[] args)
    {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
