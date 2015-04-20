package Cucumber_Tests.Catalogue;

import Cucumber_Tests.Catalogue.DamskieShlyapki.DamskieShlyapki;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by bondar on 4/17/2015.
 */
public class CataloguePage {
    private WebDriver driver;
    private String baseURL;

    public CataloguePage(WebDriver driver){
        this.driver = driver;
    }

    public DamskieShlyapki openDamskieShlyapki(){
        driver.findElement(By.xpath(".//div[contains(@class, \"categories\")]//a[contains(@href, \"damskie-shlyapki\")]")).click();
        return new DamskieShlyapki(driver);
    }

    public int getNumberOfLinksInTheLeftPanel(){
        return driver.findElements(By.xpath(".//*[@class=\"art-vmenu\"]//a")).size();
    }

    public DamskieShlyapki openDamskieShlyapkiFromLeftPanelByNumber(int number){
        driver.findElement(By.xpath("(.//*[@class=\"art-vmenu\"]//a)["+number+"]")).click();
        return new DamskieShlyapki(driver);
    }
}
