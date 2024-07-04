package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerPage {

    public WebDriver driver;

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement select_Customer_Name;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement login_Button;

    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectCustomerName() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until (ExpectedConditions.visibilityOf(select_Customer_Name));
        select_Customer_Name.click();
        Select select = new Select(select_Customer_Name);
        select.selectByVisibleText("Hermoine Granger");
    }

    public void clickLoginButton() {
        login_Button.click();
    }
}