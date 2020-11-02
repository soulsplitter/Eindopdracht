package seleniumexercises;

import org.openqa.selenium.By;
import seleniumexercises.pages.*;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercises {

    private WebDriver driver;

    @Before
    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void applyForVisa() {

        new HomePage(driver)
                .load()
                .selectMenuItem("Visa");

        new SearchForVisaPage(driver)
                .setCountryOfOriginTo("American Samoa");

        new VisaApplicationPage(driver);
    }

    @Test
    public void bookAFlightHappyPath(){
        new HomePage(driver)
                .load();
driver.findElement(By.id("select2-drop")).sendKeys("");


    }

    @After
    public void stopBrowser() {

        driver.quit();
    }
}
