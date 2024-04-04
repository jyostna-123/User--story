package TestNG1.testcase;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class CreateLead {
@Test
	public  void runCreate() {
	//Launch Browser
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		//Get URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Locate user name & enter userName
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		//Locate password& enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click submit button
		driver.findElement(By.className("decorativeSubmit")).click();
		//click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click Leads link
		driver.findElement(By.linkText("Leads")).click();
		//click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Locate & Enter company details
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		//Locate&enter firstName details
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Subraja");
		//locate& enter lastName details
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Subi");
		//locate phone number and enter details
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		//click submit button
		driver.findElement(By.name("submitButton")).click();
		//close 
		driver.close();


	}

}
