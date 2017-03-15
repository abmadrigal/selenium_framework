package automationFramework;

import org.openqa.selenium.WebDriver;
import java.io.IOException;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws IOException, Exception {
		// TODO Auto-generated method stub
		// Create a new instance of the Chrome driver
				String exePath = "C:\\\\Users\\amadrigal\\workspace\\chromedriver\\chromedriver.exe";
				System.setProperty("webdriver.chrome.driver", exePath);
				WebDriver driver =new ChromeDriver();
				
		        //Launch the Online Store Website
				driver.get("http://dtc01-d-pw01:8001/investingEntities/#/auth/amadrigal&Abraham_Madrigal&1");
		 //http://ie-uat.cambridgeassociates.com:8001/investingEntities/#/portfolio/0001/entity/1/holdings/unlinked?reportingEntity=1934%20Owego%20Family%20Trusts%20-%20AMO
						
		        //AUtoIT
				//Runtime.getRuntime().exec("C:\\Users\\amadrigal\\workspace\\AutoIT\\LoginOKTA.exe");
				
				// Print a Log In message to the screen
				
		        System.out.println("Successfully opened the website www.Store.Demoqa.com");
		 
				//Wait for 5 Sec
				Thread.sleep(5000);
				
		        // Close the driver
		        driver.quit();
		
	}

}
