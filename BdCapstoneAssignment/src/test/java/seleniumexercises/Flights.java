package seleniumexercises;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import seleniumexercises.pages.HomePage;
import seleniumexercises.pages.SearchForVisaPage;
import seleniumexercises.pages.VisaApplicationPage;

public class Flights {

    private WebDriver driver;

    @Before
    public void startBrowser() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alfred\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @Test
//    public void applyForVisa() {
//
//        new HomePage(driver)
//                .load()
//                .selectMenuItem("Visa");
//
//        new SearchForVisaPage(driver)
//                .setCountryOfOriginTo("American Samoa");
//
//        new VisaApplicationPage(driver);
//    }

    @Test
    public void bookAFlightHappyPath() {
        new HomePage(driver)
                .load()
        		
        		.selectMenuItem("Flights");
        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();

    }
    
    @Test
    public void bookAFlightHappyPathFl2() {
        new HomePage(driver)
                .load()
        		
        		.selectMenuItem("Flights");
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[1]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"FlightsDateEnd\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[10]/div/div/div[2]/div[18]")).click();
      
        
        
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
        
    }
    
    @Test
    public void bookAFlightHappyPathFl03() {
        new HomePage(driver)
                .load()
        		
        		.selectMenuItem("Flights");
        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
        
        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
        WebElement e = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[2]/div[2]/span/span[6]"));
        WebElement output = driver.findElement(By.className("irs-from"));
        Actions act = new Actions(driver);
        act.dragAndDropBy(e, +70, 0).perform();
        System.out.println(output);

    }
    
    @Test
  public void bookAFlightHappyPathFl04() {
      new HomePage(driver)
              .load()
      		
      		.selectMenuItem("Flights");
      driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
      
      driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
      driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
      driver.findElement(By.xpath("//*[@id=\"LIST\"]/li[1]/div/div[1]/div[2]/form/div[2]/div/button")).click();
      WebElement firstName = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[1]/div[1]/div/label/input"));
      WebElement lastName = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[1]/div[2]/label/input"));
      WebElement email = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[2]/div[1]/label/input"));
      WebElement confirm = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[2]/div[2]/label/input"));
      WebElement contactNumber = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[3]/div/label/input"));
      WebElement adress = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[4]/div/label/input"));
      
      
      
      firstName.sendKeys("Alfred");
      lastName.sendKeys("Man");
      email.sendKeys("1234@gmail.com");
      confirm.sendKeys("1234@gmail.com");
      contactNumber.sendKeys("084726937");
      adress.sendKeys("boomstraat 13");
      driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]")).click();
//      WebElement country = driver.findElement(By.xpath( "//*[@id=\"guestform\"]/div[5]/div/div[2]/div/div/input"));
//      country.sendKeys("ne");
//      driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/ul/li[135]")).click();
      
      WebElement name = driver.findElement(By.xpath( "//*[@id=\"passenger_name_0\"]"));
      WebElement age = driver.findElement(By.xpath( "//*[@id=\"passenger_age_0\"]"));
      WebElement passportNo = driver.findElement(By.xpath( "//*[@id=\"passenger_passport_0\"]"));
      
      name.sendKeys("Alfred Man");
      age.sendKeys("24");
      passportNo.sendKeys("hjsfh7283");
      
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div[4]/button")).click();
      
      
    
      
  }
    
  
    

    @After
    public void stopBrowser() {

        driver.quit();
    }
}
