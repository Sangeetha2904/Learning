package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task_ScrollUp_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.shopclues.com/weight-gainers.html?sort_by=bestsellers&sort_order=desc");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) wd;
		WebElement fame = wd.findElement(By.xpath("//a[text()='Wall of Fame']"));
		js.executeScript("arguments[0].scrollIntoView();",fame);
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -3000)");
		
}
}