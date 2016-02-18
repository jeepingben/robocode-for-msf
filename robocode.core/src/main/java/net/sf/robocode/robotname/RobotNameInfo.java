package net.sf.robocode.robotname;

/** Contains the info needed to describe a newly added robot **/
public class RobotNameInfo {
	private String contestantName;
	private String robotAIName;
	public String getContestantName() {
		return contestantName;
	}
	public void setContestantName(String contestantName) {
		this.contestantName = contestantName;
	}
	public String getRobotAIName() {
		return robotAIName;
	}
	public void setRobotAIName(String robotAIName) {
		this.robotAIName = robotAIName;
	}
	
}
