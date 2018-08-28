package medibankBDDframework.website;
import org.openqa.selenium.WebDriver;

public class BasePage extends SeleniumDriver
{
    protected WebDriver Driver;

//    public BasePage(WebDriver webDriver)
//    {
//        this.Driver = webDriver;
//        PageFactory.initElements(Driver,this);
//    }

    public BasePage()
    {
        this.Driver = webDriver;
    }
}