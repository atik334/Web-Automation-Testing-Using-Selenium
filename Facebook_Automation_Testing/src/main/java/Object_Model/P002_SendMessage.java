package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P002_SendMessage {
	   
		 WebDriver driver = null;
			
		public P002_SendMessage(WebDriver driver) {
			this.driver=driver;
		}
	
		By messengerbtn = By.xpath("//div[@aria-label='Messenger' and @role='button']");
		By searchmessenger= By.xpath("//input[@placeholder='Search Messenger']");
		By clickaccount = By.xpath("//span[@class='scb9dxdr']");
		By chatbox = By.xpath("//div[@class='_1mf _1mj']");
		By sendkey = By.xpath("//*[name()='path' and contains(@d,'M16.691502')]");
		
      public void messengerBtn() {
			
			driver.findElement(messengerbtn).click();
		}
		
		public void searchMessenge(String sm){

			driver.findElement(searchmessenger).sendKeys(sm);
		}
         public void clickAccount() {
			
			driver.findElement(clickaccount).click();
		}
	    
	 public void chatbox(String cb) {
		 
			driver.findElement(chatbox).sendKeys(cb);
		}
	 public void sendKey() {
			
			driver.findElement(sendkey).click();
		}

}
