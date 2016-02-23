import static org.junit.Assert.*;

import org.junit.Test;

public class TrialTest {

	@Test
	public void testHello() {
		
		String result = Trial.hello();
		String expected = "hello";
		
		assertEquals(expected, result);
	}

}
