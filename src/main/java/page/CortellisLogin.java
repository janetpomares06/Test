package page;

import org.openqa.selenium.chrome.ChromeDriver;

public class CortellisLogin {
    public ChromeDriver driver;

    public CortellisLogin(ChromeDriver driver) {
        this.driver = driver;
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
}
