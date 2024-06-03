package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaftapAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Indhu1");
		driver.findElement(By.tagName("textarea")).sendKeys("Selenium Automation Tester");
		WebElement db=driver.findElement(By.name("industryEnumId"));
		Select options=new Select(db);
		options.selectByVisibleText("Computer Software");
		//Select select=new Select(db);
		//select.selectByVisibleText("ComputerSoftware");
		WebElement db1=driver.findElement(By.name("ownershipEnumId"));
		Select options1=new Select(db1);
		options1.selectByVisibleText("S-Corporation");
		WebElement db2=driver.findElement(By.name("dataSourceId"));
		Select options2=new Select(db2);
		options2.selectByValue("LEAD_EMPLOYEE");
		WebElement db3=driver.findElement(By.name("marketingCampaignId"));
		Select options3=new Select(db3);
		options3.selectByIndex(6);
		WebElement db4=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options4=new Select(db4);
		options4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();

	}

}
