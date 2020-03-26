package starter.steps;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import starter.pages.HomePage;
import starter.pages.Login;

import static org.assertj.core.api.Java6Assertions.assertThat;


public class StepDefinitions {

    private WebDriver driver;
    private Login login;
    private HomePage homePage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/mac/chromedriver");
        driver = new ChromeDriver();
    }

    @Given("^user navigates to etsy home page$")
    public void userNavigatesToEtsyHomePage() {

        driver.get("https://www.etsy.com/");
    }

    @Then("^user login on Etsy home page$")
    public void userLoginOnEtsyHomePage() throws InterruptedException {
        login = new Login(driver);

        login.login();
        Thread.sleep(5000);


    }

    @When("^user searches \"([^\"]*)\"$")
    public void userSearches(String item) {
        homePage = new HomePage(driver);

        homePage.search().sendKeys(item + Keys.ENTER);

    }

    @Then("^user should be able to see the title \"([^\"]*)\"$")
    public void userShouldBeAbleToSeeTheTitle(String expectedTitle) throws Throwable {
        homePage = new HomePage(driver);
        String title = driver.getTitle();
        Assert.assertEquals(title,expectedTitle);
        assertThat(homePage.result().contains("Results"));
        driver.close();
    }


}
