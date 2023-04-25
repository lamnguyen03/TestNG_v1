package lamnguyenthanh.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
    private WebDriver driver;
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userName = By.id("user-name");
    private By passWord = By.id("password");
    private By logInButton = By.id("login-button");

    public ProductPage SignIn(String username, String password) throws InterruptedException {
        driver.findElement(userName).sendKeys(username);
        driver.findElement(passWord).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(logInButton).click();

        return new ProductPage(driver);
    }
}
