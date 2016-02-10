package net.sf.robocode.robotname;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class NounTest {

	@Test
	public void test() {
		Noun sut = new Noun();
		Assert.assertEquals(sut.getWord("Bogus"), "fiction");
		Assert.assertEquals(sut.getWord("79236347962"), "jeff");
		
	}

}
