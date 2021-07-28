import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButton_Concepts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.demoqa.com/radio-button");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radio = wd.findElement(By.xpath("(//input[contains(@name,'like')])[1]"));
		boolean selected = radio.isSelected();
		JavascriptExecutor js = (JavascriptExecutor) wd;
		js.executeScript("arguments[0].click()", radio);
		Thread.sleep(3000);
		js.executeScript("scroll(0,500)", "");
		if (selected==false) {
			radio.click();
		}
		
		
}
}