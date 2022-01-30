import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasePage {

    protected static WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public static List<WebElement> findAll(By locator){
        return  driver.findElements(locator);
    }

    public void BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public static WebElement find(By locator) {
        return driver.findElement(locator);
    }

    public static void click(By locator) { //elemente tıklamak
        find(locator).click();
    }

    public static void type(By locator, String text) { //text olarak göndermek
        find(locator).sendKeys(text);
    }

    public static boolean isDisplayed(By locator){ //görünüp görünmediği kontrolü element için
        return find(locator).isDisplayed();
    }
    public static void cookies(By locator){
        find(locator).click();
    }
}
