package Link;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Link8PO {
	public Link8PO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBys({
		@FindBy(xpath="//input[@type='checkbox']")
	})
	private List<WebElement> allchkBx;
	public int allchkBxSize(){
		return allchkBx.size();
	}
	public WebElement getallchkBx(int i) {
		return allchkBx.get(i);
		
	}
}
