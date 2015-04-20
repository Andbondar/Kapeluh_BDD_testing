package Cucumber_Tests;

import Cucumber_Tests.Catalogue.CataloguePage;
import Cucumber_Tests.Catalogue.DamskieShlyapki.DamskieShlyapki;
import com.gargoylesoftware.htmlunit.Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by bondar on 4/17/2015.
 */
public class PageInstance {
    protected static WebDriver driver;
    protected static Page page;
    protected static StartPage startPage;
    protected static CataloguePage cataloguePage;
    protected static DamskieShlyapki damskieShlyapki;
    protected static String baseURL;


    public void setBaseURL(String baseURL){
        this.baseURL = baseURL;
    }


    public static void setBrowser(String browser){
        File file;
        switch (browser.toLowerCase()){
            case "ie":
                file = new File("tools/IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
                driver = new InternetExplorerDriver();
                break;
            case "ch":
                file = new File("tools/chromedriver.exe");
                System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
                driver = new ChromeDriver();
                break;
            case "ff":
            default:
                driver = new FirefoxDriver();
                break;
        }
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
