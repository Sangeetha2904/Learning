package Practice;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launch {
public static void main(String[] args) throws InterruptedException {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the browser name :");
	String browser = sc.nextLine();
	WebDriver driver = null;
	if (browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	else if (browser.equalsIgnoreCase("Edge")) {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
				driver = new EdgeDriver();
				driver.manage().window().maximize();
			}
	else {
		System.out.println("Invalid browser");
	}
	
}
}
