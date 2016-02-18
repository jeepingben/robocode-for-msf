package net.sf.robocode.robotname;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class RobotAINameTest {

	
	@Test
	public void testRandom() {
		
		RobotAIName sut = new RobotAIName(new MockRepositoryManager());
		Assert.assertEquals("foo", sut.getRandomRobotClassName("Test1") );
		Assert.assertEquals("foo2", sut.getRandomRobotClassName("1234567") );
		Assert.assertEquals("baz", sut.getRandomRobotClassName("53") );
	}
	
	@Test
	public void testNameList() {
		
		RobotAIName sut = new RobotAIName(new MockRepositoryManager());
		List<String> names;
		names = sut.getAvailableAINames();
		
		Assert.assertEquals(5, names.size() );
		Assert.assertEquals("foo", names.get(0) );
		Assert.assertEquals("bar", names.get(1) );
		Assert.assertEquals("baz", names.get(2) );
		Assert.assertEquals("foo2", names.get(3) );
		Assert.assertEquals("foo3", names.get(4) );
		
	}

}
