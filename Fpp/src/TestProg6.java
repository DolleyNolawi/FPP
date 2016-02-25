import static org.junit.Assert.*;

import org.junit.Test;

public class TestProg6 {

	@Test
	public void testRemoveDups() {
		String[] testResult={"Dog" , "Cat" , "Horse"};
		String[] data={"Dog" , "Cat" , "Horse" , "Cat" , "Dog"};
		
		for(int i=0; i < testResult.length; i++){						
			assertTrue(testResult[i].equals(Prog6.removeDups(data)[i]));
		}
		
	}

}
