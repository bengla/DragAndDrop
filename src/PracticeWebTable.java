import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
// Flight Booking Elements Test====
public class PracticeWebTable {	
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
		//driver.get("https://cleartrip.com/trains/22692/");
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sTo\"]")).sendKeys(Keys.DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__depart\"]")).click();
		driver.findElement(By.linkText("9")).click();
		driver.findElement(By.xpath("//*[@id=\"hp-widget__return\"]")).click();
		driver.findElement(By.linkText("24")).click();	
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__paxCounter\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"js-adult_counter\"]/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"js-child_counter\"]/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"js-infant_counter\"]/li[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"hp-widget__class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"js-classFilters\"]/div[3]/label")).click();
		
		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	}
}
