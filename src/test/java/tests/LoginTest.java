package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class LoginTest {

    @Test
    public void sampleLoginTest() {
        WebDriver driver = DriverFactory.getDriver();
        driver.get("https://example.com/login");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testuser", "password");

        DriverFactory.quitDriver();
    }
}
