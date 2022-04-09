import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;


public class EndtoEndBuyBook_TC1 {

        public static void main(String...args){

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/books");

            HomePage home = new HomePage(driver);
            BookPage book = new BookPage(driver);
            BuyNowPage buy = new BuyNowPage(driver);
            CreateAccountPage create = new CreateAccountPage(driver);
            SignUpPage signup = new  SignUpPage(driver);
            AccountVerificationPage verify = new AccountVerificationPage(driver);
            ShippingAddressPage shipping = new ShippingAddressPage(driver);
            PaymentMethodPage payment = new PaymentMethodPage(driver);
            CreditorDebitCardPage credit_debit = new CreditorDebitCardPage(driver);
            CardCurrencyPage currency = new CardCurrencyPage(driver);
            ProceedPage proceed = new ProceedPage(driver);



            home.selectSearchFieldDropDown();
            home.searchString("Java Schildt 11 Edition");
            home.clickSearchButton();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            book.getHeading();
            book.clickOnBook();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            buy.getHeading();
            buy.clickOnBuy();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            create.clickOnCreateAccountBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            signup.enterYourName("Gevorg Beglaryan");
            signup.enterNumberOrEmail("gevorg91.beglaryan91@gmail.com");
            signup.enterPassword("Abcdefg");
            signup.reenterPassword("Abcdefg");
            signup.clickContinueBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            verify.hoverOverBTN();
            verify.enterOTPField(229432);
            verify.clickVerifyBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            shipping.selectCountry();
            shipping.fullNameField("Gevorg Beglaryan");
            shipping.streetAddressField("ABC");
            shipping.cityField("Yerevan");
            shipping.zipCodeField(0010);
            shipping.phoneNumberField(098123456);
            shipping.checkMarkField();
            shipping.clickOnAddressBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            payment.hoverOverCreditDebitCardBTN();
            payment.clickCreditDebitCardBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            credit_debit.cardNumberField(5450570002105357);
            credit_debit.NameOnCardField("Gevorg Beglaryan");
            credit_debit.expirationDateMonthField();
            credit_debit.expirationDateYear();
            credit_debit.hoverOverAddYourCard()
            credit_debit.clickOnAddYourCardBTN();

            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            currency.radioButton();
            currency.hoverOver();
            currency.dropDownCurrencyOptions();
            currency.clickOnContinueBTN();


            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

            proceed.hoverOverCheckoutBTN();
            proceed.clickCheckoutBTN();



        }

}
