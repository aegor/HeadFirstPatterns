package commands;

import controls.controllers.CeilingFan;

/**
 * @author rassoll
 * @created 05.06.2017
 * @$Author$
 * @$Revision$
 */
public class CeilingFunOffCommand extends CeilingFunBase
{
    public CeilingFunOffCommand(CeilingFan ceilingFan)
    {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute()
    {
        super.execute();
        ceilingFan.off();
    }
}
