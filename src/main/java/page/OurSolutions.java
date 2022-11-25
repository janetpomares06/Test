package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OurSolutions {
    public ChromeDriver driver;

    //ChromeOptions options = new ChromeOptions();
   // options.addArgumrnts("--headless");
    //WebDriver driver = new ChromeDriver(options);

    public OurSolutions(ChromeDriver driver) {
        this.driver = driver;
    }

    public void goCortellisCMCIntelligence() {

        WebElement ele = driver.findElement(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", ele);

        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']"))).click();
        //driver.findElement(By.xpath("//section[@id= 'oursolutions']//a[@href= 'https://clarivate.com/products/biopharma/discovery-clinical-regulatory/chemistry-manufacturing-controls-intelligence-analysis/']")).click(); //.getText(); ////div[@class= 'container']//div[@class= 'grid-view']"))
        //driver.close();
    }

}
