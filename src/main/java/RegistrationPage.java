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

    @FindBy(css = "input[value='single']")
    private WebElement singleRadio;

    @FindBy(css = "input[value='divorced']")
    private WebElement divorcedRadio;

    @FindBy(css = "input[value='married']")
    private WebElement marriedRadio;

    @FindBy(css = "input[value='dance']")
    private WebElement danceCheckbox;

    @FindBy(css = "input[value='reading']")
    private WebElement readingCheckbox;

    @FindBy(css = "input[value='cricket']")
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

    public RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        verticalBar = new VerticalBar(driver);
    }

    public void setFirstName(String firstName)
    {
        this.firstName.sendKeys(firstName);
    }

    public String getFirstName()
    {
        return firstName.getText();
    }

    public void setLastName(String lastName)
    {
        this.lastName.sendKeys(lastName);
    }

    public String getLastName()
    {
        return firstName.getText();
    }

    public void setSingle()
    {
        singleRadio.click();
    }

    public void setMarried()
    {
        marriedRadio.click();
    }

    public void setDivorced()
    {
        divorcedRadio.click();
    }

    public void checkDance()
    {
        if(!danceCheckbox.isSelected())
            danceCheckbox.click();
    }

    public void checkReading()
    {
        if(!readingCheckbox.isSelected())
            readingCheckbox.click();
    }

    public void checkCricket()
    {
        if(!cricketCheckbox.isSelected())
            cricketCheckbox.click();
    }

    public void uncheckDance()
    {
        if(danceCheckbox.isSelected())
            danceCheckbox.click();
    }

    public void uncheckReading()
    {
        if(readingCheckbox.isSelected())
            readingCheckbox.click();
    }

    public void uncheckCricket()
    {
        if(cricketCheckbox.isSelected())
            cricketCheckbox.click();
    }

    public void selectCountry(String country)
    {
        Select selectCountry = new Select(this.country);
        selectCountry.selectByValue(country);
    }

    public void selectMonth(String month)
    {
        Select selectMonth = new Select(this.month);
        selectMonth.selectByValue(month);
    }

    public void selectYear(String year)
    {
        Select selectYear = new Select(this.year);
        selectYear.selectByValue(year);
    }

    public void selectDay(String day)
    {
        Select selectDay = new Select(this.day);
        selectDay.selectByValue(day);
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber.sendKeys(phoneNumber);
    }

    public String getPhoneNumber()
    {
        return phoneNumber.getText();
    }

    public void setEmail(String email)
    {
        this.email.sendKeys(email);
    }

    public String getEmail()
    {
        return email.getText();
    }

    public void setUsername(String user)
    {
        this.username.sendKeys(user);
    }

    public String getUsername()
    {
        return username.getText();
    }

    public void setAboutYourself(String about)
    {
        this.aboutYourself.sendKeys(about);
    }

    public String getAboutYourself()
    {
        return aboutYourself.getText();
    }

    public void setPassword(String password)
    {
        this.password.sendKeys(password);
    }

    public void setConfirmPassword(String password)
    {
        this.confirmPassword.sendKeys(password);
    }

    public RegistrationPage submit()
    {
        submitButton.click();
        return new RegistrationPage(driver);
    }
}
