package selenium_basic;

public class Locators_Demo
 {
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

        public static void main(String[]args)
        {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	        driver.get("https://trytestingthis.netlify.app/");
	        
	        driver.findElement(By.id("fname")).sendKeys("hari");
	        
	        driver.findElement(By.id("lname")).sendKeys("bhanu");
	        Thread.sleep(3000);
		
	    }
   }
}



