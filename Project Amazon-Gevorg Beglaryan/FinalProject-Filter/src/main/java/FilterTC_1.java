import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;



public class FilterTC_1 {

    public static void main(String...args){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        HomePage home = new HomePage(driver);
        DropDownListPage dropdown = new DropDownListPage(driver);
        DashboardPage dashboard = new DashboardPage(driver);


        home.dropdownList();
        home.getDropDownListNames();


        dropdown.select();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        System.out.println("The heading is " + dashboard.getHeading() );

        driver.quit();



    }

}
