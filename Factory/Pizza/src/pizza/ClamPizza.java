package pizza;

import ingredient.PizzaIngredientFactory;

public class ClamPizza extends Pizza
{
    PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory)
    {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare()
    {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }

    @Override
    public String toString()
    {
        return PizzaType.CHEESE.getName();
    }
}
