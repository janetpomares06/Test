package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class OurSolutions {

    private final ChromeDriver driver;

    public OurSolutions(ChromeDriver driver) {
        this.driver = driver;
    }

    private By link = By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']");

    public void goCortellisCMCIntelligence() {

        JavascriptExecutor executor = driver;
        executor.executeScript("arguments[0].click();", driver.findElement(link));
    }

}
