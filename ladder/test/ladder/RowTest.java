package ladder;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RowTest {

	private Row row;

	@Before
	public void setUp() {
		row = new Row(new NaturalNumber(3));
	}
	
	@Test
	public void testStartPositionWhenOverNoOfPersons() {
		try {
			row.drawLine(new NaturalNumber(3));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	public void testDrawLineWhenAlreadyDrawingPoint() {
		try {
			row.drawLine(new NaturalNumber(1));
			row.drawLine(new NaturalNumber(2));
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	public void testMarkerPosition() {
		try {
			row.move(-1);
			fail("IllegalArgumentException 에러가 발생해야 한다.");
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
			assertTrue(true);
		}
	}
	
	@Test
	public void testMoveWhenNoLine() {
		int target = row.move(0);
		assertEquals(0, target);
		
		target = row.move(2);
		assertEquals(2, target);
	}

	@Test
	public void testMoveWhenLineLeft() {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		
		int target = row.move(2);
		assertEquals(1, target);
	}
	
	@Test
	public void testMoveWhenLineRight() {
		// 0 1 1
		row.drawLine(new NaturalNumber(2));
		
		int target = row.move(1);
		assertEquals(2, target);
	}
}
