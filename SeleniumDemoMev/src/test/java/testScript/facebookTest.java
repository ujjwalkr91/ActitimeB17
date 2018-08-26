package testScript;

import org.testng.annotations.Test;

import Library.BaseTest;
import pom.GooglePagePO;

public class facebookTest extends BaseTest {
	@Test
	public void testValid() throws InterruptedException {
		GooglePagePO googlePagePO=new GooglePagePO(driver);
		googlePagePO.Sc("facebook");
		Thread.sleep(4000);
		googlePagePO.Search().click();
		googlePagePO.Fclick().click();
	}
}
