package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("http://demo.automationtesting.in/Alerts.html");
		wd.manage().window().maximize();
		Thread.sleep(3000);
		WebElement simple = wd.findElement(By.xpath("//a[text()='Alert with OK ']"));
		simple.click();
		Thread.sleep(3000);
		WebElement simple2 = wd.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple2.click();
		Thread.sleep(3000);
		wd.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement confirm = wd.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		confirm.click();
		Thread.sleep(3000);
		WebElement confirm2 = wd.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		confirm2.click();
		Thread.sleep(3000);
		wd.switchTo().alert().dismiss();
		Thread.sleep(2000);
		WebElement prompt = wd.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		prompt.click();
		Thread.sleep(3000);
		WebElement prompt2 = wd.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prompt2.click();
		Thread.sleep(3000);
		wd.switchTo().alert().sendKeys("New User");
		wd.switchTo().alert().accept();
	}
}