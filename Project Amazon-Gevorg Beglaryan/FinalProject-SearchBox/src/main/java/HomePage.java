import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;



public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    By searchField = By.id("twotabsearchtextbox");
    By searchButton = By.xpath("//form//span/input");
    By searchDropdownList = By.id("searchDropdownBox");

    public void searchString(String string){

        driver.findElement(searchField).sendKeys(string);
        Select searchDropdown = new Select(driver.findElement(searchDropdownList));
        searchDropdown.selectByVisibleText("Books");

        if(searchDropdown.selectByVisibleText("Books") ){
            System.out.print("Books text is displayed as Books is selected as a value");

        }else{

            System.out.println("error");

        }
        driver.findElement(searchButton).click();

    }

}
