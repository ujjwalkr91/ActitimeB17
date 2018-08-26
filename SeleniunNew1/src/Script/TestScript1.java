package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Link1PO;
import library.BaseTest;

public class TestScript1 extends BaseTest{
	@Test(priority=1)
	public void testGoogleLink(){
		try {
		Link1PO link1po =new Link1PO(driver);
		link1po.myGoogle().click();
		String aTitle = driver.getTitle();
		String eTitle = "Google";
		Assert.assertEquals(aTitle, eTitle);
		}
		catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	}
}
