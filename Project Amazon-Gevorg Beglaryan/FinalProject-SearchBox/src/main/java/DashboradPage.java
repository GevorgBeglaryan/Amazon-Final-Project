import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class DashboradPage {

    WebDriver driver;

    public DashboradPage(WebDriver driver){

        this.driver = driver;

    }

    By heading = By.xpath("/html/head/title[1]");

    public String getHeading(){

        String head = driver.findElement(heading).getText();
        return head;
    }

}
