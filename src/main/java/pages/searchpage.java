package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchpage {
WebDriver driver;
	
	public searchpage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[@class=\"heading-counter\"]")
	private WebElement pageresult;
	
	
	
	public String forpageresult() {

		 return pageresult.getText();
	}

    
}
