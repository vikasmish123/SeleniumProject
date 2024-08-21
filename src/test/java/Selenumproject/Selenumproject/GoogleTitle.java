package Selenumproject.Selenumproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTitle {

    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver if not set globally
  

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            // Navigate to Google
            driver.get("https://www.google.com");

            // Navigate to Amazon
            driver.navigate().to("https://www.amazon.in/");

            // Navigate back to Google
            driver.navigate().back();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Current URL after back: " + currentUrl);

            // Navigate forward to Amazon
            driver.navigate().forward();
            String currentUrl1 = driver.getCurrentUrl();
            System.out.println("Current URL after forward: " + currentUrl1);

            // Get and print the title of the Amazon page
            String pageTitle = driver.getTitle();
            System.out.println("Title: " + pageTitle);

            // Validate the title
            String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
            if (pageTitle.equals(expectedTitle)) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }

            // Optionally, pause for observation (not recommended for production code)
            Thread.sleep(2000);

        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
