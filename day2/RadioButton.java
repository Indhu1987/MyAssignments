package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		WebElement RadioB=driver.findElement(By.xpath("//label[.='Bengaluru']"));
		if(RadioB.isSelected())
		{
			RadioB.click();
			System.out.println(RadioB.isSelected());
		}
		
		

	}

}
