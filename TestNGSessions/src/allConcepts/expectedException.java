package allConcepts;

import org.testng.annotations.Test;

public class expectedException {
	
	/*
	Handling exception without try catch block 
	It is not good feature to implement in code 
	*/
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void exceptionTest1() {
		String z = "200AC";
		Integer.parseInt(z);
	}

}
