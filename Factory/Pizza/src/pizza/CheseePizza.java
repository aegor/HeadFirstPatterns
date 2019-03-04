package pizza;

import ingredient.PizzaIngredientFactory;

public class CheseePizza extends Pizza
{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheseePizza(PizzaIngredientFactory pizzaIngredientFactory)
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
    }

    @Override
    public String toString()
    {
        return PizzaType.CHEESE.getName();
    }
}
