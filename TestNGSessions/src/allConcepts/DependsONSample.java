package allConcepts;

import org.testng.annotations.Test;

public class DependsONSample {

	/*
	You can specify the dependencies in two ways
	
	Using attributes dependsOnMethods in @Test annotations OR
	Using attributes dependsOnGroups in @Test annotations.
	
	*/
	
	@Test (dependsOnMethods = "OpenBrowser")
	 	  public void SignIn() {
	 		System.out.println("This will execute second (SignIn)");
	 	  }
	 
	  @Test
	 	  public void OpenBrowser() {
	 		  System.out.println("This will execute first (Open Browser)");
	 	  }
	 
	  @Test (dependsOnMethods = "SignIn")
	 	  public void LogOut() {
	 		  System.out.println("This will execute third (Log Out)");
	 	  }
	
}



/* negative scenario
 
 
 	@Test
	public void loginTest(){
		System.out.println("login test");
		int i = 9/0;   // here value comes infinity and test case get fail, 
					so next test case won't execute because we are using "dependsOnMethods" 
	}
	
	@Test(dependsOnMethods="loginTest")
	public void HomePageTest(){
		System.out.println("Home Page test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void SearchPageTest(){
		System.out.println("SearchPageTest");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void RegPageTest(){
		System.out.println("RegPageTest");
	}
 
 
 */
