package page;

import org.openqa.selenium.chrome.ChromeDriver;

public class CortellisLogin {

    private final ChromeDriver driver;

    public CortellisLogin(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {

        return driver.getCurrentUrl();
    }
}
