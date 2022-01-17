package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class P002_Buy_A_Product {
		 WebDriver driver = null;
		
		public P002_Buy_A_Product(WebDriver driver) {
			this.driver=driver;
		}
		
		By homelifestyle = By.xpath("//span[normalize-space()='Home & Lifestyle']");
		By kitchendinning = By.xpath("//span[normalize-space()='Kitchen & Dining']");
	    By coffeetea = By.xpath("//span[normalize-space()='Coffee & Tea']");
	    By brand = By.xpath("//input[@data-spm-click='gostr=/lzdse.result.filter;locaid=d3']");
	    By coffemaker = By.xpath("//a[@title='Miyako Coffee Maker Auto warm keeping with nonstick warming plate Permanent Filter with Handle']");
	    By bynow = By.xpath("//span[contains(text(),'Buy Now')]");
	    
	 
		public void homeAndLifestyle() {
			
			Actions action = new Actions(driver);
		
			action.moveToElement(driver.findElement(homelifestyle));
			
			action.moveToElement(driver.findElement(kitchendinning));
			
			action.moveToElement(driver.findElement(coffeetea));
			action.click().build().perform();
		}
		
	    public void brandName() {
			
			driver.findElement(brand).click();
		}
		
        
 public void cofeeMaker() {
			
 			driver.findElement(coffemaker).click();
 			
 		}
  
  public void buyNow() {
		
		driver.findElement(bynow).click();
	}
				
}
