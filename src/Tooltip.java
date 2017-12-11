import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tooltip {
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
		driver.get("https://getbootstrap.com/docs/4.0/components/tooltips");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1750);");
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[1]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[2]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[3]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[4]"))).perform();
		actions.moveToElement(driver.findElement(By.xpath("/html/body/div/div/main/div[5]/div/button[5]"))).perform();
		
 }
}