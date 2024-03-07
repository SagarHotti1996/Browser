import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Instantiatetendable {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\sai\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver driver =new ChromeDriver();

driver.get("https://www.tendable.com/");

driver.manage().window().maximize();
{
driver.findElement(By.xpath("//a[text()='Our Story']")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//a[text()='Our Solution']")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//a[text()='Why Tendable']")).click();
Thread.sleep(3000);
}

WebElement requestDemoButton = driver.findElement(By.xpath("//a[contains(text(),'Request a Demo')]"));

driver.findElement(By.xpath("//a[text()='Contact Us']")).click();

driver.findElement(By.xpath("//label[contains(text(),'Marketing')]")).click();

driver.findElement(By.id("inputName")).sendKeys("Roy");
driver.findElement(By.id("inputEmail")).sendKeys("Roy@example.com");
driver.findElement(By.id("inputPhone")).sendKeys("1436478");

driver.findElement(By.cssSelector("button[type='submit']")).click();

WebElement errorMessage = driver.findElement(By.xpath("//span[contains(text(),'Message cannot be empty')]"));

driver.quit();
}
}		
	
