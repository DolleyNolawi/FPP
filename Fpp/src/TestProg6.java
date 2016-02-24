import static org.junit.Assert.*;

import org.junit.Test;

public class TestProg6 {

	@Test
	public void testRemoveDups() {
		String[] testData = {"Dog" , "Cat" , "Horse" , "Cat" , "Dog"};
		String[] result = Prog6.removeDups(testData);
		String[] exResult = {"Dog" , "Cat" , "Horse"};
		assertEquals(exResult, result);
		assertTrue("Success", true);
		
	}

}
