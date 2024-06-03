package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("radhakrishnan@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Sparrow@123");
		driver.findElement(By.name("Login")).click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Login")) {
			System.out.println("Login Successfully");
		}
		else
		{
			System.out.println("Login not successfully");
		}
		//Thread.sleep(3000);
		
		driver.close();
		

	}

}
