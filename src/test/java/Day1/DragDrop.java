package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class DragDrop {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	 Actions actions=new Actions(driver); 
	 WebElement drag=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[1]/div/div/span"));
	 WebElement Pkgfirst=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[2]/div/div/span"));
	 WebElement PkgSecond=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_RadTreeView1\"]/ul/li/ul/li[3]/ul/li[3]/div/div/span"));
	 //WebElement drop=driver.findElement(By.id("ctl00_ContentPlaceholder1_Label1"));
	 WebElement drop=driver.findElement(By.xpath("//*[@id=\"ctl00_ContentPlaceholder1_Label1\"]"));
	 Thread.sleep(3000);
	 System.out.println("weekend package has been dropped");
	 actions.dragAndDrop(drag, drop).perform();
	 Thread.sleep(3000);
	 actions.dragAndDrop(Pkgfirst, drop).perform();
	 Thread.sleep(3000);
	 actions.dragAndDrop(PkgSecond, drop).perform();
	 Thread.sleep(3000);
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
