package myTrip.MyFlight;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flight {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");

     // The user Select from City
        WebElement fromCity = driver.findElement(By.id("fromCity"));
        fromCity.click();
        Thread.sleep(2000);
        WebElement SelectCity = driver.findElement(By.xpath("//input[@placeholder='From']"));
        SelectCity.sendKeys("Toronto");
        Thread.sleep(2000);
        SelectCity.sendKeys(Keys.ARROW_DOWN);
        SelectCity.sendKeys(Keys.ENTER);

     // The user Select to City
        WebElement toCity = driver.findElement(By.id("toCity"));
        toCity.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        WebElement SelectToCity = driver.findElement(By.xpath("//input[@placeholder='To']"));
        SelectToCity.click();
        SelectToCity.sendKeys("Saskatoon, Canada");
        SelectToCity.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        WebElement SelectedCity = driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div"));
        SelectedCity.click();

     // The user Select date on the calendar. (15 June)
        WebElement calendar = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]"));
        calendar.click();
        Thread.sleep(2000);

     // If the suer want to change date just should change the flightDate xpath(Which day wants)
        WebElement flightDate = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[4]/div"));
        flightDate.click();
        Thread.sleep(2000);

     // The user click on the Search button.
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/p/a"));
        searchButton.click();

     // I put 10 second wait here because the system mostly working slow.
        Thread.sleep(4000);

     // The close the page
        driver.close();










    }






}
