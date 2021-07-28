package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class getAttribute_getText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver driver =  new EdgeDriver();
		driver.get("http://www.adactin.com/HotelApp/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("rakesh");
		Thread.sleep(2000);
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("123456789");
		WebElement text = driver.findElement(By.xpath
				("//p[text() = 'Adactin Launches The Adactin Hotel App! ']"));
		System.out.println("getText :" +text.getText());
		Thread.sleep(2000);
		String attribute = driver.findElement(By.id("username")).getAttribute("value");
		System.out.println("getAttribute is :" +attribute);
		
	}
	}

