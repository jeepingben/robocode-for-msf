package net.sf.robocode.robotname;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import net.sf.robocode.repository.IRepositoryManager;
import net.sf.robocode.repository.IRobotSpecItem;
import net.sf.robocode.repository.RobotProperties;
import net.sf.robocode.repository.TeamProperties;
import robocode.control.RobotSpecification;

class MockRepositoryManager implements IRepositoryManager
{

	@Override
	public boolean refresh() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public RobotSpecification[] getSpecifications() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RobotSpecification[] loadSelectedRobots(String selectedRobots) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getRobotsDirectory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<File> getDevelDirectories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refresh(String friendlyUrl) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean refresh(boolean force) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reload(boolean forced) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IRobotSpecItem> getRepositoryItems(boolean onlyWithSource,
			boolean onlyWithPackage, boolean onlyRobots,
			boolean onlyDevelopment, boolean onlyNotDevelopment,
			boolean ignoreTeamRobots, boolean onlyInJar) {
		// TODO Auto-generated method stub
		List<IRobotSpecItem> specs = new ArrayList<IRobotSpecItem>();
		specs.add(new MockRobotItem("foo"));
		specs.add(new MockRobotItem("bar"));
		specs.add(new MockRobotItem("baz"));
		specs.add(new MockRobotItem("foo2"));
		specs.add(new MockRobotItem("foo3"));
		return specs;
	}

	@Override
	public RobotSpecification[] loadSelectedRobots(
			RobotSpecification[] selectedRobots) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IRobotSpecItem> getSelectedSpecifications(
			String selectedRobots) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verifyRobotName(String robotName, String shortClassName) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int extractJar(IRobotSpecItem item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void createTeam(File target, TeamProperties teamProperties)
			throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String createPackage(File jarFile,
			List<IRobotSpecItem> selectedRobots,
			RobotProperties robotProperties) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
