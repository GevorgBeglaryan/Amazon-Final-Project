import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class CreditorDebitCardPage {

        WebDriver driver;

        public CreditorDebitCardPage(WebDriver driver){

            this.driver = driver;
        }

        By cardNumber = By.xpath("//form//div/div[1]/div/input");
        By NameOnCard = By.xpath("//form//div[2]/div[2]/input");
        By expirationDateMonth = By.xpath("//form//div[2]/div[1]/span[1]/span/span/span");
        By expirationDateYear = By.xpath("//form//span[3]/span/span/span");
        By hoverOverAddYourCardBTN = By.xpath("//form//span[2]/span/input");
        By AddYourCardBTN = By.xpath("//form//span[2]/span/input");


        public void cardNumberField(int card){

           driver.findElement(cardNumber).sendKeys(card);

        }

        public void NameOnCardField(String name){

            driver.findElement(NameOnCard).sendKeys(name);

        }

        public void expirationDateMonthField(){

            Select select = new Select(driver.findElement(expirationDateMonth));
            select.selectByVisibleText("06");

            if(select.selectByVisibleText("06") ){
                System.out.print("06 is displayed from the drop down list for month from the expiration date");

            }else{

                System.out.println("error");
            }

        }


        public void expirationDateYear(){

            Select select = new Select(driver.findElement(expirationDateYear));
            select.selectByVisibleText("2022");

            if(select.selectByVisibleText("2022") ){
                System.out.print("2022 is displayed from the drop down list for year from the expiration date");

            }else{

                System.out.println("error");
            }

        }


        public void hoverOverAddYourCard(){

            driver.findElement(hoverOverAddYourCardBTN).release();
            System.out.println("When hovering over Add your card button background color changes to dark orange color");
        }

        public void clickOnAddYourCardBTN(){

            driver.findElement(AddYourCardBTN).click();

        }

}
