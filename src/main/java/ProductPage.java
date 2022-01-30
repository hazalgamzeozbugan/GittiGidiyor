import net.jodah.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileWriter;
import java.util.List;

public class ProductPage extends BasePage{

    By optionLocator = By.name("chevronLeft");
    static By productLocator = By.className("productImageSlider");
    static By productPrice = By.id("sp-price-lowPrice");
    static By productPriceToCart = By.className("total-price");

    public ProductPage(WebDriver driver) {
        super(driver);
    }
    public boolean isOnProductPage(){
        return isDisplayed(optionLocator);
    }
    public void selectProduct(int i){
         getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productLocator);
    }
    public static double productPriceConvert(By productPrice){ //boşluklu ve virgüllü olan price değeri için
        String[] elementList = find(productPrice).getText().trim().split(" ");
        String element = elementList[0].replaceAll(",", "");
        return Double.parseDouble(element);
    }
    public static void productPriceToCart() {
        productPriceConvert(productPrice);
        productPriceConvert(productPriceToCart);
        System.out.println("Sepetteki Ürünün Fiyatı : " + productPriceToCart);
        if (productPrice == productPriceToCart) {
            System.out.println("Fiyat karşılastırması doğru");
        } else {
            System.out.println("Fiyat karşılastırması yanlış");
        }

    }
    public static void ProductFile()
    {
        try{
            FileWriter fw = new FileWriter("C:/Users/testinium/IdeaProjects/GittiGidiyor/ProductFile.txt");
            fw.write(String.valueOf(productLocator));
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}

