package Script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM.Link1PO;
import library.BaseTest;

public class TestScript4 extends BaseTest  {
	@Test
	public void testInstagramLink() {
		try{
			Link1PO link1po=new Link1PO(driver);
		link1po.myInstagram().click();
		String aTitle = driver.getTitle();
		String eTitle = "Instagram1";
		Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Reporter.log("Exception generated",true);
			Assert.fail();
		}
	}
}
