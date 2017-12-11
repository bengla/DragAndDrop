import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class WebTable {
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
		driver.get("https://cleartrip.com/trains/22692/");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0,1750);");
		//Actions actions = new Actions(driver);
		List<WebElement> rowCount = driver.findElements(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr"));
		System.out.println(rowCount.size());
		List<WebElement> colCount = driver.findElements(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr[1]/td"));
		System.out.println(colCount.size());
		
		int row = rowCount.size();
		int col = colCount.size();
			for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= col; j++)	{
				String text = driver.findElement(By.xpath("//*[@id=\'ContentFrame\']/div[2]/div/div[2]/div/table/tbody/tr["+i+"]/td["+j+"]")).getText();
				//System.out.print(text);
				// "H Nizamuddin (NZM)" Element Found Coding...
				String name = "H Nizamuddin (NZM)";
				if (text.equals(name)) {
					// Find the row and colum-----
					System.out.println(name+ "is Found in row: " + i + " col: "+ j);				
					break;
				}					
			}			
			System.out.println();
			}	
			driver.findElement(By.xpath("//*[@id=\"Tdate\"]")).click();
  }
}


