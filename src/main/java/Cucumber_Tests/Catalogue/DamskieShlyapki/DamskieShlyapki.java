package Cucumber_Tests.Catalogue.DamskieShlyapki;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Created by bondar on 4/17/2015.
 */
public class DamskieShlyapki {
    private WebDriver driver;
    private List<TeaserItem> teaserItems;

    public DamskieShlyapki(WebDriver driver){
        this.driver = driver;
    }

    public List<TeaserItem> getTeaserItems(){
        List<TeaserItem> returnedList  = new ArrayList<>();
        List<WebElement> webElementList =  driver.findElements(By.xpath(".//*[@class=\"teaser-item\"]"));
        for (WebElement webElement : webElementList){
            returnedList.add(new TeaserItem(driver, webElement));
        }
        return returnedList;
    }

    public void checkTeaserItemsStructure(){
        this.teaserItems = getTeaserItems();
        for (TeaserItem teaserItem : teaserItems){
            teaserItem.checkStructure();
        }
    }

    public void checkCurrentPageIs_DamskieShlyapki(){
        String currentUrl = driver.getCurrentUrl();
        boolean flag = currentUrl.matches("[Kk]apeluh.*[Dd]amskie.?[Ss]hlyapki.*");
        assertTrue("Current window is not 'Damskie Shlyapki'", flag);
    }

    public int getNumberOfTeaserItems(){
        return driver.findElements(By.xpath(".//*[@class=\"teaser-item\"]")).size();
    }


}
