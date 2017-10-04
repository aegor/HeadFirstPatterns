package sbt.jrakhm.proxy.states;

import sbt.jrakhm.proxy.machine.GumballMachine;

/**
 * @author rassoll
 * @created 31.08.2017
 * @$Author$
 * @$Revision$
 */
public class WinnerState implements State
{
    transient GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine)
    {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter()
    {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter()
    {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("Turning twice doesn.t get you another gumball");
    }

    @Override
    public void dispense()
    {
        System.out.println("YOU'RE A WINNER! You get two gumballs for your quarter");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0)
        {
           gumballMachine.setState(gumballMachine.getSoldOutState());
        }
        else
        {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0)
            {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }
            else
            {
                System.out.println("Oops's out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
