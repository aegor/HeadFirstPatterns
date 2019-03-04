import machine.GumballMachine;

import java.rmi.Naming;

public class GumballMachineTestDrive
{
    public static void main(String[] args)
    {
        if(args.length < 2)
        {
            System.out.println("\nGumballMachine <name> <inventory>");
            System.exit(1);
        }

        try
        {
            int count = Integer.parseInt(args[1]);

            GumballMachine gumballMachine = new GumballMachine(count, args[0]);
            Naming.rebind("//" + args[0]+ "/gumballmachine", gumballMachine);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
