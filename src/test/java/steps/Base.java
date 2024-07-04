package steps;

import Helpers.BrowserFactory;
import Pages.AccountPage;
import Pages.CustomerPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {
    BrowserFactory browserFactory = new BrowserFactory();
    final WebDriver driver = browserFactory.startBrowser("chrome", "http://www.way2automation.com/angularjs-protractor/banking/#/login");
    LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    AccountPage accountPage = PageFactory.initElements(driver, AccountPage.class);
    CustomerPage customerPage = PageFactory.initElements(driver, CustomerPage.class);


}
