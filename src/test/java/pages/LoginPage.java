package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Page Factory Implementation

	private WebDriver driver;

	// Locators/Page elements  using @FindBy annotation
    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(css = "input.btn_action")
    private WebElement loginButton;

 // Constructor to initialize the WebDriver and PageFactory
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    
    // Methods to perform actions on the page
    public void enterUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void enterPassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

}

/*the @FindBy annotation is used to locate the web elements on the page. 
 *the PageFactory.initElements(driver, this) method initializes these elements 
 *when an object of the LoginPage class is created
 *"Page factory for page"https://www.saucedemo.com/""*/
