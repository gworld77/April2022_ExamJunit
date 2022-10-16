package junit;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class ValidateCheckBoxes {
		
			static WebDriver driver;
			boolean status;
			boolean removeCheckBox;

			@Before
			public void init() {

				System.setProperty("webdriver.chrome.driver", "C:\\Users\\myada\\Selenium\\Final\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.get("https://techfios.com/test/101/");
				driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			}

			@Test
			public void validateToglleCheckBoxe() {

				WebElement allToggleCheckBox = driver.findElement(By.xpath("/html/body/div[3]/input[3]"));
				allToggleCheckBox.click();

				status = allToggleCheckBox.isSelected();

				// confirming what is there in status for learning purpose otherwise no need
				System.out.println("Checking boolean status:" + status);

				// checking condition is true or not.
				if (status) {
					System.out.println("allToggleCheckBox is selected sucessfully at profession.");

				}

				else {
					System.out.println("allToggleCheckBox is not clicked at profession.");
				}

			}

			@Test
			public void validationRemoveSingleList() throws Exception {

				WebElement FinalPractical2964 = driver.findElement(By.xpath("//span[contains (text() , 'FinalPractical2964')]"));
				//the element above has been removed from the website please use different one 
				FinalPractical2964.click();

				WebElement yesButton = driver.findElement(By.xpath("//a[contains (text() , 'Yes')]"));
				yesButton.click();
			}
//				WebElement remove = driver.findElement(By.xpath("//input[@value = 'Remove']"));
//				remove.click();
		//	
				

				
//				removeCheckBox = remove.isSelected(); // validate YES button is selected or not
//				System.out.println("Checking boolean status:" + removeCheckBox); // for understanding peruses if the status is
//																					// true or not
//				if (removeCheckBox) {// if it is true
		//
//					System.out.println("remove checkBox has been selected successfully");
//				} else // if not
		//
//					System.out.println("can not be selected");
		//
//			}

//			@Test
//			public void Validate_that_all_list_item_could_be_removed() throws InterruptedException {
		//
//				WebElement allToglleCheckBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
//				allToglleCheckBox.click();
//				Thread.sleep(2000);
//				WebElement remove = driver.findElement(By.xpath("//input[@type='submit']"));
//				remove.click();
//				status = allToglleCheckBox.isSelected();
//				removeCheckBox = remove.isSelected();
//				System.out.println("Checking boolean status:" + status + removeCheckBox);
		//
//				if (status) {
//					System.out.println("allToglleCheckBox is selected successfully at profession.");
		//
//				} else if (removeCheckBox) {
		//
//					System.out.println("remove checkBox has been selected successfully");
//				} else {
//					System.out.println("allToglleCheckBox is not clicked at profession.");
//					System.out.println("can not be selected");
		//
//				}
		//
//			}

//			@AfterClass
//			public static void teardown() {
//				driver.close();
//				driver.quit();
//			}
	

}


