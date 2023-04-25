package lamnguyenthanh.testcases;

import lamnguyenthanh.commons.BaseSetUp;
import lamnguyenthanh.pages.SignInPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class SignInTest extends BaseSetUp {
    private WebDriver driver;
    private SignInPage signInPage;

    @BeforeClass
    public void setUp() {
        driver = getDriver();

    }

    @Test
    public void SignInPage() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInPage.SignIn("standard_user", "secret_sauce");
        Thread.sleep(2000);
    }

    @AfterTest
    public void close() {
        driver.quit();
    }
}
