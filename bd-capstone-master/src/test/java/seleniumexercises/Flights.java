package seleniumexercises;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;
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

//    @Test
//    public void bookAFlightHappyPathFl01() {
//        new HomePage(driver)
//                .load()
//        		
//        		.selectMenuItem("Flights");
//        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
//
//    }
//    
//    @Test
//    public void bookAFlightHappyPathFl02() {
//        new HomePage(driver)
//                .load()
//        		
//        		.selectMenuItem("Flights");
//        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[1]/div/div[2]/label")).click();
//        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"FlightsDateEnd\"]")).click();
//        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[10]/div/div/div[2]/div[18]")).click();
//      
//        
//        
//        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
//        
//    }
//    
//    @Test
//    public void bookAFlightHappyPathFl03() {
//        new HomePage(driver)
//                .load()
//        		
//        		.selectMenuItem("Flights");
//        driver.findElement(By.xpath("//*[@id=\"FlightsDateStart\"]")).click();
//        
//        driver.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[9]/div/div/div[2]/div[2]")).click();
//        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[3]/div[4]/button")).click();
//        WebElement e = driver.findElement(By.xpath("//*[@id=\"filterResultCallapseOnMobile\"]/div/form/div[2]/div[2]/span/span[6]"));
//        WebElement output = driver.findElement(By.className("irs-from"));
//        Actions act = new Actions(driver);
//        act.dragAndDropBy(e, +70, 0).perform();
//        System.out.println(output);
//
//    }
    
    
	@SuppressWarnings("deprecation")
	@Test
  public void bookAFlightHappyPathFl04()  {
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
      driver.findElement(By.xpath("//*[@id=\"guestform\"]/div[5]/div/div[2]/div/ul/li[135]")).click();
      
      WebElement name = driver.findElement(By.xpath( "//*[@id=\"passenger_name_0\"]"));
      WebElement age = driver.findElement(By.xpath( "//*[@id=\"passenger_age_0\"]"));
      WebElement passportNo = driver.findElement(By.xpath( "//*[@id=\"passenger_passport_0\"]"));
      
      name.sendKeys("Alfred Man");
      age.sendKeys("24");
      passportNo.sendKeys("hjsfh7283");
      
      driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[1]/div[2]/div[4]/button")).click();
      

      
      
      driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
      driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div[2]/center/button[2]")).click();
      								//html/body/div/div[1]/div[1]/div/div/div[2]/center/button[2]
      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
      
      driver.findElement(By.xpath("//*[@id=\"gateway_chosen\"]")).click();
      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
      
      //select payment
      driver.findElement(By.xpath("//*[@id=\"gateway_chosen\"]/div/ul/li[5]")).click();
      driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
      
      
      try {
    	  
      
      WebElement bookingUnpaid = driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/div/div/div[4]/div[1]/span"));
      Assert.assertTrue(bookingUnpaid.isDisplayed());
      System.out.println("Assert uitgevoerd");
      }catch (Exception ex) {
    	  System.out.println("assert niet uitgevoerd");
    	  Assert.fail();
      }
    
//      Select paymentMethod =  new Select(driver.findElement(By.id("gateway")));
//      
//      List<WebElement> lst = paymentMethod.getOptions();
//      
//      //Looping through the options and printing dropdown options
//      System.out.println("The dropdown options are:");
//      for(WebElement options: lst)
//          System.out.println(options.getText());
//
//
//      paymentMethod.selectByVisibleText("Credit Card");
      
    
      
      
    
      
  }
    
  
    

//    @After
//    public void stopBrowser() {
//
//        driver.quit();
//    }
}