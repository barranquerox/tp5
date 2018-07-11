import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

    private WebDriver driver;

    @FindBy(id = "secondary")
    public VerticalBar verticalBar;

    @FindBy(id = "name_3_firstname")
    private WebElement firstName;

    @FindBy(id = "name_3_lastname")
    private WebElement lastName;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[1]")
    private WebElement singleRadio;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[3]")
    private WebElement divorcedRadio;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[2]/div/div/input[2]")
    private WebElement marriedRadio;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[1]")
    private WebElement danceCheckbox;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[2]")
    private WebElement readingCheckbox;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[3]/div/div[1]/input[3]")
    private WebElement cricketCheckbox;

    @FindBy(id = "dropdown_7")
    private WebElement country;

    @FindBy(id = "mm_date_8")
    private WebElement month;

    @FindBy(id = "dd_date_8")
    private WebElement day;

    @FindBy(id = "yy_date_8")
    private WebElement year;

    @FindBy(id = "phone_9")
    private WebElement phoneNumber;

    @FindBy(id = "username")
    private WebElement username;

    @FindBy(id = "email_1")
    private WebElement email;

    @FindBy(id = "description")
    private WebElement aboutYourself;

    @FindBy(id = "password_2")
    private WebElement password;

    @FindBy(id = "confirm_password_password_2")
    private WebElement confirmPassword;

    @FindBy(name = "pie_submit")
    private WebElement submitButton;

    @FindBy(xpath = "//*[@id=\"pie_register\"]/li[8]/div/div/span")
    private WebElement emailError;

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        verticalBar = new VerticalBar(driver);
    }

    public RegistrationPage setFirstName(String firstName)
    {
        this.firstName.sendKeys(firstName);
        return this;
    }

    public String getFirstName()
    {
        return firstName.getText();
    }

    public RegistrationPage setLastName(String lastName)
    {
        this.lastName.sendKeys(lastName);
        return this;
    }

    public String getLastName()
    {
        return firstName.getText();

    }

    public RegistrationPage setSingle()
    {
        singleRadio.click();
        return this;
    }

    public RegistrationPage setMarried()
    {
        marriedRadio.click();
        return this;
    }

    public RegistrationPage setDivorced()
    {
        divorcedRadio.click();
        return this;
    }

    public RegistrationPage checkDance()
    {
        if(!danceCheckbox.isSelected())
            danceCheckbox.click();

        return this;
    }

    public RegistrationPage checkReading()
    {
        if(!readingCheckbox.isSelected())
            readingCheckbox.click();

        return this;
    }

    public RegistrationPage checkCricket()
    {
        if(!cricketCheckbox.isSelected())
            cricketCheckbox.click();

        return this;
    }

    public RegistrationPage uncheckDance()
    {
        if(danceCheckbox.isSelected())
            danceCheckbox.click();

        return this;
    }

    public RegistrationPage uncheckReading()
    {
        if(readingCheckbox.isSelected())
            readingCheckbox.click();

        return this;
    }

    public RegistrationPage uncheckCricket()
    {
        if(cricketCheckbox.isSelected())
            cricketCheckbox.click();

        return this;
    }

    public RegistrationPage selectCountry(String country)
    {
        Select selectCountry = new Select(this.country);
        selectCountry.selectByValue(country);
        return this;
    }

    public RegistrationPage selectMonth(String month)
    {
        Select selectMonth = new Select(this.month);
        selectMonth.selectByValue(month);
        return this;
    }

    public RegistrationPage selectYear(String year)
    {
        Select selectYear = new Select(this.year);
        selectYear.selectByValue(year);
        return this;
    }

    public RegistrationPage selectDay(String day)
    {
        Select selectDay = new Select(this.day);
        selectDay.selectByValue(day);
        return this;
    }

    public RegistrationPage setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber.sendKeys(phoneNumber);
        return this;
    }

    public String getPhoneNumber()
    {
        return phoneNumber.getText();
    }

    public RegistrationPage setEmail(String email)
    {
        this.email.sendKeys(email);
        return this;
    }

    public String getEmail()
    {
        return email.getText();
    }

    public RegistrationPage setUsername(String user)
    {
        this.username.sendKeys(user);
        return this;
    }

    public String getUsername()
    {
        return username.getText();
    }

    public RegistrationPage setAboutYourself(String about)
    {
        this.aboutYourself.sendKeys(about);
        return this;
    }

    public String getAboutYourself()
    {
        return aboutYourself.getText();

    }

    public RegistrationPage setPassword(String password)
    {
        this.password.sendKeys(password);
        return this;
    }

    public RegistrationPage setConfirmPassword(String password)
    {
        this.confirmPassword.sendKeys(password);
        return this;
    }

    public RegistrationPage submit()
    {
        submitButton.click();
        return new RegistrationPage(driver);
    }

    public boolean emailErrorIsDisplayed()
    {
        return emailError.isDisplayed();
    }
}
