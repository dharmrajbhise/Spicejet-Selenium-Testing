package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropdown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		//maximize the screen size
		driver.manage().window().maximize();
		
		driver.get("https://spicejet.com");
		
		//click on box to select city
		driver.findElement(By.xpath("//div[contains(text(),'From')]")).click();
		
		//click on city to select
		driver.findElement(By.xpath("//div[contains(text(),'Ajmer')]")).click();
		
		Thread.sleep(5000); //page load hone tak rukna padega
		
		//select destination chennai
		driver.findElement(By.xpath("//div[contains(text(),'Chennai International Airport')]")).click();
		
		//select date 25th may
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-May-2023'] //div[contains(text(),'25')]")).click();
		
		//click on return date
		driver.findElement(By.xpath("//div[@data-testid='return-date-dropdown-label-test-id']")).click();
		
		//select date 6th june
		driver.findElement(By.xpath("//div[@data-testid='undefined-month-June-2023'] //div[@data-testid='undefined-calendar-day-6'] //div[contains(text(),'6')]")).click();
		
		//click on passengers
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		//select 6 adults
		for(int i=0;i<5;i++) {
			
		driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		
//		driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
		
		}
		
		//selects 3 childrens
		for(int i=0;i<3;i++) {
			
			driver.findElement(By.xpath("//div[@data-testid='Children-testID-plus-one-cta']")).click();
		}
		
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers']")).click();
		
		//Click on currency
		driver.findElement(By.xpath("//div[contains(text(),'Currency')]")).click();
		
		//select currency
		driver.findElement(By.xpath("//div[contains(text(),'USD')]")).click();
		
		//click on first checkbox
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		
		//get the names of checkboxes
		List<WebElement> options = driver.findElements(By.cssSelector("div[class*='r-n6v787 r-1ozqkpa']"));
		
		for(WebElement option : options) {
			
			System.out.println(option.getText());
		}
		
		//click on Search flights
		driver.findElement(By.xpath("//div[@data-testid='home-page-flight-cta']")).click();
		
	}

}
