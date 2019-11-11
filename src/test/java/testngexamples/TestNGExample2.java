/**
 * 
 */
package testngexamples;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * @author irfan
 *
 */
public class TestNGExample2 {
	
	@BeforeMethod
	public void BeforeMethodTestCase1(){
		System.out.println("@BeforeMethod TC1");
	}

	@Test
	public void login(){
		System.out.println("Successfully logged in...");
	}
	
	@Test
	public void logout(){
		System.out.println("Successfully logged out...");
	}
	
	@BeforeMethod
	public void BeforeMethodTestCase2(){
		System.out.println("@BeforeMethod TC2");
	}
}
