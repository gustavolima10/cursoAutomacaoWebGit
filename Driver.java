package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {
    private static WebDriver driver;
    public static WebDriverWait wait;

    public static void abreNavegdor(){
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 15);
        driver.manage().window().maximize();
    }

    public static void fechaNavegador(){
        driver.quit();
    }

    public static WebDriver getDriver() {

        return driver;
    }

    public static void setUrl(String url){
        driver.get(url);

    }

    public static WebElement waitVisibleElement(By by){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

   public static void waitInvisibilityElement(By by){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
   }

   public static WebElement waitClicableElement(By by){
        return wait.until(ExpectedConditions.elementToBeClickable(by));
   }

}
