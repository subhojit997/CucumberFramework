package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lp {
	WebDriver driver;

	public lp(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id=\"email\"]")
	private WebElement EmailAddressField;
	@FindBy(xpath = "//input[@id=\"passwd\"]")
	private WebElement PasswordField;
    @FindBy(xpath="//button[@id=\"SubmitLogin\"]")
	private WebElement SubmitLogin;
	
	public void EnterEmailAddress(String EmailAddressText) {
		EmailAddressField.sendKeys(EmailAddressText);
	}

	public void EnterPassword(String PasswordText) {
		PasswordField.sendKeys(PasswordText);
	}
    
	public void ClickonSubmitLogin() {
		SubmitLogin.click();
	}
}
