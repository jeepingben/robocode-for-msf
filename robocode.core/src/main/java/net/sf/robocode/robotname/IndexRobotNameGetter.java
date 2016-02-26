
package net.sf.robocode.robotname;

/** RobotNameInfo creator that allows choosing a name from the dictionaries.  
 * The required format is \D\D\D-\D\D\D-\D\D-IDX
 * @author Ben Deering
 *
 */
public class IndexRobotNameGetter extends RobotNameInfo {
	protected IndexRobotNameGetter()
	{
		
	}
	
	public static IndexRobotNameGetter create(String barcode, RobotAIName aiNameGetter) {
		
		if (barcode.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9]-IDX")) {
			Integer adjectiveIndex = Integer.parseInt(barcode.substring(0,3));
			Integer nounIndex = Integer.parseInt(barcode.substring(4,7));
			Integer aiIndex = Integer.parseInt(barcode.substring(8,10));
			
			IndexRobotNameGetter toReturn = new IndexRobotNameGetter();
			if(populate(toReturn,aiNameGetter,adjectiveIndex,nounIndex,aiIndex))
			{
				return toReturn;
			}
			
		}
		return null;
	}

	protected static boolean populate(IndexRobotNameGetter toPopulate,
												   RobotAIName aiNameGetter,
												   Integer adjectiveIndex,
												   Integer nounIndex,
												   Integer aiIndex)
	{
		String adjective = PlayerName.getAdjective(adjectiveIndex);
		String noun = PlayerName.getNoun(nounIndex);
		String aiName = aiNameGetter.getAIName(aiIndex);
		
		if (adjective != null && noun != null && aiName != null) {
			toPopulate.setContestantName(adjective + " " + noun);
			toPopulate.setRobotAIName(aiName);
			toPopulate.setEnergyBonus(40);
			return true;
		}	
		return false;
	}

}



