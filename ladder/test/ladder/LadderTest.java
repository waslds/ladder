package ladder;

import static org.junit.Assert.*;

import org.junit.Test;

import core.NaturalNumber;

public class LadderTest {

	@Test
	public void testRunWhenMultiRows() {
		// 1 1 0 0
		// 0 1 1 0
		// 0 0 1 1
		Ladder ladder = new Ladder(new NaturalNumber(3), new NaturalNumber(4));
		ladder.drawLine(new NaturalNumber(1), new NaturalNumber(1));
		ladder.drawLine(new NaturalNumber(2), new NaturalNumber(2));
		ladder.drawLine(new NaturalNumber(3), new NaturalNumber(3));
		
		assertEquals(new Marker(4), ladder.run(new Marker(1)));
		assertEquals(new Marker(1), ladder.run(new Marker(2)));
		assertEquals(new Marker(2), ladder.run(new Marker(3)));
		assertEquals(new Marker(3), ladder.run(new Marker(4)));
	}
	
	@Test
	public void testDrawLineWhenOverNoOfRows() {
		try {
			Ladder ladder = new Ladder(new NaturalNumber(3), new NaturalNumber(4));
			ladder.drawLine(new NaturalNumber(4), new NaturalNumber(4));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
}