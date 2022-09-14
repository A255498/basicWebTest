package webtests.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

//automationpractice.com
public class loginPage {
    WebDriver driver;


    @FindBy(id = "name") private WebElement nameInputHOTFIX;
    private static By loginInput = By.id("loginInput");
    //WebElement locator = getDriver().findElement(By.xpath("//tr/td[contains(text(),'" + name + "')]"));
    WebElement locator = driver.findElement(By.xpath("//tr/td[contains(text(),'test')]"));
    //private static List<WebElement> = driver.findElements(By.ByXPath(""));

    /*
    public loginPage(WebDriver driver) {
        this.driver = driver;
    }

     */

    //public loginPage(WebDriver driver) { super(driver); }

}
