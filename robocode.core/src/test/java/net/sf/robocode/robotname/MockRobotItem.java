package net.sf.robocode.robotname;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;

import net.sf.robocode.repository.IRobotSpecItem;
import net.sf.robocode.repository.RobotProperties;
import robocode.control.RobotSpecification;


 class MockRobotItem implements IRobotSpecItem
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
