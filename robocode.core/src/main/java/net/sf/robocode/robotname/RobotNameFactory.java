package net.sf.robocode.robotname;

import net.sf.robocode.repository.IRepositoryManager;

/** Provides the info needed to describe a new robot for a given bar code string
 * using the best implementation available
 * @author Ben Deering
 *
 */
public class RobotNameFactory {
	private RobotAIName aiNameGetter;

	public RobotNameFactory(IRepositoryManager repoManager)
	{
		aiNameGetter = new RobotAIName(repoManager);
	}

	
	public RobotNameInfo getRobotNameInfo(String barcode)
	{
		RobotNameInfo newRobot;
		
		// BestRobotNameGetter goes above BetterRobotNameGetter, etc
		
		//newRobot =  BetterRobotNameGetter.create(barcode, aiNameGetter);
		// if (newRobot != null)
		// {
		//     return newRobot;
		// }
		
		newRobot =  IndexRobotNameGetter.create(barcode, aiNameGetter);
	    if (newRobot != null)
		{
		     return newRobot;
		}
		
	    //This one never returns null
		newRobot = SimpleRobotNameGetter.create(barcode, aiNameGetter);
		return newRobot;
	}
}
