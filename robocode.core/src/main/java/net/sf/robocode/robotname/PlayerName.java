package net.sf.robocode.robotname;

public class PlayerName {
	static Noun nounGetter = new Noun();
	static Adjective adjectiveGetter = new Adjective();
	static public String getRandomName(String seed)
	{
		while (seed.length() <= 5)
		{
			seed = seed.concat(seed + ".");
		}
		
		return (adjectiveGetter.getWord(seed.substring(0,seed.length() - 3 )) + " " + 
				nounGetter.getWord(seed.substring(3,seed.length())));
		
	}
	
	static public String getAdjective(Integer index)
	{
		if (index >= adjectiveGetter.getListLength()) {
			return null;
		}
		return adjectiveGetter.getWordFromList(index);
	}
	
	static public String getNoun(Integer index)
	{
		if (index >= nounGetter.getListLength()) {
			return null;
		}
		return nounGetter.getWordFromList(index);
	}
}
