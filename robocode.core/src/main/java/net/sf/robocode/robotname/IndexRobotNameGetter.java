
package net.sf.robocode.robotname;

/** RobotNameInfo creator that allows choosing a name from the dictionaries.  
 * The required format is \D\D\D-\D\D\D-\D\D-IDX
 * @author Ben Deering
 *
 */
public class IndexRobotNameGetter extends RobotNameInfo {
	private IndexRobotNameGetter()
	{
		
	}
	
	public static IndexRobotNameGetter create(String barcode, RobotAIName aiNameGetter) {
	
		if (barcode.matches("[0-9][0-9][0-9]-[0-9][0-9][0-9]-[0-9][0-9]-IDX")) {
			Integer adjectiveIndex = Integer.parseInt(barcode.substring(0,3));
			Integer nounIndex = Integer.parseInt(barcode.substring(4,7));
			Integer aiIndex = Integer.parseInt(barcode.substring(8,10));
			
			String adjective = PlayerName.getAdjective(adjectiveIndex);
			String noun = PlayerName.getNoun(nounIndex);
			String aiName = aiNameGetter.getAIName(aiIndex);
			
			if (adjective != null && noun != null && aiName != null) {
				IndexRobotNameGetter toReturn = new IndexRobotNameGetter();
				toReturn.setContestantName(adjective + " " + noun);
				toReturn.setRobotAIName(aiName);
				toReturn.setEnergyBonus(40);
				return toReturn;
			}
			
		}
		return null;
	}

}



