package ladder;

import static org.junit.Assert.*;

import org.junit.Test;

public class RowTest {

	@Test
	public void testMoveWhenNoLine() throws Exception {
		Row row = new Row(3);
		int target = row.move(0);
		assertEquals(0, target);
		
		target = row.move(2);
		assertEquals(2, target);
	}

	@Test
	public void testMoveWhenLineLeft() throws Exception {
		// 0 1 1
		Row row = new Row(3);
		row.drawLine(1);
		
		int target = row.move(2);
		assertEquals(1, target);
	}
	
	@Test
	public void testMoveWhenLineRight() throws Exception {
		// 0 1 1
		Row row = new Row(3);
		row.drawLine(1);
		
		int target = row.move(1);
		assertEquals(2, target);
	}
}
