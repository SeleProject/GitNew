import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assigment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.name("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("password")).sendKeys("learning");
		driver.findElement(By.xpath("//label[2]/span[2]")).click();
		driver.findElement(By.id("okayBtn")).click();
		WebElement dropDown = driver.findElement(By.cssSelector("select[class='form-control']"));
		Select drop = new Select(dropDown);
		drop.selectByValue("consult");
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();

		// explicit wait

        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='my-4']")));
		System.out.println(driver.findElement(By.cssSelector("h1[class='my-4']")).getText());

		//

		String[] items = { "iphone X", "Samsung Note 8", "Nokia Edge", "Blackberry" };
		List<WebElement> mobilePhoneList = driver.findElements(By.xpath("//div[@class='card h-100']/div/h4/a"));
		for (int i = 0; i < mobilePhoneList.size(); i++) {
			String phone = mobilePhoneList.get(i).getText();
			System.out.println(phone);
			List<String> phoneItems = Arrays.asList(items);
			if (phoneItems.contains(phone)) {

				driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();

			}
		}
		driver.findElement(By.cssSelector("a[class='nav-link btn btn-primary']")).click();

		
	}
	
	///
//	List <WebElement> products = driver.findElements(By.cssSelector(".card-footer .btn-info"));
//
//	for(int i =0;i<products.size();i++)
//
//	{
//
//	products.get(i).click();
//
//	}
//
//	driver.findElement(By.partialLinkText("Checkout")).click();}
//
//
//
//
//
//
//
//	}
	
}
