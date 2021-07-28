package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.amazon.in/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		Actions ac = new Actions(wd);
		WebElement mh = wd.findElement(By.id("nav-link-accountList"));
		ac.moveToElement(mh).perform();
		WebElement clickable = wd.findElement(By.xpath("//span[text()='Discover Your Style']"));
		clickable.click();
}
}