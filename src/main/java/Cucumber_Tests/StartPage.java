package Cucumber_Tests;

import Cucumber_Tests.Catalogue.CataloguePage;
import org.openqa.selenium.WebDriver;

/**
 * Created by bondar on 4/17/2015.
 */
public class StartPage {
    private static WebDriver driver;
    private static String baseURL = "http://kapeluh.com.ua/";

    public StartPage(WebDriver driver){
        this.driver = driver;
    }
    public void open(){
        driver.get(baseURL);
    }
    public CataloguePage openCatalogue(){
        driver.get(baseURL + "frontpage/produktsiya");
        return new CataloguePage(driver);
    }
}
