import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//to get the count of the links on page
		System.out.println(driver.findElements(By.tagName("a")).size());	
		
		//limiting the webdriver scope
		//only the footer part link is to be taken
		WebElement footDriver = driver.findElement(By.id("gf-BIG"));
		System.out.println(footDriver.findElements(By.tagName("a")).size());
		
		//links from a cloumn of the footer section
		WebElement coloumDriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumDriver.findElements(By.tagName("a")).size());
		
		
		//click on each link and checking wheather each link is opening or not
		int count = coloumDriver.findElements(By.tagName("a")).size();
		for(int i =1;i<count;i++) 
		{
			String clickOnClickTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			coloumDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnClickTab);
		}
		
		//iterate each tab and grab the title from each page
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		
		}

}
