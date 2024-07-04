package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    public WebDriver driver;

    @FindBy(xpath = "//button[contains(.,'Customer Login')]")
    //@FindBy(css = "button.btn.btn-primary.btn-lg[ng-click='customer()']")
    WebElement customer_login_xpath;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCustomerLoginButton() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(customer_login_xpath));
        customer_login_xpath.click();
    }
}