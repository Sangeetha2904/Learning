package Learning;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Table {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.javatpoint.com/html-table");
		wd.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println("***ENTIRE TABLE***");
		List<WebElement> Tdata = wd.findElements(By.xpath("//table[@class='alt'][1]//tbody//tr//td"));
		for (WebElement data : Tdata) {
			System.out.println(data.getText());
		}
		System.out.println("\n");
		System.out.println("***PARTICULAR ROW***");
		List<WebElement> Rdata = wd.findElements(By.xpath("//table[@class='alt'][1]//tbody//tr[4]//td"));
		for (WebElement infor : Rdata) {
			System.out.println(infor.getText());
		}
		System.out.println("\n");
		System.out.println("***PARTICULAR COLUMN***");
		List<WebElement> Cdata = wd.findElements(By.xpath("//table[@class='alt'][1]//tbody//tr[5]//td[2]"));
		for (WebElement infor1 : Cdata) {
			System.out.println(infor1.getText());
		}
	}
}
