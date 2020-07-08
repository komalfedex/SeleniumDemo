package Day1;

import org.openqa.selenium.Point;

//import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimizedemo {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://my.monsterindia.com/create_account.html");
		driver.manage().window().maximize();
		
		Thread.sleep(10000);
		Point p=new Point(0,3000);
		//Minimize the current window to set position
		driver.manage().window().setPosition(p);
		Thread.sleep(10000);
		
	}

}
