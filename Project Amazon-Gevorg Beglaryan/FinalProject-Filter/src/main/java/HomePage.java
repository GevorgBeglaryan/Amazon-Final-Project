import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

        WebDriver driver;

        public HomePage(WebDriver driver){

            this.driver = driver;

        }

        By searchDropdownList = By.id("searchDropdownBox");

        By heading1 = By.xpath("//form//option[1]");
        By heading2 = By.xpath("//form//option[2]");
        By heading3 = By.xpath("//form//option[3]");
        By heading4 = By.xpath("//form//option[4]");
        By heading5 = By.xpath("//form//option[5]");
        By heading6 = By.xpath("//form//option[6]");
        By heading7 = By.xpath("//form//option[7]");
        By heading8 = By.xpath("//form//option[8]");
        By heading9 = By.xpath("//form//option[9]");
        By heading10 = By.xpath("//form//option[10]");
        By heading11 = By.xpath("//form//option[11]");
        By heading12 = By.xpath("//form//option[12]");
        By heading13 = By.xpath("//form//option[13]");
        By heading14 = By.xpath("//form//option[14]");
        By heading15 = By.xpath("//form//option[15]");
        By heading16 = By.xpath("//form//option[16]");
        By heading17 = By.xpath("//form//option[17]");
        By heading18 = By.xpath("//form//option[18]");
        By heading19= By.xpath("//form//option[19]");
        By heading20 = By.xpath("//form//option[20]");
        By heading21 = By.xpath("//form//option[21]");
        By heading22 = By.xpath("//form//option[22]");
        By heading23 = By.xpath("//form//option[23]");
        By heading24 = By.xpath("//form//option[24]");
        By heading25 = By.xpath("//form//option[25]");
        By heading26 = By.xpath("//form//option[26]");
        By heading27 = By.xpath("//form//option[27]");
        By heading28 = By.xpath("//form//option[28]");





        public void dropdownList(){

            Select searchDropdown = new Select(driver.findElement(searchDropdownList));

        }

        public String getDropDownListNames(){

            String head = driver.findElement(heading1, heading2, heading3, heading4, heading5,
                                             heading6, heading7, heading8,heading9,heading10,heading11,heading12
                                             heading13,heading14,heading15,heading16,heading17,heading18,heading19,
                                             heading20,heading21,heading22,heading23,heading24,heading25,heading26,
                                             heading27,heading28).getText();

            return head;

        }

}
