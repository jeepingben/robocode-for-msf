package net.sf.robocode.robotname;

/** RobotNameInfo creator of last resort.  This always returns a 
 * robot.  The name and AI choice are random, but reproducible for a given barcode 
 * @author Ben Deering
 *
 */
public class SimpleRobotNameGetter extends RobotNameInfo {


	private SimpleRobotNameGetter()
	{
		
	}
	
	public static SimpleRobotNameGetter create(String barcode, RobotAIName aiNameGetter)
	{
		SimpleRobotNameGetter newRobotInfo = new SimpleRobotNameGetter();
		
		newRobotInfo.setRobotAIName(aiNameGetter.getRandomRobotClassName(barcode));
		newRobotInfo.setContestantName(PlayerName.getRandomName(barcode));
		return newRobotInfo;
	}
}
