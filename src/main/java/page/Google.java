package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Google {

    public static final String CLARIVATE = "Clarivate";
    public ChromeDriver driver;

    public Google(ChromeDriver driver) {
        this.driver = driver;
    }

    private By acceptAll = By.xpath("//button[@id= 'L2AGLb']");
    private By search = By.xpath("//input[@name= 'q']");
    //private By linkClarivate = By.xpath("//body[@id= 'gsr']");

    public void acceptCookies(){
        driver.findElement(acceptAll).click();
    }

    public void enterKeyword(){
        driver.findElement(search).sendKeys(CLARIVATE);
    }

    public void goSearching(){
        driver.findElement(search).submit();
    }

//    public void enterClarivate(){
//        driver.findElement(linkClarivate).click();
//
//    }
}
