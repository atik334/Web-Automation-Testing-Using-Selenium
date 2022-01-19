package Test_Cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Driver_Setup.Driver_setup;
import Object_Model.P001_Login;


public class TC001_Login extends  Driver_setup {

	static String baseUrl = "https://www.facebook.com/";

	@Test
	public void login_Facebook() throws InterruptedException {
		
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		Thread.sleep(2000); 
		
		P001_Login fl = new P001_Login(driver);
		fl.Email("atifshan794@gmail.com");
		fl.Password("Atif@1234");
		fl.login();
		Thread.sleep(2000); 
	
}
}

