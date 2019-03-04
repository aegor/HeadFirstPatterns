package beverage;

public abstract class Beverage
{
    protected String description = "Unknown Beverage";
    protected BeverageSize beverageSize;

    public String getDescription()
    {
        return description;
    }

    public abstract double cost();

    public void setBeverageSize(BeverageSize beverageSize)
    {
        this.beverageSize = beverageSize;
    }

    public BeverageSize getBeverageSize()
    {
        return beverageSize;
    }

}
