package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Loginpage;

public class FBsteps extends Loginpage{
	public WebDriver driver;
//	public Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
	
	@Given("User Launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		
	    
	}

	@When("User open the URL {string}")
	public void user_open_the_url(String url) throws Exception {
		driver.get(url);
		Thread.sleep(3000);
	}

	@When("User enter email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String Uname, String Password) {
//		lp=PageFactory.initElements(driver, Loginpage.class);
		setemail(Uname);
		setpassword(Password);
//		lp.setemail(Uname);
//		lp.setpassword(Password);
	}

	@When("User click on login")
	public void user_click_on_login() throws Exception {
//		lp=PageFactory.initElements(driver, Loginpage.class);
//		lp.login();
		login();
	    
	}

	@When("User click on logout link")
	public void user_click_on_logout_link() {
//	    lp.logout();
	}

	@When("close browser")
	public void close_browser() {
	   driver.quit();
	}

}
