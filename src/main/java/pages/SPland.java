package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SPland {
WebDriver driver;
	
	public SPland(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//img[@alt=\"My Store\"]")
	private WebElement Logoicon;
	
	@FindBy(xpath="//input[@id=\"search_query_top\"]")
	private WebElement searchfield;
    @FindBy(xpath="//button[@name=\"submit_search\"]")
	private WebElement searchbutton;
	
	public void clicklogoicon() {

		Logoicon.click();
	}

    public void entertextsearchfield() {
    	
    	searchfield.sendKeys("PRINTED SUMMER DRESS");
    }

    public void searchbtn() {
    	
    	searchbutton.click();
    } 


}
