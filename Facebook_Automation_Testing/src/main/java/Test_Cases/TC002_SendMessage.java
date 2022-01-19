package Test_Cases;



import org.testng.annotations.Test;


import Object_Model.P002_SendMessage;

public class TC002_SendMessage extends TC001_Login  {

	static String baseUrl = "https://www.facebook.com/";

	@Test
	public void send_Message() throws InterruptedException {
		
	
		P002_SendMessage sm = new P002_SendMessage(driver);
		sm.messengerBtn();
		Thread.sleep(2000); 
		sm.searchMessenge("atik foysal satkhira");
		Thread.sleep(2000); 
		sm.clickAccount();
		Thread.sleep(2000); 
		sm.chatbox("Hi!");
		Thread.sleep(2000); 
		sm.sendKey();
		Thread.sleep(2000); 
	
}

}
