package clarivate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

import java.util.concurrent.TimeUnit;

public class CortelisWT {

    private Google google;
    private GoogleSearch googleSearch;
    private ClarivateHome clarivateHome;
    private ClarivateGenerics clarivateGenerics;
    private OurSolutions ourSolutions;
    private CortellisHome cortellisHome;
    private ClarivateLogin clarivateLogin;
    private CortellisLogin cortellisLogin;
    public ChromeDriver driver;

    @Test()
    public void loginCortelisUrl_getCortelisLoginPageUrl_UrlIsCorrect(){
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        google = new Google(driver);
        googleSearch = new GoogleSearch(driver);
        clarivateHome = new ClarivateHome(driver);
        clarivateGenerics = new ClarivateGenerics(driver);
        ourSolutions = new OurSolutions(driver);
        cortellisHome = new CortellisHome(driver);
        clarivateLogin = new ClarivateLogin(driver);
        cortellisLogin = new CortellisLogin(driver);

        google.acceptCookies();
        google.enterKeyword();
        google.goSearching();
        googleSearch.enterClarivate();
        clarivateHome.acceptAllCookies();
        clarivateHome.goGenericAndManufacturing();
        clarivateGenerics.goOurSolutions();
        ourSolutions.goCortellisCMCIntelligence();
        cortellisHome.loginCortellis();
        clarivateLogin.loginCortellis();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.getCurrentUrl();
        Assert.assertEquals(cortellisLogin.getUrl()," https://access.cortellis.com/login?app=cmc");

        //CortellisLogin

        //driver.close();


    }
}
