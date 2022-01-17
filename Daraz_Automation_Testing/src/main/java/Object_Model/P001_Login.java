package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P001_Login {
	 WebDriver driver = null;
		//static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
		
	public P001_Login(WebDriver driver) {
		this.driver=driver;
	}
	
	By loginclick = By.xpath("//a[contains(text(),'Signup / Login')]");
	By email = By.xpath("//input[@placeholder='Please enter your Phone Number or Email']");
	By password = By.xpath("//input[@placeholder='Please enter your password']");
	By loginbtn = By.xpath("//button[@type='submit']");
	
	public void loginClick() {
		
		driver.findElement(loginclick).click();
	}
	
    public void Email(String em) {
		
		driver.findElement(email).sendKeys(em);
	}
    
 public void Password(String ps) {
		
		driver.findElement(password).sendKeys(ps);
	}
 public void loginBtn() {
		
		driver.findElement(loginbtn).click();
	}
 

}
