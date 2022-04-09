import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BuyNowPage {

    WebDriver driver;

    public BuyNowPage(WebDriver driver){

        this.driver = driver;
    }

    By heading = By.xpath("//div[1]/title/text()");
    By BuyBTN = By.id("buy-now-button");

    public String getHeading(){

        String head = driver.findElement(heading).getText();
        return head;

    }

    public void clickOnBuy(){

        driver.findElement(BuyBTN).click();

    }

}
