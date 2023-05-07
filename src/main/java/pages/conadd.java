package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class conadd {
	WebDriver driver;

	public conadd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@title=\"Delete\"]")
	private WebElement deletebutton;
	@FindBy(xpath = "//a[@href=\"http://automationpractice.pl/index.php?controller=address\"]")
	private WebElement Noaddressesavailable;

	public void deleteforbutton() throws InterruptedException {
		deletebutton.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String alertdisplay = alert.getText();
		System.out.println(alertdisplay);
		alert.accept();

	}
    public String noadd() {
    return	Noaddressesavailable.getText();
    }
}
