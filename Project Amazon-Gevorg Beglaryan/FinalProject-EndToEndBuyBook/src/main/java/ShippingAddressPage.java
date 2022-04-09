import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ShippingAddressPage {

    WebDriver driver;

    public ShippingAddressPage(WebDriver driver){

        this.driver = driver;
    }

    By countryRegion = By.xpath("//form//div[2]/span/span/span/span");
    By fullName = By.id("address-ui-widgets-enterAddressFullName");
    By streetAddress = By.id("address-ui-widgets-enterAddressLine1");
    By city = By.id("address-ui-widgets-enterAddressCity");
    By zipCode = By.id("address-ui-widgets-enterAddressPostalCode");
    By phoneNumber = By.id("address-ui-widgets-enterAddressPhoneNumber");
    By checkMark = By.id("address-ui-widgets-use-as-my-default");
    By addressBTN = By.xpath("//form//span/input");


    public void selectCountry(){

        Select select = new Select(driver.findElement(countryRegion));
        select.selectByVisibleText("Armenia");

        if(select.selectByVisibleText("Armenia") ){
            System.out.print("Armenia text is displayed as Armenia is selected as a value");

        }else{

            System.out.println("error");
        }

    }


    public void fullNameField(String name){

        driver.findElement(fullName).sendKeys(name);

    }

    public void streetAddressField(String address){

        driver.findElement(streetAddress).sendKeys(address);

    }

    public void cityField(String ct){

        driver.findElement(city).sendKeys(ct);

    }

    public void zipCodeField(int zip){

        driver.findElement(zipCode).sendKeys(zip);

    }

    public void phoneNumberField(int phone){

        driver.findElement(phoneNumber).sendKeys(phone);

    }

    public void checkMarkField(){

        driver.findElement(checkMark).click();

    }

    public void clickOnAddressBTN(){

        driver.findElement(addressBTN).click();

    }

}
