package net.sf.robocode.robotname;

/** A class for any one-off easter egg type robots.
 * 
 * @author ben deering
 *
 */
public class EggRobotNameGetter extends RobotNameInfo {

	protected EggRobotNameGetter()
	{
		super();
	}
	
	public static EggRobotNameGetter create(String barcode, RobotAIName unused)
	{
		if (barcode.equals("53"))
		{
			EggRobotNameGetter toReturn = new EggRobotNameGetter();
			toReturn.setContestantName("wrexem");
			toReturn.setEnergyBonus(-40);
			toReturn.setRobotAIName("sample.SittingDuck");
			return toReturn;
		}
		return null;
	}
}
