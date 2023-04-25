package lamnguyenthanh.testcases;

import lamnguyenthanh.commons.BaseSetUp;
import lamnguyenthanh.pages.ProductPage;
import lamnguyenthanh.pages.SignInPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ProductTest extends BaseSetUp {
    private WebDriver driver;
    private ProductPage productPage;
    private SignInPage signInPage;


    @BeforeClass
    public void setUp() {
        driver = getDriver();
    }

    @Test(priority = 0)
    public void SignInPage() throws InterruptedException {
        signInPage = new SignInPage(driver);
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
//        Thread.sleep(3000);
        productPage = signInPage.SignIn("standard_user", "secret_sauce");
    }

    @Test(priority = 1)
    public void ProductPage() throws InterruptedException {
        productPage = new ProductPage(driver);
        productPage.verifyProductPage();
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
