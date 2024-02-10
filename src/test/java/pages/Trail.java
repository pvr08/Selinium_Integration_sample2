package pages;
import static io.restassured.RestAssured.given;

import org.openqa.selenium.WebDriver;

import StepDefinitions.SetupClass;
import io.cucumber.java.en.And;
import utilities.BasePage;
import utilities.TestUtils;

public class Trail {
	
	private WebDriver driver;
    private BasePage basePage;

    public Trail() {
        this.driver = SetupClass.getDriver();
        this.basePage = SetupClass.getBasePage();
    }
    @And("validate api")
    public void sample() {
        // Define the base URI
    	
    	String projectPath = System.getProperty("user.dir");
        String propertyFile = projectPath + "/project.properties";
        TestUtils utils = new TestUtils(propertyFile);
        String baseUri = utils.getProperty("BaseURI");

        String username = utils.getProperty("Username");
        String password = utils.getProperty("Password");

        String credentials = org.apache.commons.codec.binary.Base64.encodeBase64String((username + ":" + password).getBytes());

        given()
            .baseUri(baseUri)
            .header("Authorization", "Basic " + credentials)
            .header("Accept", "application/json")
        .when()
            .get("issue/KAN-1")
        .then()
            .log().all()
            .assertThat().statusCode(200);
    }
}
