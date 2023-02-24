package steps;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import utils.BrowserManager;
import utils.QaProps;
import utils.TestDataReader;

import java.util.HashMap;

public class step_definations {
    private final WebDriver driver;
    HomePage homePage;
    String url;
    HashMap<String, String> data;
    Scenario scenario;

    public step_definations(BrowserManager browserManager) {
        this.driver = browserManager.getDriver();
    }

    @Before(order = 1)
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("the user navigates to the home page.")
    public void the_user_navigates_to_the_home_page() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user enter the product name.")
    public void the_user_enter_the_product_name() {
        homePage = new HomePage(driver);
        homePage.getSearchBox().sendKeys("TypeValue");
        homePage.getSearchBox().sendKeys(Keys.ENTER);
    }

    @Then("the product results should be displayed.")
    public void the_product_results_should_be_displayed() {
        String text = homePage.getSearchResult().getText();
        System.out.println(text);
        Assert.assertEquals(text, "SearchValue");

    }

    @Given("the user on the Nykaa homepage")
    public void theUserOnTheNykaaHomepage() {
        url = QaProps.getValue("url");
        driver.get(url);
        data = TestDataReader.getData(scenario.getName());
    }

    @When("the user  type {string} into the search box")
    public void theUserTypeIntoTheSearchBox(String arg0) {
        homePage = new HomePage(driver);
        homePage.getSearch().sendKeys("TypeValue");
        homePage.getSearch().sendKeys(Keys.ENTER);
    }

    @Then("the user should see a message")
    public void theUserShouldSeeAMessage() {
        String text = homePage.getError().getText();
        System.out.println(text);
        Assert.assertEquals(text, "SearchValue");

    }

    @When("the user  type {string} in the search bar.")
    public void theUserTypeInTheSearchBar(String arg0) {
        homePage = new HomePage(driver);
        homePage.getBox().sendKeys("TypeValue");
        homePage.getSearch().sendKeys(Keys.ENTER);

    }

    @Then("Verify that it Showing {int} of {int} results for masc")
    public void verifyThatItShowingOfResultsForMasc(int arg0, int arg1) {
        String text = homePage.getSearchIteams().getText();
        System.out.println(text);
        Assert.assertEquals(text, "SearchValue");
    }

    @When("the user search for  {string} in the search bar.")
    public void theUserSearchForInTheSearchBar(String arg0) {
        homePage = new HomePage(driver);
        homePage.getBox().sendKeys(arg0);
        homePage.getSearch().sendKeys(Keys.ENTER);
    }

    @Then("results for{string}")
    public void resultsFor(String arg0) {
        String text = homePage.getSearchIteams().getText();
        System.out.println(text);
        Assert.assertEquals(text, arg0);
    }


}
