import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		System.out.println("Row size = "+ driver.findElements(By.cssSelector(".table-display tr")).size());
		System.out.println("Cloumn size = "+driver.findElements(By.cssSelector(".table-display tr th")).size());
		System.out.println(driver.findElement(By.cssSelector(".table-display tr:nth-child(3)")).getText());
		
		//
		
		List<WebElement> secondRow = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[3]/td"));
		System.out.println(secondRow.get(0).getText());
		System.out.println(secondRow.get(1).getText());
		System.out.println(secondRow.get(2).getText());
//
//		WebElement table=driver.findElement(By.id("product"));
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//		System.out.println(secondrow.get(0).getText());
//		System.out.println(secondrow.get(1).getText());
//        System.out.println(secondrow.get(2).getText());
	}

}
