import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyBoardInteaction {
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
		driver.findElement(By.xpath("//*[@id='hp-widget__sfrom']")).click();
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys(Keys.UP);
		driver.findElement(By.xpath("//*[@id=\"hp-widget__sfrom\"]")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='hp-widget__sTo']")).sendKeys("Che");
		driver.findElement(By.xpath("//*[@id=\'hp-widget__sTo\']")).sendKeys(Keys.DOWN);
		driver.findElement(By.xpath("//*[@id=\'hp-widget__sTo\']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//*[@id='hp-widget__depart']")).click();
		driver.findElement(By.linkText("7")).click();
		
		driver.findElement(By.xpath("//*[@id='hp-widget__return']")).click();
		driver.findElement(By.linkText("8")).click();
		
		driver.findElement(By.xpath("//*[@id='js-hp-widgetSection']/div[2]/div[4]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='hp-widget__return']")).click();
		driver.findElement(By.linkText("8")).click();
		
		driver.findElement(By.xpath("//*[@id='hp-widget__paxCounter']")).click();
		driver.findElement(By.xpath("//*[@id='js-adult_counter']/li[2]")).click();
		driver.findElement(By.xpath("//*[@id='js-child_counter']/li[2]")).click();
		driver.findElement(By.xpath("//*[@id='js-infant_counter']/li[2]")).click();
		driver.findElement(By.xpath("//*[@id=\'hp-widget__class\']")).click();
		driver.findElement(By.xpath("//*[@id=\'js-classFilters\']/div[2]/label")).click();

		driver.findElement(By.xpath("//*[@id=\"searchBtn\"]")).click();
	}
}
