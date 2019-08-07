package RecipeStepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import stepBean.RecipeBean;

public class TestClass {
	
	
	private WebDriver driver;
	private RecipeBean bean;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\npedapat\\AkhilWorkspace\\BDDWorkspace\\chromedriver_win32\\\\chromedriver.exe" );
		driver= new ChromeDriver();
	}
	

	
	@Given("^User is on register page$")
	public void user_is_on_register_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("D:\\Users\\npedapat\\AkhilWorkspace\\BDDWorkspace\\FormWeb2\\HTML\\Recipe_class_registration.html");
		bean = new RecipeBean(driver);
	}

	@When("^firstname is invalid$")
	public void firstname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid firstname$")
	public void then_show_message_invalid_firstname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exmessage="First Name must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

	@When("^lastname is invalid$")
	public void lastname_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid lastname$")
	public void then_show_message_invalid_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exmessage="Last Name must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

	@When("^email is invalid$")
	public void email_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid email$")
	public void then_show_message_invalid_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exmessage="Email must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}

	@When("^Mobile no is invalid$")
	public void mobile_no_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid mobile no$")
	public void then_show_message_invalid_mobile_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exmessage="Mobile must be filled out";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}
	
	@When("^Mobile no is less than (\\d+) digits$")
	public void mobile_no_is_less_than_digits(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setLoginButton();
	}
/*
	@Then("^then show message enter (\\d+) digits mobile number$")
	public void then_show_message_enter_digits_mobile_number(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String exmessage="Enter 10 digit Mobile number";
		String acmessage=driver.switchTo().alert().getText();
		Assert.assertEquals(exmessage,acmessage);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
	}
*/

	@When("^Category is invalid$")
	public void category_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setCategory("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid category$")
	public void then_show_message_invalid_category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^mode is invalid$")
	public void mode_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setCategory("Non-Veg");
		bean.setMode("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid mode$")
	public void then_show_message_invalid_mode() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^duration is invalid$")
	public void duration_is_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setCategory("Non-Veg");
		bean.setMode("In house training");
		bean.setDuration("");
		bean.setLoginButton();
	}

	@Then("^then show message invalid duration$")
	public void then_show_message_invalid_duration() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Enquiry details are invalid$")
	public void enquiry_details_are_invalid() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setCategory("Non-Veg");
		bean.setMode("In house training");
		bean.setDuration("6 months");
		bean.setCity("Mumbai");
		bean.setEnqdetails("");
		bean.setDuration("");
	}

	@Then("^then show message invalid Enquiry details$")
	public void then_show_message_invalid_Enquiry_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String exmessage="Enquiry details must be filled out";
		//String acmessage=driver.switchTo().alert().getText();
		////Assert.assertEquals(exmessage,acmessage);
		//driver.switchTo().alert().accept();
		//Thread.sleep(2000);
		//driver.close();
	}

	@When("^all valid details$")
	public void all_valid_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		bean.setFname("Akhil");
		bean.setLname("Pedapati");
		bean.setEmail("narasimhaakki98@example.com");
		bean.setMobile("7680895948");
		bean.setCategory("Non-Veg");
		bean.setMode("In house training");
		bean.setDuration("6 months");
		bean.setCity("Mumbai");
		bean.setEnqdetails("Enquiry Completed");
	}

	@Then("^then go to success page$")
	public void then_go_to_success_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//String exmessage="Thank you for submitting the online recipe class Enquiry";
		//String acmessage=driver.switchTo().alert().getText();
	   // Assert.assertEquals(exmessage,acmessage);
		//driver.switchTo().alert().accept();
	   // Thread.sleep(2000);
	   // driver.close();
	}


}
