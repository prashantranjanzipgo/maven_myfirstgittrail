package Maven.Maven_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
@Test
public class ZipGo_DashboardLogin {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hi Welcome to ZipGo Dashboard");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\lenovo\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://beta.zipgo.in/sign_in"); //Only local connections are allowed(no www)
		//driver.get("https://www.zipgo.in/");
		//driver.findElement(By.className("auth0-lock-social-button-text")).click();
		driver.findElement(By.xpath("//*[@id='auth0-lock-container-1']/div/div[2]/div/div/div/div[3]/span/div/div/div/div/div/div/div[1]/div[1]/div/div/div[1]/button")).click();
	//	driver.findElement(By.id("//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[1]")).sendKeys("prashant.ranjan@zipgo.in");
	//	driver.findElement(By.id("//*[@id='identifierNext']/content/span")).clear();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@role='presentation']//descendant::input[@id='identifierId']")).sendKeys("prashant.ranjan@zipgo.in");
		driver.findElement(By.xpath("//div[@role='presentation']//descendant::span[@class='RveJvd snByac']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@role='presentation']//descendant::input[@type='password']")).sendKeys("Zipgoaug@123");
		driver.findElement(By.xpath("//div[@role='presentation']//descendant::span[@class='RveJvd snByac']")).click();
	//	Thread.sleep(7000);
		WebElement findmap=driver.findElement(By.xpath("//ul[@class='main-navigation-menu']//descendant::i[@class='clip-map']"));
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf((findmap)));
		//hover 
		Actions bulder = new Actions(driver);
		bulder.moveToElement(findmap).perform();
		/*List<WebElement> findmapList=driver.findElements(By.xpath("//li[@class='open']//descendant::ul[@class='dropdown-menu']/li/a/span[@class='title']"));
		//for(WebElement _object:findmapList) {
			//System.out.println(_object.getText());
			
		}*/
		System.out.println("=======================Autimation Done=====================================");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.quit();

	}
}
