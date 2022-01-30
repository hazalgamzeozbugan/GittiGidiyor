import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage{


    private static By searchLocator = By.name("k");
    private static By butonLocator = By.xpath("//*[text()='BUL']");
    private static By pageLocator = By.xpath("//span[text()='Sonraki']/..");
    private static By cookieLocator = By.xpath("//*[@id='__next']/main/div[4]/section[1]/section[2]/a/span");
    public SearchPage(WebDriver driver) { //constructor class
        super(driver);
    }

    public static void search(String text) {
        type(searchLocator, text);
        click(butonLocator);

    }
    public static void search2(){
        click(cookieLocator);
        click(pageLocator);
    }
}
