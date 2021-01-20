import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


	
	public class Go {

		WebDriver driver = null;
		
		@BeforeTest
		public void setUpTest() {
		//String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\workspace\\Maven\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

	

	}
		@Test
		public void googleSearch() {
			
			//goto google.com
			driver.get("https://www.google.com/");
			
		//enter text in search box
			driver.findElement(By.name("q")).sendKeys("Automation Testing");
			
			//click on search button
			driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
			
			
		}
		
		@AfterTest
		public void tearDownTest(){
			
			//close browser
			driver.close();
			driver.quit();
			System.out.println("Test is Completed");
		}

}
