package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
//pass all values to TestMeApp by Dataprovider not through excel sheet
//Doubt: If i am keeping required codes in @BeforeTest then unable to launch for 2nd user.NEED TO DISCUSS
public class ReadWriteExcelExcercise {
	WebDriver driver;
	@BeforeTest
	  public void beforeTest() {
		
	  }
  @Test(dataProvider="credential")
  public void loginTestMeApp(String userName,String Password) throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(userName);
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(Password);
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	  Thread.sleep(5000);
	  System.out.println(driver.getTitle());
	 driver.quit();
  }
  
  @DataProvider(name="credential")
  public Object[][] passdata()
  {
	  Object[][] data=new Object[2][2];
	  data[0][0]="Lalitha";
	  data[0][1]="Password123";
	  
	  data[1][0]="Sheldon";
	  data[1][1]="BBT123";
	return data;	  
  }
  
  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
