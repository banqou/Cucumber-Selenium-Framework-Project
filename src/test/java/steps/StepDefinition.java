package steps;

import Pages.AccountPage;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class StepDefinition extends Base {

    @Given("I am logged in as a customer")
    public void I_am_logged_in_as_a_customer() {
    }

    @When("I click the 'Customer Login' button")
    public void i_click_the_customer_login_button() {

        loginPage.clickCustomerLoginButton();
    }

    @Then("I should see home screen")
    public void i_should_see_home_screen() {
    }

    @Then("I select first customer name")
    public void i_select_first_customer_name() {
        customerPage.selectCustomerName();
    }

    @Then("I click 'Login' button")
    public void i_click_login_button() {
        customerPage.clickLoginButton();
    }

    @Then("I should see welcome")
    public void i_should_see_welcome() {
    }

    @And("I select the first account")
    public void i_select_the_first_account() {
        accountPage.selectAccount();
    }

    @And("I click 'Deposit' tab")
    public void i_click_deposit_tab() {
        accountPage.clickDepositButton();
    }

//    2nd solution
//    @Then("^I deposit (\\d+) into the field$ ")
//    @Then("^I deposit (.*)$")
//    public void i_deposit(int amount) {
//        accountPage.enterAmount(String.valueOf(amount));
//    }


    @Then("I deposit {int} into the field")
    public void i_deposit(int amount) {
        accountPage.enterAmount(String.valueOf(amount));
    }

    @And("I click 'Deposit' button")
    public void i_click_deposit_button() {
        accountPage.clickDepositSubmitButton();
    }

    @Then("I validate the deposit was successful")
    public void i_validate_deposit() {
        accountPage.verifyDepositSuccess();
    }

    @Then("I deposit {} into each account")
    public void i_deposit_into_each_account(int amount){
        accountPage.depositOnEachAccount(amount);
    }

    @Then("I validate deposit was successful")
    public void i_validate_deposits(){
        accountPage.verifyDepositSuccessOnEachAccount();
    }

    @When("I open transactions")
    public void i_open_trxs(){
        accountPage.openTransactions();
    }

    @Then("I validate the transaction appears")
    public void i_validate_trxs(){
        accountPage.validateTransactions();
    }

    @And("I click 'Withdrawl' tab")
    public void open_withdrawal(){
        accountPage.clickWithdrawalButton();
    }

    @And("I withdraw {int}")
    public void i_withdraw(int amount){
        accountPage.withdrawAmount(String.valueOf(amount));
    }

    @And("I click 'Withdraw' button")
    public void i_click_withdraw_button() {
        accountPage.clickWithdrawSubmitButton();
    }

    @Then("I validate the current balance is the original balance")
    public void i_validate_balance(){
        //accountPage.validateOriginalBalance();
        Assert.assertTrue(accountPage.isBalanceRestored());
    }

    @And("I logout")
    public void i_click_logout_button() {
        accountPage.ClickLogoutButton();
        driver.quit();
    }

//    @AfterStep
//    public void addAScreenshot(Scenario scenario) {
//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", "image");
//        }
//    }

    @After
    public void closeBrowser() {
        driver.quit();
        accountPage.quitDriver();
    }
}
