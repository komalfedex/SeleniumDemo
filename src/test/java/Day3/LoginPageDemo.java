package Day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageDemo {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/login");
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Pages.LoginPage login=new Pages.LoginPage(driver);
			login.typeUsername("tomsmith");
			login.typepassword("SuperSecretPassword!");
			login.clickonSubmit();
			driver.close();
	}

}
