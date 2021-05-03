package ladder;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class NodeTest {

	@Test
	public void testCenter() {
		assertEquals(Node.createCenterNode(), Node.createCenterNode());
	}

	@Test
	public void testChangeRight() {
		Node node = Node.createCenterNode();
		node.changeRight();
		assertEquals(Node.createRightNode(), node);
	}
	
	@Test
	public void testChangeLeft() {
		Node node = Node.createCenterNode();
		node.changeLeft();
		assertEquals(Node.createLeftNode(), node);
	}
	
	@Test
	public void testMoveRight() {
		Node node = Node.createRightNode();
		assertEquals(new Marker(4), node.move(new Marker(3)));
	}
	
	@Test
	public void testMoveLeft() {
		Node node = Node.createLeftNode();
		assertEquals(new Marker(2), node.move(new Marker(3)));
	}
	
	@Test
	public void testMoveCenter() {
		Node node = Node.createCenterNode();
		assertEquals(new Marker(3), node.move(new Marker(3)));
	}
	
}