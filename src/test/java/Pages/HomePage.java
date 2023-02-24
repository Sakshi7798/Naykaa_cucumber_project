package Pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@class='css-1upamjb']")
            @Getter
    WebElement searchBox;
    @FindBy(xpath = "//h1[@class='page-title-search']")
            @Getter
    WebElement searchResult;



    @FindBy(xpath = "//input[@class='css-1upamjb']")
            @Getter
    WebElement Search;
    @FindBy(xpath = "//div[@class='title']")
            @Getter
    WebElement Error;


    @FindBy(xpath = "//input[@class='css-1upamjb']")
            @Getter
    WebElement Box;
    @FindBy(id="title-listing")
    @Getter
    WebElement SearchIteams;


    @FindBy(className = "css-19j7d8y")
    @Getter
    WebElement LakmeBox;
    @FindBy(id="(//h1[@class=\"css-mrgb7e\"])[1]")
    @Getter
    WebElement LakmeSearch;

}
