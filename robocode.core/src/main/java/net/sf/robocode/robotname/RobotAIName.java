package net.sf.robocode.robotname;

import java.util.List;

import net.sf.robocode.repository.IRepositoryManager;
import net.sf.robocode.repository.IRobotSpecItem;

public class RobotAIName {
	private IRepositoryManager repositoryManager;
	public RobotAIName(IRepositoryManager srcRepositoryManager)
	{
		repositoryManager = srcRepositoryManager;
	}
	
	public String getRandomRobotClassName(String seed)
	{
	List<IRobotSpecItem> robotList = repositoryManager.getRepositoryItems(false,
			false, true, false, false, false, false);
	
	if (robotList.size() == 0)
	{
		return("sample.Fire");
	}
	while (seed.length() <= 5)
	{
		seed = seed.concat(seed + ".");
	}
	long index = this.indexFromString(seed) % robotList.size();
	return robotList.get((int)index).getFullClassName();
	}
	
	private long indexFromString(String input)
	{
		String tmp = input.substring(2,input.length() - 3);
		long result = tmp.charAt(0);
		for(int i = 1; i < tmp.length(); i++)
		{
			//31 - chosen by a fair dice roll.  Guaranteed prime.
			result = result * 31 + tmp.charAt(i);
		}
		return Math.abs(result);
	}

}
