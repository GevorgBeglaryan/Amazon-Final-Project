import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class ProceedPage {

    WebDriver driver;

    public ProceedPage(WebDriver driver){

        this.driver = driver;
    }

    By hover = By.xpath("//form//div[2]/div/div[1]/div/div[1]/div/span/span/input");
    By checkoutBTN = By.xpath("//form//div[2]/div/div[1]/div/div[1]/div/span/span/input");


    public void hoverOverCheckoutBTN(){

        driver.findElement(hover).release();
        System.out.println("When hovering over the Proceed to checkout button background color changes to dark orange color");
    }


    public void clickCheckoutBTN(){

        driver.findElement(checkoutBTN).click();
        System.out.println();
    }

}
