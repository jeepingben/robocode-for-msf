package net.sf.robocode.robotname;

import java.util.ArrayList;

public class Word {
	protected ArrayList<String> words;
	public String getWord(String seed)
	{
		String result = words.get((int) (stringToNumber(seed) % (words.size() -1) ));
		return result;
	}
	
	/** Does a weak hash of a string to get a repeatable value
	 * for indexing into a list of words.
	 * @param input String to be hashed
	 * @return a positive long
	 */
	protected long stringToNumber(String input)
	{
		long result = input.charAt(0);
		for(int i = 1; i < input.length(); i++)
		{
			//17 - chosen by a fair dice roll.  Guaranteed prime.
			result = result + 17 + input.charAt(i);
		}
		return Math.abs(result);
	}
}
