import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest 
{
	WebDriver driver;
	@BeforeTest
	public void initDriver() 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swati\\OneDrive\\Documents\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://try.vikunja.io/register");
		String username = "12";
		driver.findElement(By.cssSelector("#username")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("validation@gmail.com");
		driver.findElement(By.cssSelector("#password")).sendKeys("validation@123");
		driver.findElement(By.cssSelector("button[id*='submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='message danger']")).getText());
	}
	@AfterTest
	public void endTest()
	{
		driver.quit();
	}
}
