package clarivate;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.*;

import java.time.Duration;
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

    public static final String GOOGLE_URL = "https://www.google.com/";
    public static final String CORTELLIS_LOGIN_URL = "https://access.cortellis.com/login?app=cmc";

    @Test()
    public void loginCortelisUrl_getCortelisLoginPageUrl_UrlIsCorrect(){

        ChromeDriver driver = new ChromeDriver();
        driver.get(GOOGLE_URL);

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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assert.assertEquals(cortellisLogin.getUrl(),CORTELLIS_LOGIN_URL);
    }
}
