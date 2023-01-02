package pageObeject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	WebDriver driver;

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	

	By cancelButton = By.cssSelector("[class='_2KpZ6l _2doB4z']");
	By banner= By.cssSelector("[class='_6t1WkM _3HqJxg']");
	By electornics= By.xpath("//span[@class='_2I9KP_'][text()='Electronics']");

	
	
	
	public WebElement CANCLEBUTTON () {
		return driver.findElement(cancelButton);
	}
	public WebElement BANNER() {

		return driver.findElement(banner);

	}

	public WebElement ELECTRONICS () {

		return driver.findElement( electornics);

	}
public void CONSOLE_LOG_MOBILES() {
	WebElement first =driver.findElement(By.xpath("(//div[@class='_1fwVde'])[1]"));
	
    List <WebElement> elements = first.findElements(By.className("_3QN6WI"));
    
    // Extract the text from the web elements
    for (WebElement element : elements) {
      String text = element.getText();
      System.out.println(text);
    }
    

}
	
	
	
	

}
