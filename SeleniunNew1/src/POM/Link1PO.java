package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class Link1PO extends BasePage   {
	public Link1PO(WebDriver driver) {
		super(driver);
	}
	@FindBy(id="i1")
	private WebElement myGoogle;
	public WebElement myGoogle() {
		return myGoogle;
	}
	@FindBy(id="i2")
	private WebElement myFacebook;
	public WebElement myFacebook() {
		return myFacebook;
	}
	@FindBy(id="i3")
	private WebElement myTwitter;
	public WebElement myTwitter() {
		return myTwitter;
	}
	@FindBy(id="i4")
	private WebElement myInstagram;
	public WebElement myInstagram() {
		return myInstagram;
	}
}
