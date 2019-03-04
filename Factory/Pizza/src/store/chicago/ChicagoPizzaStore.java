package store.chicago;

import ingredient.PizzaIngredientFactory;
import ingredient.chicago.ChicagoPizzaIngredientFactory;
import pizza.*;
import store.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(PizzaType pizzaType)
    {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        switch (pizzaType)
        {
            case CHEESE:
                pizza = new CheseePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("Chicago Style "+ pizza.toString() +" Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
