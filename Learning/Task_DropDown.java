package Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Task_DropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://demoqa.com/automation-practice-form");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement dd = wd.findElement(By.xpath("//div[contains(@ng-click, 'showOverlay()')]"));
		dd.click();
		List<WebElement> li = wd.findElements(By.xpath("//ul[contains(@class,'header-search-bar-dropdown__list')]//li//a//label"));
		for (int i = 0; i < li.size(); i++) {
			if (li.get(i).getText().contains("Video")) {
				li.get(i).click();
				break;
				
			}
			
		}
}
}