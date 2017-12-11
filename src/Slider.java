import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Slider {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nuru\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
	// If you don't want to keep yellow line 	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
		
		driver = new ChromeDriver(options);
	}
	@Test
		public void mainTest(){
		//driver.get("https://material.angular.io/components/slider/overview");
		driver.get("https://www.makemytrip.com/");
		
		/*Actions actions = new Actions(driver);
		WebElement dragg = driver.findElement(By.className("mat-slider-thumb"));
		
		actions.clickAndHold(dragg).moveByOffset(100, 0).release(dragg).build().perform();*/
    }
}