package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Library.BasePage;

public class GooglePagePO extends BasePage {

	public GooglePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(name="q")
	private WebElement GoogleBx;
	public WebElement GoogleBx() {
		return GoogleBx;
	}
	@FindBy(name="btnK")
	private WebElement Search;
	public WebElement Search() {
		return Search;

	}
	public void Sc(String un) {
		GoogleBx.sendKeys(un);
		Search.click();
	}
	@FindBy(xpath="//a[@class='l']")
	private WebElement Fclick;
	public WebElement Fclick() {
		return Fclick;
	}
	
}
