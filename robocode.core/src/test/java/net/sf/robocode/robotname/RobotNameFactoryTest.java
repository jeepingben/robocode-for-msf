package net.sf.robocode.robotname;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class RobotNameFactoryTest {

	@Test
	public void test() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("foo");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}

}
