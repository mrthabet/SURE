package suretask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class OrangeHRMLoginPage {

	private WebDriver driver;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameInput;

	@FindBy(name = "password")
	private WebElement passwordInput;

	@FindBy(css = "button.oxd-button--main")
	private WebElement loginButton;

	public OrangeHRMLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void login(String username, String password) {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust timeout as needed
		wait.until(ExpectedConditions.visibilityOf(usernameInput));
		usernameInput.sendKeys(username);

		wait.until(ExpectedConditions.visibilityOf(passwordInput));
		passwordInput.sendKeys(password);

		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
	}
}
