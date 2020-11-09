package seleniumexercises;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumexercises.pages.*;

public class Extras {

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
                .setCountryOfOriginTo("American Samoa")
                .setCountryOfTravelTo("Vietnam")
                //.setDateOfTravelTo("01/12/2020")
                .setDateOfTravelToCurrent()
                .submitSearch("Submit");

        new VisaApplicationPage(driver)
                .setFirstName("Tom")
                .setLastName("Verheijden")
                .setEmail("ditisprive@gmail.com")
                .setConfirmEmail("ditisprive@gmail.com")
                .setContactNumber("0612345678")
                .submitSearch2("sub");


        new VerifyVisaApplicationPage(driver)


                .viewInvoice("View Invoice");
    }

    @Test
    public void rentABoat() throws InterruptedException {

        new HomePage(driver)
                .load()
                .selectMenuItem("Boats");

        new rentABoatPage(driver)
                .setCountryOfRentTo("Dubai, United Arab Emirates")
                .setBoatType("Jetboat")
                .setDateTo("01/12/2020");
        Thread.sleep(5000);



    }
    @After
    public void stopBrowser() {

        driver.quit();
    }
}
