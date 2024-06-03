package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Krishitha");
		driver.findElement(By.name("lastname")).sendKeys("Karthik");
		driver.findElement(By.name("reg_email__")).sendKeys("njkarthikkn@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Shreyanvi@2022");
		WebElement db=driver.findElement(By.name("birthday_day"));
		Select options=new Select(db);
		options.selectByValue("13");
		WebElement db1=driver.findElement(By.name("birthday_month"));
		Select options1=new Select(db1);
		options1.selectByValue("8");
		WebElement db2=driver.findElement(By.name("birthday_year"));
		Select options2=new Select(db2);
		options2.selectByValue("2006");
		//driver.findElement(By.t("sex")).sendKeys(args)
		
		
		
		
		

	}

}
