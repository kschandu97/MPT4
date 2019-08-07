package stepBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecipeBean {

	
WebDriver driver;
	
	@FindBy(name="fname")
	@CacheLookup
	WebElement fname;
	
	@FindBy(name="lname")
	@CacheLookup
	WebElement lname;

	@FindBy(name="email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="mobile")
	@CacheLookup
	WebElement mobile;
	
	@FindBy(name="enqdetails")
	@CacheLookup
	WebElement enqdetails;
	
	@FindBy(name="D6")
	@CacheLookup
	WebElement category;
	
	public WebElement getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category.sendKeys(category);
	}


	@FindBy(name="D5")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="D4")
	@CacheLookup
	WebElement mode;
	
	@FindBy(name="D3")
	@CacheLookup
	WebElement duration;
	
	
	public WebElement getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city.sendKeys(city);;
	}

	public WebElement getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode.sendKeys(mode);;
	}

	public WebElement getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration.sendKeys(duration);;
	}


	@FindBy(name="submit1")
	@CacheLookup
	WebElement loginButton;
	
	
	public RecipeBean(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFname() {
		return fname;
	}


	public void setFname(String fname) {
		
		this.fname.sendKeys(fname);
	}

	public WebElement getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname.sendKeys(lname);
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email.sendKeys(email);
	}


	public WebElement getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile.sendKeys(mobile);;
	}


	public WebElement getEnqdetails() {
		return enqdetails;
	}


	public void setEnqdetails(String enqdetails) {
		this.enqdetails.sendKeys(enqdetails);
	}


	public WebElement getLoginButton() {
		return loginButton;
	}


	public void setLoginButton() {
		this.loginButton.click();
	}
	
}
