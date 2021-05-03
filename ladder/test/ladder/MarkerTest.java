package ladder;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkerTest {

	@Test
	public void testMoveRight() {
		Marker marker = new Marker(3);
		assertEquals(new Marker(4), marker.moveRight());
	}

	@Test
	public void testMoveLeft() {
		Marker marker = new Marker(3);
		assertEquals(new Marker(2), marker.moveLeft());
	}
	
}