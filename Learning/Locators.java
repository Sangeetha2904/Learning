package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://id.cisco.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement email = wd.findElement(By.name("username"));
	    email.sendKeys("mailtosangeethahariharan@gmail.com");
	    Thread.sleep(3000);
	    WebElement next = wd.findElement(By.id("idp-discovery-submit"));
	    next.click();
	    Thread.sleep(3000);
	    WebElement pwd = wd.findElement(By.name("password"));
	    pwd.sendKeys("04Dec@92s");
	    Thread.sleep(3000);
	    WebElement login = wd.findElement(By.id("okta-signin-submit"));
	    login.click();
	}

}
