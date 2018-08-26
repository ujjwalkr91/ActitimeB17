package Link;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link8PO_Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///F:/Ujjwal/CheckRadio.html");
		Link8PO link8=new Link8PO(driver);
		System.out.println(link8.allchkBxSize());
		for (int i = 0; i < link8.allchkBxSize(); i++) {
			link8.getallchkBx(i).click();
			Thread.sleep(2000);
		}
	}
}
