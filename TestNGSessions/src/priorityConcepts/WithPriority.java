package priorityConcepts;

import org.testng.annotations.Test;

public class WithPriority {
	
	/* Number 0 has the highest priority(it’ll be executed first) and the priority goes on based on the given number 
	    i.e., 0 has the highest priority than 1. 1 has the highest priority than 2 and so on.
	    
	    Note: 1. If both are having same priority, it will check alphabetical order
	          2. If no priority is given it will follow alphabetical order
	          3. if you combine both priority an non priority test cases first it will run priority and then non-priority test cases
	          4. priority keyword should always mention in small letters
	     */
	
	@Test(priority=0)
	public void c_method(){
	System.out.println("I'm in method C");
	}
	@Test(priority=1)
	public void b_method(){
	System.out.println("I'm in method B");
	}
	@Test(priority=2)
	public void a_method(){
	System.out.println("I'm in method A");
	}
	@Test(priority=3)
	public void e_method(){
	System.out.println("I'm in method E");
	}
	@Test(priority=4)
	public void d_method(){
	System.out.println("I'm in method D");
	}
}


/*  Below is the output
 
  [RemoteTestNG] detected TestNG version 6.13.1
I'm in method C
I'm in method B
I'm in method A
I'm in method E
I'm in method D
PASSED: c_method
PASSED: b_method
PASSED: a_method
PASSED: e_method
PASSED: d_method

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Failures: 0, Skips: 0
===============================================

*/


