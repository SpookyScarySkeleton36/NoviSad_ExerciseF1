import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void testToCheckScore() {
		Frame f = new Frame(1,5);
		assertEquals(6, f.score());
	}

}
