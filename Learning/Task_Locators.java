package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.irctc.co.in/nget/train-search");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement ok = wd.findElement(By.xpath("//button[@type='submit']"));
		ok.click();
		WebElement from = wd.findElement(By.xpath("//input[@type='text']"));
		from.sendKeys("MS");
		WebElement stn = wd.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']"));
		stn.click();
		}
}