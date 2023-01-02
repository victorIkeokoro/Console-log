package testCases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import main.Run.Base;
import pageObeject.LandingPage;

public class TC_001 extends Base {

	public WebDriver driver;

	@Test
	public void login_TC_001() throws IOException, InterruptedException {

		driver = RUN();
		driver.get(prop.getProperty("url"));
		LandingPage landingPage = new LandingPage(driver);
		landingPage.CANCLEBUTTON().click();
		landingPage.BANNER().click();
		// Find the element you want to hover over
		WebElement electronics = 	landingPage.ELECTRONICS();
		// Use the Actions class to hover over the element
		Actions actions = new Actions(driver);
		actions.moveToElement(electronics).perform();
		landingPage.CONSOLE_LOG_MOBILES();
		driver.close();

	}

	
}
