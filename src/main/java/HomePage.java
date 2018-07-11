import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage {

    private WebDriver driver;

    @FindBy(id = "secondary")
    VerticalBar verticalBar;
}
