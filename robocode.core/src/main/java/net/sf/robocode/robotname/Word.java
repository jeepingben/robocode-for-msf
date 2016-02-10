package net.sf.robocode.robotname;

import java.util.ArrayList;

public class Word {
	protected ArrayList<String> words;
	public String getWord(String input)
	{
		String result = words.get((int) (stringToNumber(input) % (words.size() -1) ));
		return result;
	}
	
	protected long stringToNumber(String input)
	{
		long result = input.charAt(0);
		for(int i = 1; i < input.length(); i++)
		{
			result *= input.charAt(i);
		}
		return Math.abs(result);
	}
}
