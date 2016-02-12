package net.sf.robocode.robotname;

public class RobotName {
	static Noun nounGetter = new Noun();
	static Adjective adjectiveGetter = new Adjective();
	static public String getName(String seed)
	{
		while (seed.length() <= 5)
		{
			seed = seed.concat(seed + ".");
		}
		
		return (adjectiveGetter.getWord(seed.substring(0,seed.length() - 3 )) + " " + 
				nounGetter.getWord(seed.substring(3,seed.length())));
		
	}
}
