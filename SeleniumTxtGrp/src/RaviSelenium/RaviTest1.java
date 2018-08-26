package RaviSelenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class RaviTest1 {
	@Test(priority=1,groups="smoke")
	public void testOne() {
		Reporter.log("Test 1",true);
	}
	@Test(priority=2,groups="smoke")
	public void testTwo() {
		Reporter.log("Test 2",true);
	}
	@Test(priority=3,groups="regression")
	public void testThree() {
		Reporter.log("Test 3",true);
	}
	@Test(priority=4,groups="regression")
	public void testFour() {
		Reporter.log("Test 4",true);
	}
	@Test(priority=5,groups="smoke")
	public void testFive() {
		Reporter.log("Test 5",true);
	}
}
