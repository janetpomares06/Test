package page;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClarivateGenerics {

    private final ChromeDriver driver;

    public ClarivateGenerics(ChromeDriver driver) {
        this.driver = driver;
    }

    private By link = By.linkText("Our solutions");

    public void goOurSolutions() {
        driver.findElement(link).click();
    }
}
