package Link;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Link9PO {
	public Link9PO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(id="c1"),
		@FindBy(id="c2"),
		@FindBy(id="c3")
	})
	private List<WebElement> ChkBx123;
	public int ChkBx123Size() {
		return ChkBx123.size();
	}
	public WebElement getChkBx123(int i) {
		return ChkBx123.get(i);
		
	}
	
}
