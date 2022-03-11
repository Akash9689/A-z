package testBrowserSetup;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","F:\\Java Classes\\Webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public static WebDriver openFirefoxBrowser() {
		System.setProperty("webdriver.gecko.driver","F:\\Java Classes\\Webdrivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
}
