import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class PaymentMethodPage {

    WebDriver driver;

    public PaymentMethodPage(WebDriver driver){

        this.driver = driver;
    }

    By hover = By.xpath("//div[2]/div/div/span/span[1]/span/input");
    By checkoutBTN = By.xpath("//div[2]/div/div/span/span[1]/span/input");


    public void hoverOverCreditDebitCardBTN(){

        driver.findElement(hover).release();
        System.out.println("When hovering over the credit or debit card button background color changes to dark gray color");
    }



    public void clickCreditDebitCardBTN(){

        driver.findElement(checkoutBTN).click();
    }

}
