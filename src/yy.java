import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yy {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\my new driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("ss")).click();
		Thread.sleep(3000);
		
		
        driver.findElement(By.id("ss")).sendKeys("Amman"+Keys.ENTER);     

	}

}
