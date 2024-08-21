package Selenumproject.Selenumproject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naukriLinks {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.naukri.com/");
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println("Total number of links on the page: " + links.size());
        
        for (WebElement link : links) {
             String href= link.getAttribute("href");
             String linkText= link.getText();

           // Print href and text of each link
           System.out.println("Link: " + href);
           System.out.println("Text: " + linkText);
           System.out.println("---------------");
        }

        // Close the browser
        driver.quit();
    }

		
	}


