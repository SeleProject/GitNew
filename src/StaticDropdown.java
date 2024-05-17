import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class StaticDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//select from drop down
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(2000);
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		dropdown.selectByValue("INR");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		//updated drop down code
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i = 1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		//Dynamic drop down code
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		 //Current date selection
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		//checkbox code
		//assertion
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		            //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		           //System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		   //to know the count of the checkbox
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
       
		
		//Autosuggestive code
				driver.findElement(By.id("autosuggest")).sendKeys("ind");
				Thread.sleep(3000);
				List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
				
				for(WebElement option:options)
				{
					if(option.getText().equalsIgnoreCase("India"))
					{
				    option.click();
					break;
					}
				}
				
		//Enabled or disabled
				System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
				//driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
				/////
				
				
				
				
				//Another way to check the element enabled or disabled
				//graping the attribute from the webemelemt
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
				{
					System.out.println("it is enabled");
					Assert.assertTrue(true);
				}
				else
				{
					System.out.println("it is disabled");
					Assert.assertTrue(false);
				}
				
				
				
		
	}

}
