package Link;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class link7_TestPO {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///F:/Ujjwal/CheckRadio.html");
		Link7PO link7 = new Link7PO(driver);
		link7.chkBx().click();
		link7.chkBx2().click();
		link7.chkBx3().click();
		link7.chkBx4().click();
		link7.chkBx5().click();
		/**
		 * Using FindBys
		 */
		System.out.println(link7.allchkBxSize());
		System.out.println(link7.allchkBxSize());
		for (int i = 0; i < link7.allchkBxSize(); i++) {
			link7.getallchkBx(i).click();
		}
	}
}
