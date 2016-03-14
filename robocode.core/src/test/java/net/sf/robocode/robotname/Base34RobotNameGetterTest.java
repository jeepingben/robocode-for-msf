package net.sf.robocode.robotname;

import org.junit.Assert;
import org.junit.Test;

public class Base34RobotNameGetterTest {

	@Test
	public void testnumber() {
		Assert.assertEquals(new Integer(9),Base34RobotNameGetter.base34Tobase10("9"));
	}
	
	@Test
	public void testletter() {
		Assert.assertEquals(new Integer(10),Base34RobotNameGetter.base34Tobase10("A"));
		Assert.assertEquals(new Integer(18),Base34RobotNameGetter.base34Tobase10("J"));
		Assert.assertEquals(new Integer(23),Base34RobotNameGetter.base34Tobase10("P"));
	}
	
	@Test
	public void testinvalid() {
		Assert.assertEquals(new Integer(-1),Base34RobotNameGetter.base34Tobase10("I"));
		Assert.assertEquals(new Integer(-1),Base34RobotNameGetter.base34Tobase10("O"));
	}
	
	@Test
	public void testempty() {
		Assert.assertEquals(new Integer(-1),Base34RobotNameGetter.base34Tobase10(""));
	}

	
	
	@Test
	public void testplaces() {
		Assert.assertEquals(new Integer(34),Base34RobotNameGetter.base34Tobase10("10"));
		Assert.assertEquals(new Integer(1189),Base34RobotNameGetter.base34Tobase10("10Z"));
	}

}
