package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HP {
	WebDriver driver;
	
	public HP(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[@title=\"Log in to your customer account\"]")
	private WebElement Logintoyourcustomeraccount;

	public void clickonSigninicon() {

		Logintoyourcustomeraccount.click();
	}
}
