package net.sf.robocode.robotname;

import org.junit.Assert;
import org.junit.Test;

public class AdjectiveTest {

	@Test
	public void test() {
		Adjective sut = new Adjective();
		Assert.assertEquals("psychedelic",sut.getWord("Bogus"));
		Assert.assertEquals(sut.getWord("53"), "functional");
		
	}

}

