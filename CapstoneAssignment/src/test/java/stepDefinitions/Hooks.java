
	package stepDefinitions;

	import io.appium.java_client.AppiumDriver;
	import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.Before;
	import io.cucumber.java.After;
	import org.openqa.selenium.remote.DesiredCapabilities;

	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	public class Hooks {
	    private static AppiumDriver driver;

		@Before
	    public void setUp() {
	        System.out.println("Setting up Appium driver...");
	        if (driver == null) {
	            try {
	            	DesiredCapabilities cap = new DesiredCapabilities();
	                cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	                cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
	                cap.setCapability(MobileCapabilityType.APP, "C:/Users/vijayaraghavanj/Documents/Mobile Auto/com.ulsumobile.calculator-1.1.apk");
	                cap.setCapability("browserName", "Chrome");
	                cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");

	                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), cap);
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                System.out.println("Appium driver initialized successfully.");
	            } catch (Exception e) {
	                e.printStackTrace();
	                throw new RuntimeException("Failed to initialize Appium driver.");
	            }
	        }
	    }

	    @After
	    public void tearDown() {
	        System.out.println("Tearing down Appium driver...");
	        if (driver != null) {
	            driver.quit();
	            driver = null; // Ensure driver is reset between tests
	            System.out.println("Appium driver quit successfully.");
	        }
	    }

	    public static AppiumDriver getDriver() {
	        System.out.println("Returning Appium driver instance...");
	        return driver;
	    }
	}


