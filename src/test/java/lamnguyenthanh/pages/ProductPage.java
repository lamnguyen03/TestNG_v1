package lamnguyenthanh.pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ProductPage {
    private WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public void verifyProductPage(){
        String expectedURL = "https://www.saucedemo.com/inventory.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL);
        System.out.println(actualURL);
        System.out.println(expectedURL);
    }
}
