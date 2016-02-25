import static org.junit.Assert.*;

import org.junit.Test;

public class Prog8Test {

	@Test
	public void testMin() {
		int[] input = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		int expOut = -22;
		assertEquals(expOut , Prog8.min(input));
	}

}
