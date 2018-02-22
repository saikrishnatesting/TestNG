package assertionConcept;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardAssertion {
	
	// hard assertion: if a hard assertion is getting failed . immediately test case will marked as failed and test case will get failed
	//soft assertion:  if a soft assertion is getting failed. test case will not be marked as passed as well as next lines will be executed
	//assert all: to mark test case as failed, if any soft assertion is getting failed.
	
	SoftAssert softassert = new SoftAssert();
	@Test
	public void hardAssertionconcept() {
		
		System.out.println("opening chrome browser");
		Assert.assertEquals(true, true); // hard assertion
		System.out.println("Enter User Name");
		System.out.println("Enter password");
		System.out.println("Clicking on submit button");
		softassert.assertEquals(true, false,"home page title is missing");
		
		
		System.out.println("go to deals page");
		System.out.println("create a deal");
		softassert.assertEquals(true, false,"not able to create a deal");
		
		System.out.println("go to contacts page");
		System.out.println("create a contact");
		softassert.assertEquals(true, false,"not able to create contact");
		softassert.assertAll();
		
	}
	
	@Test
	public void tearDown() {
		
	}
	
	
	
	
}
