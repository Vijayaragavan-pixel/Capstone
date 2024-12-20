package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
//import pageObjects.HomePage;
import pageObjects.LoginPage;

public class LoginSteps {
    private AppiumDriver driver;
  //  private HomePage homePage;
    private LoginPage loginPage;

    public LoginSteps() {
        System.out.println("Initializing LoginSteps...");
        this.driver = Hooks.getDriver();
        if (driver == null) {
            System.out.println("Driver is null in LoginSteps constructor!");
            throw new RuntimeException("Driver is not initialized.");
        }
      //  this.homePage = new HomePage(driver);
        this.loginPage = new LoginPage(driver);
    }

    @Given("User launches OrangeHRM")
    public void orangeHRM() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("User enters {string} in username")
    public void username(String user) {
    	loginPage.username(user);
        //homePage.openMenu();
        //homePage.clickLogin();
    }

    @When("User enters {string} in password")
    public void password(String password) {
        
        loginPage.password(password);
        
    }

    @Then("User clicks login")
    public void loginButton() {
    	loginPage.loginButton();
       // Assert.assertTrue("Login error message should be visible", loginPage.isLoginErrorVisible());
    }
}
