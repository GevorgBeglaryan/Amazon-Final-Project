import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){

        this.driver = driver;

    }

    By heading = By.xpath("//form//option[6]");


    public String getHeading(){

        String head = driver.findElement(heading).getText();
        return head;

    }

}
