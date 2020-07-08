package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
		WebDriver driver;
		By uname=By.id("username");
		By pwd=By.id("password");
	    By loginbutton=By.xpath("//*[@id=\"login\"]/button/i");
	    
	    public LoginPage(WebDriver driver)
	    {
	    	this.driver=driver;
	    }
	    
	    public void typeUsername(String uid)
	    {
	    	driver.findElement(uname).sendKeys(uid);
	    }
	    public void typepassword(String pass)
	    {
	    	driver.findElement(pwd).sendKeys(pass);
	    }
        public void clickonSubmit()
        {
        	driver.findElement(loginbutton).click();
        }

}
