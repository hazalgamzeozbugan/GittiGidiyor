import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    @BeforeAll
    public static void setUp(){

        System.setProperty("webdriver.chrome.driver","properties/driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.gittigidiyor.com/");
        driver.manage().window().maximize();
        System.out.println("Anasayfa açıldı");

    }

    @AfterAll
    public static void tearDown(){
        //driver.quit();
        //System.out.println("Testler tamamlandı, browser kapatıldı");

    }




}

