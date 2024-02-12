package selenium_basic;

	import java.util.concurrent.TimeUnit;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Auto_mechinetasting {
		
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	       WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.findElement(By.id("name")).sendKeys("Harikrishna");
			driver.findElement(By.id("email")).sendKeys("harikrishna90.marolix@gmail.com");
			driver.findElement(By.id("phone")).sendKeys("9640707190");
			driver.findElement(By.id("textarea")).sendKeys("hyderabad ,ameerpeta");
			
			driver.findElement(By.id("male")).click();
			
						
			driver.findElement( By.id("tuesday")).click();
			Select drpcountry=new Select(driver.findElement(By.id("country")));
			drpcountry.selectByVisibleText("India");
			
			driver.findElement(By.xpath("//option[text()='red']")).click();
			driver.findElement(By.id("datepicker")).sendKeys("02/09/2024");
			driver.close();
			
	   }
	
	}


