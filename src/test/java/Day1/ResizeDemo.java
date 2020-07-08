package Day1;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizeDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//org.openqa.selenium.Dimension d=new Dimension(300,1080);
		Dimension d= new Dimension(300,1080);
		//Resize current window to the set dimension
		driver.manage().window().setSize(d);
		Thread.sleep(10000);
		driver.close();
		System.out.println("Success");
	}

}
