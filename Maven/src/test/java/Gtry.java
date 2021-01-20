import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gtry {public static void main(String[] args) throws InterruptedException {
	
	
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Asus\\workspace\\Maven\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.gmail.com");
	
	//Send email address
	
	driver.findElement(By.id("identifierId")).sendKeys("kumarankeet540");
        driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/div[2]")).click();
   
        // Send Password
        
       // driver.findElement(By.name("password")).sendKeys("test")0;
        driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/div[2]")).click();
        
        
      //send password
    	WebElement passwordButton = driver.findElement(By.xpath("//input[@name='thedesire.540']"));
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(passwordButton));
    	passwordButton.sendKeys("Password for Email");
    	driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
    	
    	//Click on compose button
    	driver.findElement(By.xpath("//div[text()='Compose']")).click();
    	
    //Enter the sender mail id
    	driver.findElement(By.xpath("//textarea[@name='to']")).sendKeys("kumarankeet540");
    //Enter subject to the mail
    	driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Selenium script");
    	driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf']")).sendKeys("Selenium script to send mail");
    	
    //Attach the full path of file
    driver.findElement(By.xpath("//input[@name='Filedata']")).sendKeys("C:\\Users\\Asus\\Desktop\\ccna.txt");
    driver.findElement(By.xpath("//div[text()='Send']")).click();
        
    	
	
	
}
}


