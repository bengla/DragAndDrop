import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Resizable {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nuru\\Desktop\\Selenium\\Browsers\\chromedriver_win32\\chromedriver.exe");
	// If you don't want to keep yellow line 	
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("disable-infobars");  (options)
		
		driver = new ChromeDriver();
	}
	@Test
		public void mainTest(){
		driver.get("http://jqueryui.com/resizable/");
		Actions actions = new Actions(driver);
		WebElement dragg = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		actions.clickAndHold(dragg).moveByOffset(100, 50).release(dragg).build().perform();
    }
}