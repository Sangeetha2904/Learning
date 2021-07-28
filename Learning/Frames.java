package Learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("http://demo.automationtesting.in/Frames.html");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		wd.switchTo().frame("singleframe");
		WebElement textbox = wd.findElement(By.xpath("//input[@type='text'][1]"));
		textbox.sendKeys("Single_Frame");
		wd.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement iframe = wd.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		iframe.click();
		WebElement Pframe = wd.findElement(By.xpath("//*[@id=\"Multiple\"]/iframe"));
		wd.switchTo().frame(Pframe);
		WebElement Cframe = wd.findElement(By.xpath("/html/body/section/div/div/iframe"));
		wd.switchTo().frame(Cframe);
		Thread.sleep(2000);
		WebElement textbox2 = wd.findElement(By.xpath("(//input[@type='text'])"));
		textbox2.sendKeys("iframe Within An iframe");
	}
}
