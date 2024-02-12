package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       
        driver.get("https://trytestingthis.netlify.app/");
        WebElement checkbox=driver.findElement(By.id("female"));
        checkbox.click();
        System.out.println(checkbox.isSelected());
        
       WebElement text=driver.findElement(By.xpath("//h1(text()='Your Website to practice Automation Testin"));
        System.out.println("the text on website is dispalyed");
			
        WebElement button=driver.findElement(By.xpath("http://google.com','_blank"));
        System.out.println("verify the botten"+ button.isEnabled());
        driver.close();
        
		}
	}


