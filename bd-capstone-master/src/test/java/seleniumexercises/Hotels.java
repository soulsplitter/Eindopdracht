package seleniumexercises;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumexercises.helpers.SeleniumHelpers;
import seleniumexercises.pages.HomePage;
import seleniumexercises.pages.HotelBookingPage;
import seleniumexercises.pages.HotelFilterPage;

public class Hotels {

    private WebDriver driver;
    @Before
    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchForAHotelHappyPath(){
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10,04,2021)
                .setTheCheckOutDate(14,06,2022)
                .setAdults(5)
                .setChildren(5)
                .hitSearch();


        WebElement hotelsOverview = driver.findElement(By.xpath("//span[@class='text-primary']"));
        Assert.assertTrue(hotelsOverview.isDisplayed());

    }
    @Test
    public void DefineSearchHotelHappyPath(){
searchForAHotelHappyPath();
new HotelFilterPage(driver)
        .setStarsOneToFive(4)
        .setPercentageForMinimumPrice(20)
        .setPercentageForMaximumPrice(300);



//Assert.assert;


    }

    @After
    public void stopBrowser() {

       // driver.quit();
    }
}
