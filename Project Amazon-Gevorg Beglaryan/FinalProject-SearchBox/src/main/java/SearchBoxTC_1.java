import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SearchBoxTC_1 {


    public static void main(String...args){

        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");


        HomePage home = new HomePage(driver);
        DashboardPage dashboard = new DashboardPage(driver);

        home.searchString("Java Schildt");

        System.out.println("The heading is " + dashboard.getHeading() );

        driver.quit();

    }

}
