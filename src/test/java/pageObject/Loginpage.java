package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Loginpage {
	
//	element properties
	@FindBy(xpath = "//input[@type='text']")
	WebElement username;
	
	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;
	
	@FindBy(xpath = "//button[@name='login']")
	WebElement Login;
	
	@FindBy(xpath = "//button[@name='logout']")
	WebElement Logout;
	
	//elements methods

	public void setemail(String uname)
	{
		
		username.sendKeys(uname);
	}
	public void setpassword(String pwd)
	{
		
		Password.sendKeys(pwd);
		
	}
	
	public void login() throws Exception
	{
		Login.click();
		Thread.sleep(3000);
		
	}
	public void logout()
	{
		Logout.click();
		
		
	}	
		
		
	

}
