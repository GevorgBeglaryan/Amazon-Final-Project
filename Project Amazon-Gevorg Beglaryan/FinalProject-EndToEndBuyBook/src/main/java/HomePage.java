import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver = driver;

    }

    By searchField = By.id("twotabsearchtextbox");
    By searchBTN = By.xpath("//form//span/input");
    By searchDropDownList = By.id("searchDropdownBox");


    public void selectSearchFieldDropDown(){

        Select searchDropDown = new Select(driver.findElement(searchDropDownList));
        searchDropDown.selectByVisibleText("Books");

        if(searchDropDown.selectByVisibleText("Books")){

            System.out.print("Books text is displayed as Books is selected as a value");

        }else{

            System.out.println("Error");

        }

    }

    public void searchString(String string){

        driver.findElement(searchField).sendKeys(string);

    }

    public void clickSearchButton(){

        driver.findElement(searchBTN).click();

    }

}
