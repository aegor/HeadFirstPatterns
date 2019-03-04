import coffee.DarkRoast;
import coffee.Espresso;
import coffee.HouseBlend;
import beverage.Beverage;
import beverage.BeverageSize;
import supplements.Mocha;
import supplements.Soy;
import supplements.Whip;

public class StarbuzCoffee
{
    public static void main(String[] args)
    {
        Beverage beverage = new Espresso();
        beverage.setBeverageSize(BeverageSize.AVERAGE);
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2.setBeverageSize(BeverageSize.BIG);
        beverage2 = new Mocha(beverage2);
        beverage2.setBeverageSize(BeverageSize.BIG);
        beverage2 = new Mocha(beverage2);
        beverage2.setBeverageSize(BeverageSize.BIG);
        beverage2 = new Whip(beverage2);
        beverage2.setBeverageSize(BeverageSize.BIG);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3.setBeverageSize(BeverageSize.BIG);
        beverage3 = new Soy(beverage3);
        beverage3.setBeverageSize(BeverageSize.BIG);
        beverage3 = new Mocha(beverage3);
        beverage3.setBeverageSize(BeverageSize.BIG);
        beverage3 = new Whip(beverage3);
        beverage3.setBeverageSize(BeverageSize.BIG);
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
