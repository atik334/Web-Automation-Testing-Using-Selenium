package Test_Cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Object_Model.P001_Registration;
import Setup_driver.DriverSetup;

public class TC001_Registration extends  DriverSetup {

	static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";
@Test
	
	public void locatorLearning() throws InterruptedException {
		
		
		
		driver.get(baseUrl);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		P001_Registration pom = new P001_Registration(driver);
		
		pom.userName("Atik");
		pom.passwordField("Passwordfield");
		pom.signinBtn();
		Thread.sleep(2000);
		pom.forgotPassText();
		Thread.sleep(2000);
		pom.forgotName("Foysal");
		
		pom.forgotEmail("atik@gmail.com");
		
		pom.forgotNumber("01786234576");
		Thread.sleep(2000);
		pom.resetBtn();
		Thread.sleep(2000);
		
		String password = pom.getPassword();
		
		pom.gotoHome();
		Thread.sleep(2000);
		pom.newName("sazal");
		pom.newPass(password);
		Thread.sleep(2000);
		pom.clickCheckbox();
		pom.submit();
		Thread.sleep(2000);
	
}
}
