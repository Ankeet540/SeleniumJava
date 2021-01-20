import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Asus\\workspace\\Maven\\Driver\\geckodriver.exe");
		
		driver.get("https://www.gmail.com");
	}

}
