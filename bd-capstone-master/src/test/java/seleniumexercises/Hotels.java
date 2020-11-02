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
    public void bookAHotelHappyPath(){
        new HomePage(driver)
                .load();
        driver.findElement(By.xpath("")).click();
    }

    @After
    public void stopBrowser() {

        //driver.quit();
    }
}
