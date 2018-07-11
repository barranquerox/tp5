import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestTP5 {

    WebDriver driver;

    @Before
    public void init()
    {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://www.demoqa.com");
    }

    @After
    public void teardown()
    {
        driver.quit();
    }

    @Test
    public void test1()
    {
        HomePage homePage = new HomePage(driver);

        RegistrationPage registrationPage = homePage.verticalBar.openRegistration();
        registrationPage.verticalBar.openRegistration();

        registrationPage.setFirstName("Luis");
        registrationPage.setLastName("Garelli");
        registrationPage.setSingle();
        registrationPage.setMarried();
        registrationPage.setDivorced();
        registrationPage.setSingle();
        registrationPage.checkCricket();
        registrationPage.checkDance();
        registrationPage.checkReading();
        registrationPage.uncheckCricket();
        registrationPage.uncheckDance();
        registrationPage.uncheckReading();
        registrationPage.checkReading();
        registrationPage.selectCountry("Venezuela");
        registrationPage.selectDay("12");
        registrationPage.selectMonth("11");
        registrationPage.selectYear("1985");
        registrationPage.setPhoneNumber("0123456789");
        registrationPage.setUsername("LuisCCC");
        registrationPage.setEmail("LuisCCCTest@yahoo.fr");
        registrationPage.setAboutYourself("Formation Selenium");
        registrationPage.setPassword("012345678");
        registrationPage.setConfirmPassword("012345678");
        registrationPage = registrationPage.submit();
    }
}
