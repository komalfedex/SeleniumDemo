package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ReadWriteExcercise {
	WebDriver driver;
	
  @Test
  public void readwrite() {
		//Go to register link to create credentials
	  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
	  WebElement female=driver.findElement(By.id("gender-female"));
	  female.click();
	  WebElement firstName=driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
			  firstName.sendKeys("Komal");
      WebElement LastName=driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
      LastName.sendKeys("komal123");
      WebElement email=driver.findElement(By.xpath("//*[@id=\"Email\"]"));
      email.sendKeys("komal.kumari91995@gmail.com");
      WebElement password=
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");  
      driver=new ChromeDriver();
      JavascriptExecutor js = (JavascriptExecutor) driver;
      driver.manage().window().maximize();
      driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() {
  }

}
