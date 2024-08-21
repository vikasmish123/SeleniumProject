package Selenumproject.Selenumproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class orangeHrmLoginandLogout {

	public static void main(String[] args) {
	
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[text()=' Login ']")).click();
        driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name' and text()='Srinivas Glass']")).click();
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("Logout successful");
        driver.quit();
        

        
		
        
	}

}
