import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;


public class CardCurrencyPage {

        WebDriver driver;

        public CardCurrencyPage(WebDriver driver){

            this.driver = driver;
        }


        By radioButtonDifferentCurrency = By.xpath("//form//div[3]/div/label/span/span");
        By hoverOverDropDownCurrency = By.xpath("//form//span/span/span/span/span");
        By dropDownCurrency = By.xpath("//form//span/span/span/span/span");
        By continueBTN = By.xpath("//form/div[2]//input");


        public void radioButton(){


             driver.findElement(radioButtonDifferentCurrency).click();

             if(radioButtonDifferentCurrency.isSelected()){

                     System.out.println("My card is in a different currency is being selected");

             }else{

                    System.out.println("Another option is selected");
             }
        }

        public void hoverOver(){

                driver.findElement(hoverOverDropDownCurrency).release();
                System.out.println("When hovering over the different currency option background color changes to dark gray color");
        }

        public void dropDownCurrencyOptions(){

                Select select = new Select(driver.findElement(dropDownCurrency));
                select.selectByVisibleText("U.S. Dollar (USD)");

                if(select.selectByVisibleText("U.S. Dollar (USD)") ){
                        System.out.print("USD is selected as a value");

                }else{

                        System.out.println("Another option is selected");
                }

        }


        public void clickOnContinueBTN(){

                driver.findElement(continueBTN).click();
                System.out.println("You have successfully finished the transaction");

        }

}
