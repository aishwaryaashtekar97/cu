package CaseStudies;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CaseStudy1 {
	WebDriver driver;
	@Given("open the testMe app")
	public void open_the_testMe_app() {
		System.setProperty("webdriver.ie.driver","C:\\NexGen Testing Stream\\Drivers\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.manage().window().maximize();
		driver.get("http://localhost:8083/TestMeApp");
		
		
	   
	}

	@When("click on SignIn page")
	public void click_on_SignIn_page() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    
	}

	@When("click on Register here")
	public void click_on_Register_here() {
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[3]/div/a[1]"))).click().build().perform();
	    
	}



	@When("user enter username as {string} in username field")
	public void user_enter_username_as_in_username_field(String un) {
		
		driver.findElement(By.name("userName")).sendKeys(un);
	   
	}

	@When("user enter the firstname as {string} in firstname field")
	public void user_enter_the_firstname_as_in_firstname_field(String fn) {
		driver.findElement(By.id("firstName")).sendKeys(fn);
	    
	}

	@When("user enter the lastname as {string} in lasname field")
	public void user_enter_the_lastname_as_in_lasname_field(String ln) {
		
		driver.findElement(By.id("lastName")).sendKeys(ln);
	    
	}

	@When("user enter Password as {string} in password field")
	public void user_enter_Password_as_in_password_field(String psd) {
		driver.findElement(By.id("password")).sendKeys(psd);
	   
	}

	@When("user enter confirmPassword as {string} in confirmpassword field")
	public void user_enter_confirmPassword_as_in_confirmpassword_field(String cpsd) {
		driver.findElement(By.id("pass_confirmation")).sendKeys(cpsd);
	    
	}

	@When("user select Gender as {string} in gender field")
	public void user_select_Gender_as_in_gender_field(String string) {
		WebElement elem = driver.findElement(By.xpath("//input[@value='Female']"));
	    elem.click();
		   
	}

	@When("user enter Email as {string} in email field")
	public void user_enter_Email_as_in_email_field(String mail) {
		
		driver.findElement(By.id("emailAddress")).sendKeys(mail);
	}

	@When("user enter MobileNumber as {string} in mobilenumber field")
	public void user_enter_MobileNumber_as_in_mobilenumber_field(String mob) {
		driver.findElement(By.id("mobileNumber")).sendKeys(mob);
	    
	}

	@When("user enter DOB as {string} in DOB field")
	public void user_enter_DOB_as_in_DOB_field(String dob) {
		
		driver.findElement(By.id("dob")).sendKeys(dob);
	}

	@When("user enter Adress as {string} in Address field")
	public void user_enter_Adress_as_in_Address_field(String add) {
		driver.findElement(By.id("address")).sendKeys(add);
	}

	@When("user select SecurityQuestion as {string} in securityquestion field")
	public void user_select_SecurityQuestion_as_in_securityquestion_field(String string) {
		
		driver.findElement(By.id("securityQuestion")).click();
		
		
		//Select sq= new Select(driver.findElement(By.id("securityQuestion")));
		//sq.deselectByIndex(1);
	}

	@When("user enter Answer as {string} in Answer field")
	public void user_enter_Answer_as_in_Answer_field(String ans) {
		driver.findElement(By.id("answer")).sendKeys(ans);
	    
	}

	@When("Click on Register")
	public void click_on_Register() {
		driver.findElement(By.name("Submit")).click();
		driver.quit();
	}

}
