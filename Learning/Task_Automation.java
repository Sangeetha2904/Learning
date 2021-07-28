package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_Automation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://ultimateqa.com/sample-application-lifecycle-sprint-1/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("user");
		Thread.sleep(3000);
		WebElement submit = driver.findElement(By.id("submitForm"));
		submit.click();
		Thread.sleep(3000);
		WebElement difference = driver.findElement(By.xpath("//a[contains(text(),'difference ')]"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", difference);
		Thread.sleep(3000);
		difference.click();
		
}
}
