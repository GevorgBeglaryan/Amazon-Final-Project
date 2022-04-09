import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class CreateAccountPage {

    WebDriver driver;

    public CreateAccountPage(WebDriver driver){

        this.driver = driver;
    }

    By CreateAccountBTN = By.id("createAccountSubmit");

    public void clickOnCreateAccountBTN(){

        driver.findElement(CreateAccountBTN).click();

    }

}
