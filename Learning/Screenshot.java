package Learning;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Screenshot {

	 public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Driver\\msedgedriver.exe");
		WebDriver wd = new EdgeDriver();
		wd.get("https://www.cisco.com/c/en_in/index.html");
		wd.manage().window().maximize();
		TakesScreenshot ts = (TakesScreenshot)wd;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotAs,new File("C:\\Users\\sangeetha\\eclipse-workspace\\Selenium_Concepts\\Screenshot\\New_Screenshot.png"));
	}
}
