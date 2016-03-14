package net.sf.robocode.robotname;

/** RobotNameInfo creator that allows choosing a name from the dictionaries.  
 * The required format is [Z]ZZZZZ$  where Z is a base34 using 0-Z with I and O ommited
 * The first two digits choose the ajective, the next two (or three) choose the noun, the last
 * chooses the AI and $ must be the last character.
 * @author Ben Deering
 *
 */
public class Base34RobotNameGetter extends IndexRobotNameGetter{

	private Base34RobotNameGetter()
	{
		
	}

	public static Base34RobotNameGetter create(String barcode, RobotAIName aiNameGetter) {
	
		Integer adjectiveIndex;
		Integer nounIndex;
		Integer aiIndex;
		Integer extraBonus = 0;
		
		if (barcode.matches("[0-9,A-Z][0-9,A-Z][0-9,A-Z][0-9,A-Z][0-9,A-Z]\\$$")) {
		    adjectiveIndex = base34Tobase10(barcode.substring(0,2));
			nounIndex = base34Tobase10(barcode.substring(2,4));
			aiIndex = base34Tobase10(barcode.substring(4,5));
		}
		else if (barcode.matches("[0-9,A-Z][0-9,A-Z][0-9,A-Z][0-9,A-Z][0-9,A-Z][0-9,A-Z]\\$$")) {
		    adjectiveIndex = base34Tobase10(barcode.substring(0,2));
			nounIndex = base34Tobase10(barcode.substring(2,5));
			aiIndex = base34Tobase10(barcode.substring(5,6));
			extraBonus=5;
		}
		else {
			return null;
		}
			
		Base34RobotNameGetter toReturn = new Base34RobotNameGetter();
		if (populate(toReturn,aiNameGetter,adjectiveIndex,nounIndex,aiIndex))
		{
			toReturn.setEnergyBonus(toReturn.getEnergyBonus() + extraBonus);
			return toReturn;
		}
		
		return null;
	}
	
	/** returns the base 10 representation of a string containing a 
	 * base 34 number using 0-Z with I and O ommited.
	 * @param base34
	 * @return base 10 representation of the number or -1 if invalid.
	 */
	public static Integer base34Tobase10(String base34)
	{
		if (base34.isEmpty())
		{
			return -1;
		}
		Integer result = 0;
		Integer placeMultiplier = 1;
		final Integer BASE=34;
		for (int i = base34.length() - 1; i >=0; i--)
		{
			Integer digitValue;
			if (base34.charAt(i) >='0' && base34.charAt(i) <='9')
			{
				digitValue = base34.charAt(i) - '0';
			}
			else if (base34.charAt(i) >='A' && base34.charAt(i) < 'I')
			{
				digitValue = base34.charAt(i) - 'A' + 10;
			}
			else if (base34.charAt(i) >'I' && base34.charAt(i) < 'O')
			{
				digitValue = base34.charAt(i) - 'A' + 10 - 1;
			}
			else if (base34.charAt(i) >'O' && base34.charAt(i) <= 'Z')
			{
				digitValue = base34.charAt(i) - 'A' + 10 - 2;
			}
			else
			{
				//Illegal value
				return -1;
			}
			result += digitValue * placeMultiplier;
			placeMultiplier *= BASE;
		}
		return result;
	}
}
