package suretask;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMAutomation {


    private WebDriver driver;

    @BeforeTest
    public void setup() {
    	WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testOrangeHRM() throws IOException {
        OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage(driver);
        loginPage.login("Admin", "admin123");

       // OrangeHRMEmployeeDetailsPage employeeDetailsPage = new OrangeHRMEmployeeDetailsPage(driver);
       // employeeDetailsPage.fillContactDetails("Street 1", "Street 2");

        OrangeHRMJobDetailsPage jobDetailsPage = new OrangeHRMJobDetailsPage(driver);
        jobDetailsPage.fillJobDetails();
    }

 
   // @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
