package ladder;

import static org.junit.Assert.*;

import org.junit.Test;

public class NaturalNumberTest {

	@Test
	public void testCreate() {
		NaturalNumber number = new NaturalNumber(1);
		assertEquals(1, number.getNumber());
	}
	
	@Test
	public void testCreateWhenUnderZero() {
		try {
			new NaturalNumber(0);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	public void testToArrayIndex() {
		NaturalNumber number = new NaturalNumber(3);
		assertEquals(2, number.toArrayIndex());
	}

}