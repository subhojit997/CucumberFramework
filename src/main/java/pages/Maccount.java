package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Maccount {
	WebDriver driver;

	public Maccount(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title=\"View my customer account\"]")
	private WebElement Myprofile;
	@FindBy(xpath = "//a[@title=\"Addresses\"]")
	private WebElement MyAddressbutton;

	public String myaccountprofile() {
		return Myprofile.getText();
	}

	public void MYAddress() {
		MyAddressbutton.click();
	}
}
