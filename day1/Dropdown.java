package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		WebElement ele=driver.findElement(By.className("ui-selectonemenu"));
		Select select=new Select(ele);
		select.selectByVisibleText("Cypress");
		Thread.sleep(5000);
		//driver.close();
		
		
		
		
		
		

	}

}
