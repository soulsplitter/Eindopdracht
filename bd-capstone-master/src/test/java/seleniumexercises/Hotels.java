package seleniumexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import seleniumexercises.helpers.SeleniumHelpers;
import seleniumexercises.pages.HomePage;
import seleniumexercises.pages.HotelBookingPage;

public class Hotels {

    private WebDriver driver;
    //gaat mogelijk nog weg, puur voor oefenen
    private SeleniumHelpers selenium;
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

    }

    @After
    public void stopBrowser() {

        driver.quit();
    }
}
