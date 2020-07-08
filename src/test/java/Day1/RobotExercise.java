package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class RobotExercise {
	WebDriver driver;
 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
  }
  
  @Test
  public void robotdemo() throws Exception {
	  Robot r = new Robot();                 
	  r.keyPress(KeyEvent.VK_CONTROL);         
	  r.keyPress(KeyEvent.VK_T);        
	  r.keyRelease(KeyEvent.VK_CONTROL);         
	  r.keyRelease(KeyEvent.VK_T);
  }

  @AfterTest
  public void afterTest() {
  }

}
