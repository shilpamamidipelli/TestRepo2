package testngsessions;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleTest extends TestngBaseTest {

	@Test
	public void openGooglePageTest() {
		driver.get("https://google.com");
		String url = driver.getTitle();
		if(url.equals("Google")){
			System.out.println("google page loaded success");
		}
	}
	
	@Test
	public void verifySearch() {
		By searchBox = By.xpath(null);
		driver.findElement(searchBox);
	}
	
	@Test
	public void verifySearch2() {
		By searchBox = By.xpath(null);
		driver.findElement(searchBox);
	}
	
	@Test
	public void verifySearch3() {
		By searchBox = By.xpath(null);
		driver.findElement(searchBox);
	}
}
