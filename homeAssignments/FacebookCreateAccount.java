package homeAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		//Thread.sleep(1000);
		
		WebElement createaccount=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createaccount.click();
		
		//driver.findElement(By.name("firstname")).sendKeys("Yalini");
		//driver.findElement(By.id("u_n_a_WH")).sendKeys("Jeevarathinam");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yalini");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jeevarathinam");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("919862500125");
		driver.findElement(By.id("password_step_input")).sendKeys("A12345678*");
		
		WebElement date = driver.findElement(By.id("day"));
		Select sourceD1 = new Select(date);
		sourceD1.selectByIndex(5);
		
		WebElement mon = driver.findElement(By.id("month"));
		Select sourceD2 = new Select(mon);
		sourceD2.selectByVisibleText("Aug");
		
		WebElement yr = driver.findElement(By.id("year"));
		Select sourceD3 = new Select(yr);
		sourceD3.selectByValue("2000");
		

		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='1']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
	} 	

}
