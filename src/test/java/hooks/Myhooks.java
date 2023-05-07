package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class Myhooks {
WebDriver driver;
@Before
public void setup() {
	
	Properties prop = ConfigReader.intializeProperties();
	DriverFactory.initializeBrowser(prop.getProperty("browser"));
	driver = DriverFactory.getDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().fullscreen();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(prop.getProperty("URl"));
	
}
@After
public void closure() {
	driver.close();	
	
	
}




}
