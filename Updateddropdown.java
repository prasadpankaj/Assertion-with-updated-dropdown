import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\prasa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_StudentDiscount']")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
	//int i=1;
	//while(i<5)
		
		//driver.findElement(By.id("hrefIncAdt")).click();
		//i++;
		
for (int i=1;i<5;i++) 
{
	driver.findElement(By.id("hrefIncAdt")).click();
}
	
	    driver.findElement(By.id("btnclosepaxoption")).click();	
	System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

	}

}
