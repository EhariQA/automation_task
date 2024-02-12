package selenium_basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		   WebDriver driver= new ChromeDriver();
		   driver.get("https://www.youtube.com/watch?v=rrXvdEMHVXc&list=RDrrXvdEMHVXc&start_radio=1");
		   driver.findElement(By.linkText("https://youtu.be/rrXvdEMHVXc?list=RDrrXvdEMHVXc"));
		   driver.findElements(By.xpath("https://youtu.be/rrXvdEMHVXc?list=RDrrXvdEMHVXc"));
		   Thread.sleep(3000);
		   driver.close();
		  // driver.getClass("https://www.youtube.com/watch?v=FJANaaSboZU");//
		   //driver.getCurrentUrl();
		
		

	}

}
