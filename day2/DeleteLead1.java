package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead1{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement ( By.xpath ( "//input[@name='phoneCountryCode']" ) ).clear ( );
		driver.findElement ( By.xpath ( "//input[@name='phoneCountryCode']" ) ).sendKeys ( "1" );
		driver.findElement ( By.xpath ( "//input[@name='phoneAreaCode']" ) ).clear ( );
		driver.findElement ( By.xpath ( "//input[@name='phoneAreaCode']" ) ).sendKeys ( "978" );
		driver.findElement ( By.xpath ( "//input[@name='phoneNumber']" ) ).clear ( );
		driver.findElement(By.xpath(" (//label[contains(text(),'Phone Number:')]/parent::div)[4]//input[@name='phoneNumber']")).sendKeys("9539832");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads') and @type='button']")).click();
		Thread.sleep ( 2000 );
		//Capture lead ID of First Resulting lead
		WebElement obj = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String obj1 = obj.getText();
		System.out.println("First lead id is "+obj1);
		obj.click();
		driver.findElement(By.xpath("//a[contains(text(),'Delete')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Lead ID:')]/following-sibling::div/input")).sendKeys(obj1);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads') and @type='button']")).click();
		Thread.sleep ( 2000 );
		WebElement obje=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
		String obj2=obje.getText();
		System.out.println("Result is " +obj2 );
		driver.close();


		

		

	}

}
