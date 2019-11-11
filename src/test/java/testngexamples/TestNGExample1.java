/**
 * 
 */
package testngexamples;

import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author irfan
 *
 */
public class TestNGExample1 {
	
	@Test
	public void testCase1(){
		Reporter.log("Executing test case 1");
		System.out.println("Test case 1");
	}

	
	@Test
	public void testCase2(){
		System.out.println("Test case 2");
	}
	
	@Test
	public void testCase3(){
		System.out.println("Test case 3");
	}
	
	@Test
	public void testCase4(){
		System.out.println("Test case 4");
	}
	
	@Test
	public void testCase5(){
		System.out.println("Test case 5");
	}
	
	@Test
	public void testCase6(){
		System.out.println("Test case 6");
	}
	
}
