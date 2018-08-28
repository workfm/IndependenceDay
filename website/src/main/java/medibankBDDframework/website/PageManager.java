package medibankBDDframework.website;

import org.openqa.selenium.support.PageFactory;

public class PageManager extends BasePage{

	public PageManager() {
    
		PageFactory.initElements(Driver,this);
    
	}
	
    public BasePage basePage = new BasePage();
    public LoginPage lp = new LoginPage();
   public LandingPage ldp = new LandingPage();
   public TransferMoney tm = new TransferMoney();
    
}
