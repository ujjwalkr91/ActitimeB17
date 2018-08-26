package Link;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Link7PO {
	public Link7PO(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="c1")
	private WebElement chkBx;
	public WebElement chkBx(){
		return chkBx;
		
	}
	@FindBy(id="c2")
	private WebElement chkBx2;
	public WebElement chkBx2(){
		return chkBx2;
		
	}
	@FindBy(id="c3")
	private WebElement chkBx3;
	public WebElement chkBx3(){
		return chkBx3;
	}
	@FindBy(id="c4")
	private WebElement chkBx4;
	public WebElement chkBx4(){
		return chkBx4;
	}
	@FindBy(id="c5")
	private WebElement chkBx5;
	public WebElement chkBx5(){
		return chkBx5;
	}
	@FindBys({
	@FindBy(xpath="//input[@type='checkbox']")
	})
	private List<WebElement> allchkBx;
	public int allchkBxSize() {
		return allchkBx.size();
	}
	public WebElement getallchkBx(int i) {
		return allchkBx.get(i);
		
	}
}
