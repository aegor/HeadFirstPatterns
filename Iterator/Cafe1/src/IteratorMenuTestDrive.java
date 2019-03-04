import java.util.ArrayList;
import java.util.Arrays;

public class IteratorMenuTestDrive
{
    public static void main(String[] args)
    {
        new Waitress(new ArrayList(Arrays.asList(new PancakeHouseMenu(), new DinnerMenu(), new CafeMenu()))).printMenu();
    }
}
