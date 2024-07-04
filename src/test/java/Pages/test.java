package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class test {
    public WebDriver driver;

    @FindBy(xpath = "//button[@class='btn home'][contains(.,'Home')]")
    static WebElement home_Button_xpath;

    @FindBy(xpath = "//button[@ng-class='btnClass2'][contains(.,'Deposit')]")
    static WebElement deposit_Button_xpath;
    @FindBy(xpath = "//input[contains(@type,'number')]")
    static WebElement deposit_input_xpath;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    static WebElement deposit_button_submit_xpath;

    @FindBy(xpath = "//button[@ng-class='btnClass1'][contains(.,'Transactions')]")
    static WebElement transaction_button_xpath;

    @FindBy(xpath = "//button[@ng-class='btnClass3'][contains(.,'Withdrawl')]")
    static WebElement withdrawal_button_xpath;
    @FindBy(xpath = "//input[contains(@type,'number')")
    static WebElement withdrawal_input_xpath;
    @FindBy(xpath = "//button[@type='submit'][contains(.,'Withdraw')]")
    static WebElement withdraw_button_submit_xpath;

    @FindBy(xpath = "//button[@ng-show='logout'][contains(.,'Logout')]")
    static WebElement Logout_button_xpath;
    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement select_Account;
    @FindBy(xpath = "//button[contains(.,'Deposit')]")
    WebElement Deposit_Button;
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement Amount_xpath;

    public void selectAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(select_Account));
        select_Account.click();
        Select select = new Select(select_Account);
        select.selectByVisibleText("1001");
    }

    public void clickDepositButton() {
        Deposit_Button.click();
    }

    public void enterAmount(Integer amount) {
        Amount_xpath.sendKeys(amount.toString());
    }
}
