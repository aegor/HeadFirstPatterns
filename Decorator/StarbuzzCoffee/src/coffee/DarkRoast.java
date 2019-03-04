package coffee;

import beverage.Beverage;

public class DarkRoast extends Beverage
{
    public DarkRoast()
    {
        description = "Dark Roast";
    }

    @Override
    public double cost()
    {
        double cost;

        switch (getBeverageSize())
        {
            case SMALL:
                cost = 1.00D;
                break;
            case AVERAGE:
                cost = 1.25D;
                break;
            case BIG:
                cost = 1.50D;
                break;
            default:
                cost = 1.25D;
                break;
        }

        return cost;
    }
}
