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
    public void searchForAHotelHappyPathMin(){
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10,04,2021)
                .setTheCheckOutDate(14,06,2022)
                .setAdults(1)
                .setChildren(0)
                .hitSearch();
        WebElement hotelsOverview = driver.findElement(By.xpath("//span[@class='text-primary']"));
        Assert.assertTrue(hotelsOverview.isDisplayed());

    }
    @Test
    public void searchForAHotelHappyPathMax(){
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10,04,2021)
                .setTheCheckOutDate(14,06,2022)
                .setAdults(100)
                .setChildren(100)
                .hitSearch();
        WebElement hotelsOverview = driver.findElement(By.xpath("//span[@class='text-primary']"));
        Assert.assertTrue(hotelsOverview.isDisplayed());

    }
    @Test
    public void DefineSearchHotelHappyPathMin() {
        //copy of searchForAHotelHappyPath
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10, 04, 2021)
                .setTheCheckOutDate(14, 06, 2022)
                .setAdults(1)
                .setChildren(0)
                .hitSearch();
        new HotelFilterPage(driver)
                .setStarsOneToFive(4)
                .setPercentageForMinimumPrice(2)
                .setPercentageForMaximumPrice(100)
                .clickViewMoreHotelAmenities()
                .clickSwimmingPool()
                .clickBusinessCenter()
                .clickShuttleBusService()
                .clickTypeApartment()
                .clickSortHighToLow()
                .clickFilterSearch();
        WebElement filterSearch = driver.findElement(By.xpath("//p[@class='text-muted post-heading']"));
        Assert.assertTrue(filterSearch.isDisplayed());
    }
        @Test
        public void DefineSearchHotelHappyPathMax(){
            //copy of searchForAHotelHappyPath
            new HotelBookingPage(driver)
                    .load()
                    .selectHotelOrCity("London")
                    .setCheckInDate(10,04,2021)
                    .setTheCheckOutDate(14,06,2022)
                    .setAdults(100)
                    .setChildren(100)
                    .hitSearch();
            new HotelFilterPage(driver)
                    .setStarsOneToFive(4)
                    .setPercentageForMinimumPrice(2)
                    .setPercentageForMaximumPrice(100)
                    .clickViewMoreHotelAmenities()
                    .clickSwimmingPool()
                    .clickBusinessCenter()
                    .clickShuttleBusService()
                    .clickTypeApartment()
                    .clickSortHighToLow()
                    .clickFilterSearch();
            WebElement filterSearch = driver.findElement(By.xpath("//p[@class='text-muted post-heading']"));
            Assert.assertTrue(filterSearch.isDisplayed());
    }
    @Test
    public void BookHotelHappyPathMin() {
        //copy of searchForAHotelHappyPath
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10, 04, 2021)
                .setTheCheckOutDate(14, 06, 2022)
                .setAdults(1)
                .setChildren(0)
                .hitSearch();
        new HotelFilterPage(driver)
                .setStarsOneToFive(4)
                .setPercentageForMinimumPrice(2)
                .setPercentageForMaximumPrice(100)
                .clickViewMoreHotelAmenities()
                .clickSwimmingPool()
                .clickBusinessCenter()
                .clickShuttleBusService()
                .clickTypeApartment()
                .clickSortHighToLow()
                .clickFilterSearch();

        //deze nog changen
        WebElement filterSearch = driver.findElement(By.xpath("//p[@class='text-muted post-heading']"));
        Assert.assertTrue(filterSearch.isDisplayed());
    }
    @Test
    public void BookHotelHappyPathMax(){
        //copy of searchForAHotelHappyPath
        new HotelBookingPage(driver)
                .load()
                .selectHotelOrCity("London")
                .setCheckInDate(10,04,2021)
                .setTheCheckOutDate(14,06,2022)
                .setAdults(100)
                .setChildren(100)
                .hitSearch();
        new HotelFilterPage(driver)
                .setStarsOneToFive(4)
                .setPercentageForMinimumPrice(2)
                .setPercentageForMaximumPrice(100)
                .clickViewMoreHotelAmenities()
                .clickSwimmingPool()
                .clickBusinessCenter()
                .clickShuttleBusService()
                .clickTypeApartment()
                .clickSortHighToLow()
                .clickFilterSearch();

        //deze nog changen
        WebElement filterSearch = driver.findElement(By.xpath("//p[@class='text-muted post-heading']"));
        Assert.assertTrue(filterSearch.isDisplayed());
    }
    @After
    public void stopBrowser() {

       driver.quit();
    }
}
