package medibankBDDframework.website;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/**
 * Created by M63847 on 13/04/2017.
 */
public class SeleniumDriver
{
    private static WebDriver _driver;

    public static WebDriver webDriver = get_driver();

    private static WebDriver get_driver()
    {
        String path="";
        if (_driver == null)
        {
            //String driverConfig = System.getProperty("BROWSER");
            //String driverConfig = "phantomjs";
            String driverConfig = "Chrome";
            if(!driverConfig.isEmpty())
            {

                switch (driverConfig) {
                    case "Chrome":
                        path = new File("src//test//java//Drivers//chromedriver.exe").getAbsolutePath();
                       System.out.println(path);
                       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\agaur\\eclipse-workspace\\firstproject\\chromedriver\\chromedriver.exe");
                      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver\\chromedriver.exe"); 
                       String currentDir = System.getProperty("user.dir");
                       System.out.println("Current dir using System:" +currentDir);
                       
                       _driver = new ChromeDriver();
                      //  ConfigureDriver();
                        break;
                    case "Firefox":
                    	_driver = new FirefoxDriver();

                        break;
                    /*case "phantomjs":
                        //path = new File("//usr//bin//phantomjs").getAbsolutePath();
                        //System.setProperty("phantomjs.binary.path", path);
                        System.setProperty("phantomjs.binary.path", "C:\\Drivers\\phantomjs.exe");
                        _driver = new PhantomJSDriver();

                        break;
                    */
                    default:
                        System.out.println(driverConfig + " : this browser type is not implemented yet!!!");
                        break;
                }
            }
        }
        return _driver;
    }

    public static void getWebDriver()
     {
         if (_driver == null)
         {
             //String driverConfig = ConfigurationManager.AppSettings["browser"];
             String driverConfig = "Chrome";

             if (!(driverConfig).isEmpty())
             {
                 //switch (ConfigurationManager.AppSettings["browser"])
                 switch (driverConfig)
                 {
                     case "Chrome":
                         System.setProperty("webdriver.chrome.driver", "C:\\AutomationRepos\\selenium-core\\SeleniumCore\\bin\\Release\\chromedriver.exe");
                         _driver = new ChromeDriver();
                         ConfigureDriver();
                         break;
                     case "Firefox":

                         break;
                     case "IE":

                         break;
                     default:
                        System.out.println(driverConfig + " : this browser type is not implemented yet!!!");
                         break;
                 }
             }

         }
         webDriver = _driver;
     }
    
    private static void ConfigureDriver()
    {
        _driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        _driver.manage().deleteAllCookies();
        _driver.manage().window().maximize();
    }

    public static void NavigateToAUT(String url) throws InterruptedException,MalformedURLException
    {

        URL rootUrl = new URL(url);
        _driver.navigate().to(rootUrl);
        Thread.sleep(1600);
    }

}