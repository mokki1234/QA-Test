import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Driver\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.when2meet.com/");
		// New Event Create 
		driver.findElement(By.id("NewEventName")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("NewEventName")).click();
		driver.findElement(By.id("NewEventName")).sendKeys("When2Meet event");
		// Select Date 
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[9]/div[1]/div[8]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[2]/td[1]/div[1]/div[2]/div[9]/div[2]/div[6]")).click();
		Thread.sleep(3000);
		// Select DropDown 
		Select dropdown= new Select(driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/center[1]/div[2]/select[1]")));
		Thread.sleep(3000);
		dropdown.selectByValue("8");
		Select dropdown2= new Select(driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/center[1]/div[3]/select[1]")));
		Thread.sleep(3000);
		dropdown2.selectByValue("18");
		Thread.sleep(3000);
		// New Users Sign In 
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("name")).sendKeys("Aminul");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(3000);
		// avaliablity For 15 june 
		WebElement sourceElement = driver.findElement(By.id("YouTime1718413200"));
        WebElement targetElement = driver.findElement(By.id("YouTime1718415900"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        Thread.sleep(4000);
     // avaliablity For 20 june 
        WebElement sourceElement1 = driver.findElement(By.id("YouTime1718845200"));
        WebElement targetElement1 = driver.findElement(By.id("YouTime1718847900"));
        Actions actions2 = new Actions(driver);
        actions2.dragAndDrop(sourceElement1, targetElement1).build().perform();
        Thread.sleep(5000);
		driver.quit();

	}

}
