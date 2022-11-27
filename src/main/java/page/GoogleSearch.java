package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

    private final ChromeDriver driver;

    public GoogleSearch(ChromeDriver driver) {
        this.driver = driver;
    }

    public void enterClarivate() {

        driver.findElement(By.linkText("clarivate.com")).click();
    }

}
