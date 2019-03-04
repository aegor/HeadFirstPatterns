package supplements;

import beverage.Beverage;
import beverage.BeverageSize;
import beverage.CondimentDecorator;

public class Whip extends CondimentDecorator
{
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageSize beverageSize()
    {
        return beverage.getBeverageSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost()
    {
        double cost = beverage.cost();

        switch (beverageSize())
        {
            case SMALL:
                cost += 0.30D;
                break;
            case AVERAGE:
                cost += 0.4D;
                break;
            case BIG:
                cost += 0.50D;
                break;
        }

        return cost;
    }
}
