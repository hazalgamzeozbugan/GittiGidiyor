import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    private static By basketLocator = By.id("add-to-basket");
    private static By deleteCart = By.className("btn-delete btn-update-item");

    public void addProduct(){
         click(basketLocator);
    }

    public CartPage(WebDriver driver) {
        super(driver);

    }

    public  void deleteCartPage(){
        click(deleteCart);

    }
}
