package store;

import pizza.Pizza;
import pizza.PizzaType;

public abstract class PizzaStore
{
    public Pizza orderPizza(PizzaType pizzaType)
    {
        Pizza pizza;

        pizza = createPizza(pizzaType);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType pizzaType);
}
