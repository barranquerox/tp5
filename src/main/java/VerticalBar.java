import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerticalBar {

    WebDriver driver;

    @FindBy(id = "menu-item-374")
    WebElement registrationLink;

    public VerticalBar(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public RegistrationPage openRegistration()
    {
        registrationLink.click();
        return new RegistrationPage(driver);
    }
}
