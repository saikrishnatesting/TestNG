package priorityConcepts;

import org.testng.annotations.Test;

public class withoutPriority {
	
	
	@Test
	public void c_method(){
	System.out.println("I'm in method C");
	}
	@Test
	public void b_method(){
	System.out.println("I'm in method B");
	}
	@Test
	public void a_method(){
	System.out.println("I'm in method A");
	}
	@Test
	public void e_method(){
	System.out.println("I'm in method E");
	}
	@Test
	public void d_method(){
	System.out.println("I'm in method D");
	}
}


/*  If we won't provide any priority it will call methods based on alphabetical order. Below is the output
[RemoteTestNG] detected TestNG version 6.13.1
I'm in method A
I'm in method B
I'm in method C
I'm in method D
I'm in method E
PASSED: a_method
PASSED: b_method
PASSED: c_method
PASSED: d_method
PASSED: e_method

===============================================
    Default test
    Tests run: 5, Failures: 0, Skips: 0
===============================================


===============================================
Default suite
Total tests run: 5, Failures: 0, Skips: 0
===============================================

 */

