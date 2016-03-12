package net.sf.robocode.robotname;

import org.junit.Assert;
import org.junit.Test;

public class RobotNameFactoryTest {

	@Test
	public void testSimple() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("foo");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testIndex() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("000-000-00-IDX");
		Assert.assertEquals("net.sf.robocode.robotname.IndexRobotNameGetter", result.getClass().getName() );
	}

	@Test
	public void testIndex2() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("A01Q8$");
		Assert.assertEquals("net.sf.robocode.robotname.Base34RobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testIndex3() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("A01ZZ8$");
		Assert.assertEquals(new Integer(45), result.getEnergyBonus());
		Assert.assertEquals("net.sf.robocode.robotname.Base34RobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testEgg1() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("53");
		Assert.assertEquals(new Integer(-40), result.getEnergyBonus());
		Assert.assertEquals("net.sf.robocode.robotname.EggRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex1() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("999-000-00-IDX");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex2() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("000-99-00-IDX");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex3() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("000-000-99-IDX");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex4() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("000-000-00-FDX");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex5() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("ZZAAA$");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
	@Test
	public void testBadIndex6() {
		RobotNameFactory sut = new RobotNameFactory(new MockRepositoryManager());
		RobotNameInfo result = sut.getRobotNameInfo("A89A6&");
		Assert.assertEquals("net.sf.robocode.robotname.SimpleRobotNameGetter", result.getClass().getName() );
	}
	
}
