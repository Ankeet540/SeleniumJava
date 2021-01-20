import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G2 {
	
	public static void main(String[] args) {
		// Create a new instance of the Firefox driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\workspace\\Maven\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		//  Wait For Page To Load
		// Put a Implicit wait, this means that any search for elements on the page
		//could take the time the implicit wait is set for before throwing exception 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Navigate to URL
		driver.get("https://mail.google.com/");
		// Maximize the window.
		driver.manage().window().maximize();
		// Enter UserName
		
		driver.findElement(By.id("identifierId")).sendKeys("cu.16bcs1345");
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
       
		
		// Enter Password
        
        driver.findElement(By.name("password")).sendKeys("thedesire.540");
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
        
        
        
		
		//Close the browser.
		driver.close();
		}
		}










