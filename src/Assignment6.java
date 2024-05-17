import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Emilmariya\\Documents\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String option = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(driver.findElement(By.cssSelector("label[for='benz']")).getText());
		WebElement dropDown = driver.findElement(By.id("dropdown-class-example"));
		Select drop = new Select(dropDown);
		drop.selectByVisibleText(option);
		driver.findElement(By.id("name")).sendKeys(option);
		driver.findElement(By.id("alertbtn")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		String[] msg = alert.split(",");
		String[] word = msg[0].split(" ");
		if (word[1].equalsIgnoreCase(option)) {
			System.out.println("alert msg are correct");
			Assert.assertTrue(true);
		} else {
			System.out.println("alert msg are not correct");
			Assert.assertTrue(false);
		}
		driver.switchTo().alert().accept();
	}

}
