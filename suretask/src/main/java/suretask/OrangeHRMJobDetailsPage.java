package suretask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMJobDetailsPage {
	  private WebDriver driver;

	    @FindBy(id = "joinedDate")
	    private WebElement joinedDateInput;

	    @FindBy(id = "jobTitle")
	    private WebElement jobTitleInput;

	    @FindBy(xpath = "//ul[@id='jobTitle_listbox']/li[1]")
	    private WebElement softwareEngineerOption;

	    @FindBy(id = "empStatus")
	    private WebElement employmentStatusInput;

	    @FindBy(xpath = "//ul[@id='empStatus_listbox']/li[1]")
	    private WebElement partTimeInternshipOption;

	    public OrangeHRMJobDetailsPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void fillJobDetails() {
	        joinedDateInput.sendKeys("15-06-2015");
	        jobTitleInput.sendKeys("Software Engineer");
	        softwareEngineerOption.click();
	        employmentStatusInput.sendKeys("Part-Time internship");
	        partTimeInternshipOption.click();
	    }
}
