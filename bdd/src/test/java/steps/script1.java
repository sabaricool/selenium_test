package steps;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class script1 {
	
    WebDriver d1;
	@Given("open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions

		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabari.c\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
	    d1=new ChromeDriver();
	    d1.get("https://ksrtc.in/oprs-web/login/show.do");
	    d1.manage().window().maximize();
	    
	    System.out.println("Given done");
	}

	@When("enter username , password and click login button")
	public void enter_username_password_and_click_login_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		 d1.findElement(By.id("userName")).sendKeys("sabari");
		 d1.findElement(By.name("password")).sendKeys("12345");
		 d1.findElement(By.id("submitBtn")).click();
		 
		 TakesScreenshot tk1=(TakesScreenshot) d1;
		 File source=tk1.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\sabari.c\\OneDrive - HCL Technologies Ltd\\Desktop\\smart\\login_page.png");
	     FileHandler.copy(source, destination);	
		 
		 System.out.println("When done");
	}

	@Then("success in login")
	public void success_in_login() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("Then done");
	}
	
	@Given("Open chrome browser and url of the application1")
	public void open_chrome_browser_and_url_of_the_application1() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabari.c\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
	    d1=new ChromeDriver();
	    d1.get("https://ksrtc.in/oprs-web/user/add.do");
	    d1.manage().window().maximize();
		
		System.out.println("Given done");
	   
	}

	@When("Enter Email , fullname , mobilenumber and click on add button")
	public void enter_Email_fullname_mobilenumber_and_click_on_add_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		 d1.findElement(By.id("email")).sendKeys("sabari0199@gmail.com");
		 d1.findElement(By.name("fullName")).sendKeys("sabari");
		 d1.findElement(By.id("mobileNo")).sendKeys("6379811055");
		 Thread.sleep(3000);
		 d1.findElement(By.name("SaveBtn")).click();
		 
		 TakesScreenshot tk1=(TakesScreenshot) d1;
	     File source=tk1.getScreenshotAs(OutputType.FILE);
		 File destination=new File("C:\\Users\\sabari.c\\OneDrive - HCL Technologies Ltd\\Desktop\\smart\\reg_page.png");
	     FileHandler.copy(source, destination);	
		
		System.out.println("When done");
	}

	@Then("Success in add")
	public void success_in_add() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then done");
	}

	@Given("Open chrome browser and url of the application2")
	public void open_chrome_browser_and_url_of_the_application2() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sabari.c\\Downloads\\"
				+ "chromedriver_win32\\chromedriver.exe");
	    d1=new ChromeDriver();
	    d1.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	    d1.manage().window().maximize();
		
		System.out.println("Given done");
	}

	@When("Enter From , to , departure , return1 and click on search button")
	public void enter_From_to_departure_return1_and_click_on_search_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		
		 JavascriptExecutor jse = (JavascriptExecutor) d1;
		    jse.executeScript("scroll(0,750)");

		    d1.findElement(By.id("fromPlaceName")).sendKeys("beng");
		    Thread.sleep(1500);
		    List<WebElement> element1 = d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		    for(WebElement ele1:element1) {
		    if(ele1.getText().equalsIgnoreCase("BENGALURU")){
		    ele1.click();
		    break;
		    }
		    }
		    d1.findElement(By.name("toPlaceName")).sendKeys("hyd");
		    Thread.sleep(1500);
		    List<WebElement> element2 =d1.findElements(By.xpath("//*[@id=\"ui-id-2\"]/li"));
		    for(WebElement ele2:element2) {
		    if(ele2.getText().equalsIgnoreCase("HYDERABAD")){
		    ele2.click();
		    break;
		    }
		    }

		    jse.executeScript("document.getElementById('txtJourneyDate').value='17/01/2022'");
		    jse.executeScript("document.getElementById('txtReturnJourneyDate').value='20/01/2022'");
		    d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		    Thread.sleep(1000);
		    jse.executeScript("scroll(0,1000)");
		    
		    TakesScreenshot tk1=(TakesScreenshot) d1;
		    File source=tk1.getScreenshotAs(OutputType.FILE);
		    File destination=new File("C:\\Users\\sabari.c\\OneDrive - HCL Technologies Ltd\\Desktop\\smart\\booking_page.png");
	        FileHandler.copy(source, destination);	
		
		System.out.println("When done");
	}

	@Then("Success in search")
	public void success_in_search() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then done");
	}

}
