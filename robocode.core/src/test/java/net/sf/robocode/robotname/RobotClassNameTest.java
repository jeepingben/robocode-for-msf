package net.sf.robocode.robotname;

import org.junit.Assert;
import org.junit.Test;

public class RobotClassNameTest {

	
	@Test
	public void test() {
		
		RobotAIName sut = new RobotAIName(new MockRepositoryManager());
		Assert.assertEquals("foo", sut.getRandomRobotClassName("Test1") );
		Assert.assertEquals("foo2", sut.getRandomRobotClassName("1234567") );
		Assert.assertEquals("baz", sut.getRandomRobotClassName("53") );
	}

}
