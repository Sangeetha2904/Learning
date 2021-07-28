package Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd_Task {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> all = wd.findElements(By.xpath("//option[@value='India']"));
		for (int i = 0; i <= all.size(); i++) {
			if (all.get(i).getText().contains("India")) {
				all.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		WebElement option = wd.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
		Select s = new Select(option);
		s.selectByIndex(2);
		s.selectByVisibleText("Indiana");
}
}