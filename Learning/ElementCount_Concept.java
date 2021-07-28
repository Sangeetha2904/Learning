package Learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ElementCount_Concept {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("http://practice.automationtesting.in/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		int count = wd.findElements(By.xpath("//div[@id='n2-ss-6']/div[@class='n2-ss-slider-1 n2-grab']")).size();
		System.out.println(count);
		
		
		
}
}