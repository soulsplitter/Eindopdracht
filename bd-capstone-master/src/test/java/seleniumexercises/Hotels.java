package seleniumexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumexercises.pages.HomePage;
import seleniumexercises.pages.SearchForVisaPage;
import seleniumexercises.pages.VisaApplicationPage;

public class Hotels {

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
driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/input[1]")).sendKeys("");


    }

    @After
    public void stopBrowser() {

        driver.quit();
    }
}
