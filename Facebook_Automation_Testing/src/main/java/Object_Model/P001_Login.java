package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P001_Login {
	 WebDriver driver = null;
		
	public P001_Login(WebDriver driver) {
		this.driver=driver;
	}
	

	By email = By.xpath("//input[@id='email']");
	By password = By.xpath("//input[@id='pass']");
	By login = By.xpath("//button[contains(text(),'Log In')]");
	
public void Email(String em){

		driver.findElement(email).sendKeys(em);
	}
    
 public void Password(String ps) {
	 
		driver.findElement(password).sendKeys(ps);
	}
 public void login() {
		
		driver.findElement(login).click();
	}
}
