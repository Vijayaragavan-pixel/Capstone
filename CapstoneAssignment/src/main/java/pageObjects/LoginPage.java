
	package pageObjects;

	import io.appium.java_client.AppiumDriver;
	import org.openqa.selenium.By;

	public class LoginPage extends BasePage {
	    private By usernameField = By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[3]/android.widget.EditText");
	    private By passwordField = By.xpath("//android.view.View[@resource-id=\"app\"]/android.view.View/android.view.View/android.view.View[3]/android.view.View[6]/android.widget.EditText");
	    private By loginButton = By.xpath("//android.widget.Button[@text=\"Login\"]");

	    public LoginPage(AppiumDriver driver) {	
	        super(driver);
	    }

	    public void username(String user) {
	        driver.findElement(usernameField).sendKeys(user);
	    }

	    public void password(String password) {
	        driver.findElement(passwordField).sendKeys(password);
	    }

	    public void loginButton() {
	        driver.findElement(loginButton).click();
	    }

//	    public boolean isLoginErrorVisible() {
//	        return driver.findElement(By.id("login-error-message")).isDisplayed();
//	    }
	}


