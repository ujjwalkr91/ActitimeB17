package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Link1PO;
import library.BaseTest;

public class TestScript2 extends BaseTest {
	@Test
	public void testFacebookLink(){
		try {
		Link1PO link1po =new Link1PO(driver);
		link1po.myFacebook().click();
		String aTitle = driver.getTitle();
		String eTitle = "Facebook – log in or sign up";
		Assert.assertEquals(aTitle, eTitle);
		System.out.println(aTitle);
		}
		catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	}
}
