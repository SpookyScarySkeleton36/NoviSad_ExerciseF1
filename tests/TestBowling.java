import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testToCheckScore() {
		Frame f = new Frame(1,4);
		assertEquals(5, f.score());
	}
	
	@Test
	public void testToCheckIfStrike(){
		Frame f = new Frame(10,0);
		assertTrue(f.isStrike());
	}
	
	@Test
	public void testToCheckIfSpare(){
		Frame f = new Frame(5,5);
		assertTrue(f.isSpare());
	}
	
	/*@Test(expected = BowlingException.class)
	public void testToChexkException(){
		Frame f = new Frame(10,0);
		
	}*/
	
	@Test
	public void testForThirdFrame() throws BowlingException{
		Frame f = new Frame(1,4);
	}
}
