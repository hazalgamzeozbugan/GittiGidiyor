import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
//@TestMethodOrder(MethodOrderer.MethodName.class)

public class GittiGidiyorAutomation extends BaseTest{
    BasePage basePage= new BasePage(driver);
    CartPage cartPage=new CartPage(driver);
    HomePage homePage;
    ProductPage productPage = new ProductPage(driver);;
    SearchPage searchPage= new SearchPage(driver);

    @Test
    @Order(1)
    public void search(){
        SearchPage.search("bilgisayar");

    }

    @Test
    @Order(2)
    public void search2page(){
         SearchPage.search2();
    }

    @Test
    @Order(3)
    public void productSelect(){
        productPage.selectProduct(30);

    }
    @Test
    @Order(4)
    public void add(){
        cartPage.addProduct();
    }

    @Test
    @Order(5)
    public void price(){
        ProductPage.ProductFile();  //file bilgisi yazıcak burada
    }

    @Test
    @Order(6)
    public void deleteProduct(){
        CartPage.deleteCartPage();
    }

}
