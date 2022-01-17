package Object_Model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P001_Registration { 
	WebDriver driver = null;
static String baseUrl = "https://rahulshettyacademy.com/locatorspractice/";

public P001_Registration(WebDriver driver) {
this.driver=driver;
}


By username = By.id("inputUsername");
By password = By.name("inputPassword");
By signinbtn= By.className("signInBtn");
By forgotpasswordText = By.linkText("Forgot your password?");
By forgotname = By.xpath("//input[@placeholder='Name']");
By forgotemail = By.cssSelector("input[placeholder='Email']");
By forgotnumber = By.xpath("//input[@type='text'][3]");
By resetbtn = By.cssSelector(".reset-pwd-btn");
By gotohome = By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]");
By newname = By.cssSelector("#inputUsername");
By newpass = By.cssSelector("input[type*='pass']");
By clickcheckbox = By.id("chkboxOne");
By submitbtn = By.xpath("//*[contains(@class,'submit')]");

public void userName(String text) {
driver.findElement(username).sendKeys(text);
}

public void passwordField(String text) {
driver.findElement(password).sendKeys(text);
}


public void signinBtn() {
// TODO Auto-generated method stub
driver.findElement(signinbtn).click();
}

public void forgotPassText() {
driver.findElement(forgotpasswordText).click();
}

public void forgotName(String text) {
driver.findElement(forgotname).sendKeys(text);
}

public void forgotEmail(String text) {
driver.findElement(forgotemail).sendKeys(text);
}

public void forgotNumber(String text) {
driver.findElement(forgotnumber).sendKeys(text);
}


public void resetBtn() {
// TODO Auto-generated method stub
driver.findElement(resetbtn).click();
}

public String getPassword() throws InterruptedException{
driver.get(baseUrl);
driver.findElement(By.linkText("Forgot your password?")).click();
Thread.sleep(2000);

driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
String passwordText=driver.findElement(By.cssSelector("p.infoMsg")).getText();
String [] passArray=passwordText.split("'");
String pass=passArray[1].split("'")[0];
return pass;
}


public void gotoHome() {
driver.findElement(gotohome).click();
}

public void newName(String text) {
driver.findElement(newname).sendKeys(text);
}

public void newPass(String text) {
driver.findElement(newpass).sendKeys(text);
}

public void clickCheckbox() {
driver.findElement(clickcheckbox).click();
}

public void submit() {
driver.findElement(submitbtn).click();
}


}


