package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Link1PO;
import library.BaseTest;

public class TestScript3 extends BaseTest {
	@Test
	public void testTwitterLink(){
		try {
		Link1PO link1po =new Link1PO(driver);
		link1po.myTwitter().click();
		String aTitle = driver.getTitle();
		String eTitle = "Twitter. It's what's happening1.";
		Assert.assertEquals(aTitle, eTitle);
		System.out.println(aTitle);
		}
		catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	}
}
