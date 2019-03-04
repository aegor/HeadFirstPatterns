import ducks.MallardDuck;
import ducks.ModelDuck;
import behaviors.FlyRocketPowered;
import ducks.Duck;

public class MiniDuckSimulator
{

    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        ModelDuck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}
