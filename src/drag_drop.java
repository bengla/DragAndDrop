import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class drag_drop {
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
		driver.get("https://www.flipkart.com/hp-imprint-core-i3-6th-gen-4-gb-1-tb-hdd-dos-15q-bu007tu-laptop/p/itmewngwg8fkftau?pid=COMEWNGWFUGQHGGG&srno=b_1_1&otracker=hp_banner_widget_2&lid=LSTCOMEWNGWFUGQHGGGJPIFNO&fm=organic&iid=e63359e5-8bb2-472f-8a56-a6ffddbe3cfc.COMEWNGWFUGQHGGG.SEARCH&ppt=Store%20Browse&ppn=Search%20Page&ssid=kycyfr3w8w0000001512000881079");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));		
		Actions action = new Actions(driver);
		action.dragAndDrop(drag, drop).perform();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div[1]/div/div[1]/div[1]/div[1]/div[2]/div[1]/img"))).perform();
		
		
		actions.clickAndHold(drag).moveByOffset(100, 50).release(drag).build().perform();
	}
	
}
