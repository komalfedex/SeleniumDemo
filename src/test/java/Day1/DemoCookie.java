package Day1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class DemoCookie {
	WebDriver driver;
  @Test
  public void login() {
	  driver.get("https://www.google.com/");
	  Set<Cookie> cookieset=driver.manage().getCookies();
	  for(Cookie temp_cookie:cookieset)
	  {
		  System.out.println("Name of the cookie:"+temp_cookie.getName()+
				  "\n and itz value:"+ temp_cookie.getValue()+
				  "\n get domain:"+temp_cookie.getDomain()+
				  "\n get expirydate:"+temp_cookie.getExpiry()+
				  "\n get path"+ temp_cookie.getPath()+
				  "\n is secure"+temp_cookie.isSecure());
	  }
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get("http://demowebshop.tricentis.com/");
  }

  @AfterTest
  public void afterTest() {
  }

}
