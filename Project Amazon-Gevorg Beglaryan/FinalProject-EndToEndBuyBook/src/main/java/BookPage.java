import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class BookPage {

    WebDriver driver;

    public BookPage(WebDriver driver){

        this.driver = driver;

    }

    By heading = By.xpath("/html/head/title[1]");
    By clickImageBTN = By.xpath("//span/a/div/img[1]");

    public String getHeading(){

        String head = driver.findElement(heading).getText();
        return head;

    }

    public void clickOnBook(){

        driver.findElement(clickImageBTN).click();

    }

}
