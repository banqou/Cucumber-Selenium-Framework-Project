package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage {
    public WebDriver driver;

    @FindBy(xpath = "//button[@class='btn home'][contains(.,'Home')]")
    static WebElement home_button_xpath;

    @FindBy(xpath = "//button[contains(@ng-click,'customer()')]")
    WebElement customer_login_xpath;
    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement select_Customer_Name;
    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement Login_Button;



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHomeButton(){home_button_xpath.click();
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(home_button_xpath));
        home_button_xpath.isDisplayed();
        String productText = home_button_xpath.getText();
        Assert.assertEquals(productText, "Home");}

    public void verifyUserIsLoggedIn() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(home_button_xpath));
        home_button_xpath.isDisplayed();
        String productText = home_button_xpath.getText();
        Assert.assertEquals(productText, "Home");
    }

    public void clickCustomerLoginButton() {
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(20));
        wait.until (ExpectedConditions.visibilityOf(customer_login_xpath));
        customer_login_xpath.click();
    }

    public void selectCustomerName(){
        WebDriverWait wait = new WebDriverWait (driver, Duration.ofSeconds(30));
        wait.until (ExpectedConditions.visibilityOf (select_Customer_Name));
        select_Customer_Name.click ();
        Select select = new Select (select_Customer_Name);
        select.selectByVisibleText ("Hermoine Granger");

    }
    public void clickLoginButton(){
        Login_Button.click();
    }

}