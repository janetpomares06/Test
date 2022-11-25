package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarivateHome {

    public ChromeDriver driver;

    public ClarivateHome(ChromeDriver driver) {
        this.driver = driver;
    }

    private By acceptAll = By.xpath("//button[@id= 'onetrust-accept-btn-handler']");
    private By dropdown = By.xpath("//a[@id= 'dropdown']");


    public void acceptAllCookies(){
        driver.findElement(By.id("onetrust-accept-btn-handler")).click();
    }

    public void goProductsAndServices(){
        driver.findElement(dropdown).click();

    }

    public void goGenericAndManufacturing(){
        driver.findElement(By.id("menu-item-7")).click();
        driver.findElement(By.linkText("Generics & Manufacturing")).click();
    }

}
