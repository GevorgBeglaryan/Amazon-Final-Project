import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class AccountVerificationPage {

    WebDriver driver;

    public AccountVerificationPage(WebDriver driver){

        this.driver = driver;
    }

    By hoverOver = By.xpath("//form/div[7]//input");
    By enterOTP = By.id("cvf-input-code");
    By verifyButton = By.xpath("//form/div[7]//input");


    public void hoverOverBTN(){

        driver.findElement(hoverOver).release();
        System.out.println("When hovering over the Verify Create your Amazon account  button the background color changes to dark orange color ");

    }

    public void enterOTPField(Object otp){

        driver.findElement(enterOTP).sendKeys(otp);
    }

    public void clickVerifyBTN(){

        driver.findElement(verifyButton).click();
    }

}
