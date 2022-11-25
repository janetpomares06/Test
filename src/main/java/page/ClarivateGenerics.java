package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarivateGenerics {

    public ChromeDriver driver;

    public ClarivateGenerics(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goOurSolutions(){
        driver.findElement(By.linkText("Our solutions")).click();
    }
}
