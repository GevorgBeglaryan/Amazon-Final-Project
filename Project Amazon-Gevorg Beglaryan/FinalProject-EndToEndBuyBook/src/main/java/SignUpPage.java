import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class SignUpPage {

    WebDriver driver;

    public SignUpPage(WebDriver driver){

        this.driver = driver;
    }

    By yourName = By.id("ap_customer_name");
    By mobileNumberOrEmail = By.id("ap_email");
    By passwordField = By.id("ap_password");
    By reEnterPassword = By.id("ap_password_check");
    By continueButton = By.xpath("//form//span/span/input");


    public void enterYourName(String name){

        driver.findElement(yourName).sendKeys(name);

    }

    public void enterNumberOrEmail(String number_email){

        driver.findElement(mobileNumberOrEmail).sendKeys(number_email);

    }

    public void enterPassword(String password){

        driver.findElement(passwordField).sendKeys(password);

    }

    public void reenterPassword(String duplicate){

        driver.findElement(reEnterPassword).sendKeys(duplicate);

    }

    public void clickContinueBTN(){

        driver.findElement(continueButton).click();

    }





}
