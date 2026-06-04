package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeadTest {

	WebDriver driver;

	@Test
	public void createLeadTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Lead created");
		driver.quit();
	}

	@Test
	public void modifyLeadTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Lead modified");
		driver.quit();
	}

	@Test
	public void deleteLeadTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("Lead deleted");
		driver.quit();
	}
}
