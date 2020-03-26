package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class HomePage extends PageObject {
    private  WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver=driver;

    }

    public WebElement search(){
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(xpath("//input[@id='global-enhancements-search-query']")));
        return searchBox;
    }
    public String result(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        String results = wait.until(ExpectedConditions.presenceOfElementLocated(xpath("//span[@class='wt-text-caption wt-text-link-no-underline']"))).getText();
        return results;
    }



}

