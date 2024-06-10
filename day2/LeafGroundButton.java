package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.graphbuilder.curve.Point;

public class LeafGroundButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		boolean isenabled=driver.findElement(By.xpath("//button[contains(@class,'ui-state-disabled')]")).isEnabled();
		System.out.println(isenabled);
		WebElement position=driver.findElement(By.xpath("//span[text()='Submit']"));
		Point location=(Point) position.getLocation();
		System.out.println("Location of the the button is"+location);
		WebElement button=driver.findElement(By.xpath("//span[text()='Save']"));
		String color=button.getCssValue("color");
		System.out.println("The save button color is"+color);
		WebElement button1 = driver.findElement(By.xpath("//h5[.='Find the height and width of this button']/following::button[1]"));
		Dimension dimension = button1.getSize();

		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println("Button Height: " + height);
		System.out.println("Button Width: " + width);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		

	}

}
