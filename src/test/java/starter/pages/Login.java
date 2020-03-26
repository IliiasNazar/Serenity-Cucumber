package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.xpath;

public class Login extends PageObject {

    private WebDriver driver;

    public Login(WebDriver driver) {
        this.driver = driver;
    }

    private WebElement signInBtn;
    private WebElement uncheck;
    private WebElement emailAddress;
    private WebElement password;
    private WebElement signIn;


    public void login() {

        WebDriverWait wait = new WebDriverWait(driver, 20);
        String sgnBtn = "//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']";
        signInBtn = wait.until(ExpectedConditions.presenceOfElementLocated(xpath(sgnBtn)));
        signInBtn.click();
        String unchek = "//span[@class='checkbox-label']";
        uncheck = wait.until(ExpectedConditions.presenceOfElementLocated(xpath(unchek)));
        uncheck.click();
        String emal = "//input[@id='join_neu_email_field']";
        emailAddress = wait.until(ExpectedConditions.presenceOfElementLocated(xpath(emal)));
        emailAddress.sendKeys("arapbaevich@gmail.com");
        String pswd = "//input[@id='join_neu_password_field']";
        password = wait.until(ExpectedConditions.presenceOfElementLocated(xpath(pswd)));
        password.sendKeys("kincarta2020");
        String sgnIn = "//button[@name='submit_attempt']";
        signIn = wait.until(ExpectedConditions.presenceOfElementLocated(xpath(sgnIn)));
        signIn.click();
    }

}
