package Test_Cases;

import java.time.Duration;

import org.testng.annotations.Test;

import Base.Driver_setup;
import Object_Model.P001_Login;
import Object_Model.P002_Buy_A_Product;

public class TC002_Buy_A_Product extends TC001_Login{
	
	@Test()
	public static void newArrival() throws InterruptedException {
		
	      
		   P002_Buy_A_Product hl= new P002_Buy_A_Product(driver);
	       hl.homeAndLifestyle();
	       hl.brandName();
	       Thread.sleep(5000); 
	       hl.cofeeMaker();
	       hl.buyNow();
	       Thread.sleep(2000);  
		
	}

}


