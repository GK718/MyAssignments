package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launchbrowserlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("--disable-notifications");
		
		options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(options);
		// launch browser
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		driver.findElement(By.id("username")).sendKeys ("DemoCsr");
		driver.findElement(By.id("password")).sendKeys ("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click ();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click(); 
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys ("XYZ Pvt Ltd");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kaur");
	    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys ("Gkwon@gmail.com");
	    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys ("04998833844");
	    driver.findElement(By.linkText("Create Lead")).click();
	    
	    
	}   
	

}
