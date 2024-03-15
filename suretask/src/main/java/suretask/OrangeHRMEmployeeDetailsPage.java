package suretask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMEmployeeDetailsPage {
	 private WebDriver driver;

	    @FindBy(id = "btnSave")
	    private WebElement saveButton;

	    @FindBy(id = "contact_street1")
	    private WebElement street1Input;

	    @FindBy(id = "contact_street2")
	    private WebElement street2Input;

	    public OrangeHRMEmployeeDetailsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void fillContactDetails(String street1, String street2) {
	        street1Input.sendKeys(street1);
	        street2Input.sendKeys(street2);
	        saveButton.click();
	    }
}
