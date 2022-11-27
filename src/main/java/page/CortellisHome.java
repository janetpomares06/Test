package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CortellisHome {

    private final ChromeDriver driver;

    public CortellisHome(ChromeDriver driver) {
        this.driver = driver;
    }

    private final By login = By.xpath("//a[@href= 'https://clarivate.com/login/']");

    public void loginCortellis() {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(login)).click();

    }

}
