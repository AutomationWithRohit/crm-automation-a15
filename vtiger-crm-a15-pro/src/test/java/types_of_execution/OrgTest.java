package types_of_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrgTest {

	WebDriver driver;

	@Test
	public void createOrgTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("org created");
		driver.quit();
	}

	@Test
	public void modifyOrgTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("org modified");
		driver.quit();
	}

	@Test
	public void deleteOrgTest() throws InterruptedException {
		driver = new ChromeDriver();
		Thread.sleep(2000);
		System.out.println("org deleted");
		driver.quit();
	}
}
