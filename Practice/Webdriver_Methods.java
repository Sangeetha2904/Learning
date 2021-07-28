package Practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	Dimension d = new Dimension(1000, 1000);
	driver.manage().window().setSize(d);
	//Thread.sleep(3000);
	Point p = new Point(200, -50);
	driver.manage().window().setPosition(p);
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println("Title:"+ title);
	String currentUrl = driver.getCurrentUrl();
	System.out.println("Url:" +currentUrl);
	driver.manage().deleteAllCookies();
	//String pg = driver.getPageSource();
	//System.out.println("Pg Src:" +pg);
	String main = driver.getWindowHandle();
	driver.findElement(By.id("windowButton")).click();
	driver.findElement(By.id("messageWindowButton")).click();
	System.out.println("Main window is :" +main);
	Set<String> child = driver.getWindowHandles();
	System.out.println("Child window is" +child);
	Iterator<String> it = child.iterator();
	while (it.hasNext()) {
		String child2 = it.next();
		if (main.equalsIgnoreCase(child2)) {
			driver.switchTo().window(child2);			
		}
		
	}
}
}
