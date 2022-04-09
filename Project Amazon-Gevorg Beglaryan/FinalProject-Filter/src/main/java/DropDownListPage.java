import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DropDownListPage {


    WebDriver driver;

    public DropDownListPage(WebDriver driver){

        this.driver = driver;

    }

    By dropDownClickBTN = By.xpath("//form//option[6]");


    public boolean select(){

        Select option = new Select(driver.findElement(dropDownClickBTN));

        //driver.findElement(dropDownClickBTN).click();

        if(option.selectByVisibleText("Books") ){

            return true;
            //System.out.print("Books text is displayed as Books is selected as a value");

        }else{

            return false;

            //System.out.println("other option is selected");

        }

    }






}
