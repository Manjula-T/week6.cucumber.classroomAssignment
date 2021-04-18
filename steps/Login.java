package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login extends BaseClass {

	//public ChromeDriver driver;

	
	/*
	 * * @Given ("Open the browser") public void openBrowser() {
	 * 
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver();
	 * 
	 * }
	 */
	/*
	 * @Given("Load the URL") public void loadURL() {
	 * 
	 * driver.get("http://leaftaps.com/opentaps/control/login");
	 * 
	 * }
	 */
	
	
	  @Given("Enter the username as {string}") public void enterUername(String
	  username) { driver.findElement(By.id("username")).sendKeys(username);
	  
	  }
	  
	  @Given("Enter the password as {string}") public void enterPassword(String
	  password) { driver.findElement(By.id("password")).sendKeys(password); }
	  
	  @When("Click on login button") public void clickLogin() {
	  driver.findElement(By.className("decorativeSubmit")).click();
	  
	  }
	 
	@Then("Home page should be displayed")
	public void verifyHomepagTitle() {
		String title = driver.getTitle();
		if(title.contains("leaftaps"))
		{
			System.out.println("Home page is verified");
		}
	}
	
	
	
	  @But("Error message should get displayed") public void invalidLogin() { {
	  System.out.println("invalid login credentials"); }
	 
	 
	 }
	

}
