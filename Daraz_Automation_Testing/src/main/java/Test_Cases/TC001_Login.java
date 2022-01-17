package Test_Cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Base.Driver_setup;
import Object_Model.P001_Login;

public class TC001_Login extends Driver_setup {
	
	public static String url = "https://www.daraz.com.bd/";
	
	@Test()
	public static void loginPage() throws InterruptedException {
		
        driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		P001_Login lc = new P001_Login(driver);
		lc.loginClick();
		lc.Email("atifshan794@gmail.com");
		lc.Password("Atif@1234");
		lc.loginBtn();
		Thread.sleep(5000);
		
	}

}
