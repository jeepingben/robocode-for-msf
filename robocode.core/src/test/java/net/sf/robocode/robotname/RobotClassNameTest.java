package net.sf.robocode.robotname;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import net.sf.robocode.repository.IRepositoryManager;
import net.sf.robocode.repository.IRobotSpecItem;
import net.sf.robocode.repository.RobotProperties;
import net.sf.robocode.repository.TeamProperties;


import robocode.control.RobotSpecification;

public class RobotClassNameTest {

	private class MockRobotItem implements IRobotSpecItem
	{

		private String classname;

		@Override
		public int compareTo(Object arg0) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isValid() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isTeam() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isInJAR() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void setValid(boolean value) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public String getVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getDescription() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getAuthorName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public URL getWebpage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean getIncludeSource() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean getIncludeData() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isSourceIncluded() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getRootPath() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public URL getItemURL() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean isDevelopmentVersion() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public String getRobocodeVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getFullPackage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getRelativePath() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getRootPackage() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getFullClassNameWithVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUniqueFullClassName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUniqueFullClassNameWithVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUniqueShortClassNameWithVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getUniqueVeryShortClassNameWithVersion() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public String getFullClassName() {
			// TODO Auto-generated method stub
			return this.classname;
		}

		@Override
		public String getShortClassName() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public RobotSpecification createRobotSpecification() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void storeProperties(OutputStream os,
				RobotProperties robotProperties) throws IOException {
			// TODO Auto-generated method stub
			
		}
		
		public MockRobotItem(String name)
		{
			this.classname = name;
		}
	}
	private class MockRepositoryManager implements IRepositoryManager
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
	@Test
	public void test() {
		
		RobotClassName sut = new RobotClassName(new MockRepositoryManager());
		Assert.assertEquals("foo", sut.getRobotClassName("Test1") );
		Assert.assertEquals("foo2", sut.getRobotClassName("1234567") );
		Assert.assertEquals("baz", sut.getRobotClassName("53") );
	}

}
