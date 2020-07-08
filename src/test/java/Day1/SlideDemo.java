package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class SlideDemo {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/resources/demos/slider/default.html");	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 // driver.get("http://jqueryui.com/resources/demos/slider/default.html");
	  WebDriverWait wait=new WebDriverWait(driver, 10);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='slider']/span")));
	  WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
	  Actions action=new Actions(driver);
	  Thread.sleep(3000);
	  action.dragAndDropBy(slider, 200, 0).perform();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
