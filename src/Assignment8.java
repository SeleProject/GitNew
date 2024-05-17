import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String country = "India";
		driver.findElement(By.id("autocomplete")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement> select = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));

		System.out.println(select.size());
		for (WebElement place : select) {

			if (place.getText().equalsIgnoreCase(country)) {
				Thread.sleep(3000);
				Actions a = new Actions(driver);
				a.moveToElement(place).build().perform();
				place.click();
				break;
			}
		}

	}

}
