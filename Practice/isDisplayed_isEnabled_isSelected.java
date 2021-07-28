package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class isDisplayed_isEnabled_isSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		boolean logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		if (logo==true) {
			System.out.println("Logo is present");
		}
		else {
			System.out.println("Logo is not avaiable");
		}
		boolean email = driver.findElement(By.id("email")).isEnabled();
		if (email==true) {
			System.out.println("email textbox is enabled");
		}
		else {
			System.out.println("email is disabled");
		}
		driver.navigate().to("https://www.demoqa.com/radio-button");
		Thread.sleep(2000);
		boolean radio = driver.findElement(By.xpath("(//input[contains(@name,'like')])[1]")).isSelected();
		if (radio==true) {
			System.out.println("Radio button is enabled");
		}
		else {
			System.out.println("Radio button is not enabled");
		}
	
}
}




