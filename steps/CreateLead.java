package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{
	
	@Then("Get current title")
	public void getCurrentTitle()
	{
		System.out.println(driver.getTitle());
	}
	
	@Given("Click crmsfa link")
	public void clickcrmsfaLink() throws InterruptedException
	{
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
	}

	@Given("Click on Leads")
	public void clickOnLeads()
	{
		driver.findElement(By.linkText("Leads")).click();
	}
	@Given("Click Create Lead Button")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given("Enter company name")
	public void enterCompanyName() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
	}
	@Given("Enter Firstname")
	public void enterFirstName() {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Manjula");
	}
	@Given("Enter lastname")
	public void enterLastName() {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("T");
	}
	@When("click on Create Lead")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}



}
