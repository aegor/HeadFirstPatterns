package store.newyork;

import ingredient.PizzaIngredientFactory;
import ingredient.newyork.NYPizzaIngredientFactory;
import pizza.*;
import store.PizzaStore;

public class NYPizzaStore extends PizzaStore
{
    @Override
    protected Pizza createPizza(PizzaType pizzaType)
    {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        switch (pizzaType)
        {
            case CHEESE:
                pizza = new CheseePizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case VEGGIE:
                pizza = new VeggiePizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case CLAM:
                pizza = new ClamPizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            case PEPPERONI:
                pizza = new PepperoniPizza(pizzaIngredientFactory);
                pizza.setName("New York Style "+ pizza.toString() +" Pizza");
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}
