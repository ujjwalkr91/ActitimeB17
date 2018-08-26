package Link;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link9PO_Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("file:///F:/Ujjwal/CheckRadio.html");
	Link9PO link9 = new Link9PO(driver);
	System.out.println(link9.ChkBx123Size());
	for (int i = 0; i < link9.ChkBx123Size(); i++) {
		link9.getChkBx123(i).click();
}
}
} 
