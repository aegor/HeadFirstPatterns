package pizza;

public enum PizzaType
{
    CHEESE("Cheese"),
    VEGGIE("Veggie"),
    CLAM("Clam"),
    PEPPERONI("Pepperoni");

    private String name;

    PizzaType(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }
}
