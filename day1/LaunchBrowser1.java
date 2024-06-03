package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("Email address or phone number")).sendKeys("njkarthikkn.gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Indhu@123");
		driver.findElement(By.className("login")).click();
		Thread.sleep(6000);
		//String title=driver.getTitle();
		//System.out.println(title);
		//if(title.contains("Login")) {
			//System.out.println("Login Successfully");
		//}
		//else
		//{
			//System.out.println("Login not successfully");
		//}
		//Thread.sleep(3000);
		
		

	}

}
