package Selenumproject.Selenumproject;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstseleniumprogram {

	public static void main(String[] args) {
	 ChromeDriver driver=new ChromeDriver();
	 driver.get("https://demo.opencart.com/");
	String act_title= driver.getTitle();
	 if (act_title.equals("Your Store")) {
		 
		 System.out.println("Test case Passed");
	 }
	 else 
	 {
		 System.out.println("Test case failed"); 
	 }
	 
	 //driver.close();
	}

}
