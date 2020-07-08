package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ActionsDemo {
	WebDriver driver;
  @Test
  public void f() {
	  Actions action=new Actions(driver);
		/*
		 * action.moveToElement(driver.findElement(By.linkText("All\n" +
		 * "										Categories"))).perform();
		 */
	  action.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).build().perform();
	  action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/ul/li[1]/a/span")).click();
	  action.moveToElement(driver.findElement(By.linkText("Head Phone"))).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Password123");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
  }

  @AfterTest
  public void afterTest() {
	//  driver.close();
  }

}
