import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Emilmariya");
		driver.findElement(By.name("email")).sendKeys("emilmariya@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234#em789");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement dropdown = driver.findElement(By.id("exampleFormControlSelect1"));
		Select selectDropdown = new Select(dropdown);
		selectDropdown.selectByVisibleText("Female");
		System.out.println(selectDropdown.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("16/12/1996");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
	//System.out.println(driver.findElement(By.cssSelector(".alert-success")).getText());
	

	}

}
