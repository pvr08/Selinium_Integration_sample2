package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BasePage {
	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void sendKeys(String locator, String text) {
		WebElement element = driver.findElement(getBy(locator));
		element.sendKeys(text);
	}

	public void selectDropdownByVisibleText(String locator, String visibleText) {
		WebElement dropdownElement = driver.findElement(getBy(locator));
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(visibleText);
	}

	public void click(String locator) {
		WebElement element = driver.findElement(getBy(locator));
		System.out.println("Before clicking" + element.toString());
		element.click();
	}

	public boolean verifyElementPresent(String locator) {

		boolean element = driver.findElement(getBy(locator)).isDisplayed();
		return element;
	}

	private By getBy(String locator) {
		if (locator.startsWith("//")) {
			return By.xpath(locator);
		} else if (locator.startsWith("id=")) {
			String[] split = locator.split("=");
			return By.id(split[1]);
		} else if (locator.startsWith("name=")) {
			String[] split = locator.split("=");
			return By.name(split[1]);
		} else if (locator.startsWith("class=")) {
			String[] split = locator.split("=");
			return By.className(split[1]);
		} else if (locator.startsWith("css=")) {
			String[] split = locator.split("=");
			return By.cssSelector(split[1]);
		} else if (locator.startsWith("link=")) {
			String[] split = locator.split("=");
			return By.linkText(split[1]);
		} else if (locator.startsWith("partialLink=")) {
			String[] split = locator.split("=");
			return By.partialLinkText(split[1]);
		} else {
			// Assuming default is "id"
			return By.xpath(locator);
		}
	}

	public boolean compareText(String locator, String textToCompare) {

		String actualText = driver.findElement(getBy(locator)).getAttribute("textContent");
		Assert.assertEquals(actualText, textToCompare, "Comparing Text");
		if (actualText.equals(textToCompare)) {
			return true;
		} else {
			return false;
		}

	}

	public WebElement findElement(String locator) {

		WebElement element = driver.findElement(getBy(locator));
		return element;
	}

	public void scrollToElement(String locator) throws InterruptedException {

		WebElement element = driver.findElement(getBy(locator));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(2000);
	}

	public void validateElementPresentAssertion(String locator) throws InterruptedException {
		
		Assert.assertEquals(verifyElementPresent(locator), true," Element Present");

	}
	public void switchToIframe() {
        driver.switchTo().frame(0); // Assuming the iframe is the first one on the page
    }
 
    public void backToNormal() {
        driver.switchTo().defaultContent();
    }
	 public static void hoverOverElement(WebDriver driver, String elementXPath) {
	        Actions actions = new Actions(driver);
	        WebElement element = driver.findElement(By.xpath(elementXPath));
	        actions.moveToElement(element).perform();
	    }
	    public void selectlistElement( String visibleText) {
	   	 String optionXPath = String.format("//ul[@class='sub-menu']//a[text()='%s']", visibleText);
	        driver.findElement(By.xpath(optionXPath)).click();
	    }

}
