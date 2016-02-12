package net.sf.robocode.robotname;

import org.junit.Assert;
import org.junit.Test;

public class NounTest {

	@Test
	public void test() {
		Noun sut = new Noun();
		Assert.assertEquals(sut.getWord("Bogus"), "dash");
		Assert.assertEquals(sut.getWord("79236347962"), "existence");
		Assert.assertEquals(sut.getWord("53"), "authorization");
	}

}
