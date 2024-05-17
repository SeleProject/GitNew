import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
public class SelfIntroduction {

	public static void main(String[] args) {
		
		//Invoking chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		
		//Frirefox
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Emilmariya\\Documents\\geckodriver\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Egde
		//System.setProperty("webdriver.edge.driver","C:\\Users\\Emilmariya\\Documents\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		
		
		
		

	}

}
