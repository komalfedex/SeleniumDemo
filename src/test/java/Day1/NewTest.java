package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
	  }
  @Test
  public void f() throws Exception {
	 WebElement search=driver.findElement(By.cssSelector(""));
	 Actions actions=new Actions(driver);
	 actions.keyDown(search,Keys.SHIFT).sendKeys("computer").keyUp(Keys.SHIFT).build().perform();
	 Thread.sleep(2000);
	 actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
