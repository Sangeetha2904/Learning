package Learning;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concepts {
	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.google.com/");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement gmail = wd.findElement(By.xpath("//a[text()='Gmail']"));
		Actions ac = new Actions(wd);
		ac.contextClick(gmail).build().perform();
		
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_END);	
	}
}