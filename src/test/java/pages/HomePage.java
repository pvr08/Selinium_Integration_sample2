package pages;

import org.openqa.selenium.WebDriver;

import StepDefinitions.SetupClass;
import io.cucumber.java.en.And;
import utilities.BasePage;
import utilities.TestUtils;

public class HomePage {

	
	String projectPath = System.getProperty("user.dir");
	String propertyFile = projectPath + "/project.properties";
	TestUtils utils = new TestUtils(propertyFile);
	
	private WebDriver driver;
    private BasePage basePage;

    public HomePage() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }
    
//    @And("validate api")
//    public void validate_api() {
//		System.out.println("Rest assured started");
//		
//    }
}
