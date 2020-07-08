package Day1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRobot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\komal.a.kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://my.monsterindia.com/create_account.html");
		Thread.sleep(2000);
		//scroll down the page
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("scroll(0,350)");
		Thread.sleep(2000);
		//Now click on browser button to upload the resume
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[4]/div[2]/div[1]/div/label/span")).click();
		System.out.println("choose file button clicked");
		//Specify the file location with extension
		//StringSelection sel=new StringSelection("C:\\Users\\komal.a.kumari\\Documents\\AccentureDocs_BenchTime");
		StringSelection sel=new StringSelection("C:\\Users\\komal.a.kumari\\Documents");
		//Copy to clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);
		System.out.println("selection" + sel);
		//create of Robot class
		Robot robot=new Robot();
		//PRESS enter
		robot.keyPress(KeyEvent.VK_ENTER);
		//Release enter
		robot.keyRelease(KeyEvent.VK_ENTER);
		//press ctrl+v
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(150);
		//Release ctrl+v
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		Thread.sleep(1000);
		//press enter
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
