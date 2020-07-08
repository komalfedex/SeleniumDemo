package Day1;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class demo4 {
    WebDriver driver;
      
    @BeforeTest
      public void beforeTest() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");  
        driver=new ChromeDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            driver.manage().window().maximize();
            driver.get("https://demos.telerik.com/aspnet-ajax/treeview/examples/overview/defaultcs.aspx    ");
            
             WebElement Element = driver.findElement(By.className("rtText"));
            js.executeScript("arguments[0].scrollIntoView();", Element);
            
      }
        
  @Test
  
  public void f() throws InterruptedException {
      
      WebElement Source = (WebElement) driver.findElement(By.xpath("//li[@class='rtLI rtLast']//span[@class='rtText'][contains(text(),'1 Week Package')]"));
      WebElement Target = (WebElement) driver.findElement(By.xpath("//td[contains(text(),'Drag and drop packages here...')]"));
      Thread.sleep(1000);
      Actions act=new Actions(driver);
      act.dragAndDrop(Source, Target).build().perform();
      
      
  }
  

 

  @AfterTest
  public void afterTest() {
    
      //driver.close();
      
  }

 

}