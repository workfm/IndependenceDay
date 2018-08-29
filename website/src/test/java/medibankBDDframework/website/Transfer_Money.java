package medibankBDDframework.website;

import org.openqa.selenium.By;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import medibankBDDframework.website.PageManager;;

public class Transfer_Money extends BasePage{

	//@FindBy(how = How.XPATH, using = "//*[@id='PageContentWrapper']/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p")
	//WebElement confirmTransfer;
		
	PageManager pm = new PageManager();
	
	@Given("^user logs into \"([^\"]*)\" using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void logs_into(String system, String user_id, String password) {
		System.out.println("hello"+"-----------"+system+ user_id + password);
		pm.lp.logintoSystem(system, user_id, password);
	}
	
	@When("^he clicks on \"([^\"]*)\"$")
	public void he_clicks(String linktext) {
	System.out.println(linktext);
	pm.ldp.checkSuccessfulLogon();	
	
	
	
	//pm.ldp.click1(linktext);
	}
	
	@And("^navigates to \"([^\"]*)\"$")
	public void navigates_to(String linktext)
	{
		System.out.println(linktext);
		pm.ldp.click1(linktext);
	}
	
	@And("^initiates external transfer using \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void And_initiates_external_transfer_using(String transfer_from_account, String pay_to_account, String Account_Description, String Amount, String frequency) {
		pm.tm.initiateExternalTranfer(transfer_from_account,pay_to_account,Account_Description,Amount,frequency);
	
	}
	
	@Then("the Confirm Transfer page is displayed")
	public void Confirm_Transfer_page_should_be_displayed() {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		if (Driver.findElement(By.className("signonfont")).getText().trim()=="Confirm Transfer") {	
			System.out.println("Confirmation page for transfer reached");
			System.out.println(Driver.findElement(By.className("signonfont")).getText().trim());
		}else {
			System.out.println("fail");
			System.out.println(Driver.findElement(By.className("signonfont")).getText().trim());
	}
	
	
	//@Before
	
	//public void startUp() {
	//System.setProperty("user.dir", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe");
	 //System.out.println(System.getProperty("user.dir"));
	 //driver = new ChromeDriver();
	//}
	//@After
	 //public void tearDown() {
	   //driver.quit();
	 // }
	}
}
