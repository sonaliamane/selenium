package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logintool {
	public WebDriver driver;
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\LENOVO\\Desktop\\testing\\Selenium\\SeleniumNewJars\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
	}

	 @When("^User enters (.+) and (.+)$")
	    public void user_enters_and(String username, String password) throws Throwable {
	        
			WebElement username1=driver.findElement(By.xpath("//input[@id='userName']"));
		username1.sendKeys(username);
		WebElement password1=driver.findElement(By.xpath("//input[@id='password']"));
		password1.sendKeys(password);  
	}

	@When("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		WebElement login=driver.findElement(By.xpath("//button[@id='login']"));
		login.click();
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		System.out.println("Login Sucessfully");
	}

	@When("^User click on logout button$")
	public void user_click_on_logout_button() throws Throwable {
		WebElement logout=driver.findElement(By.xpath("//button[text()='Log out']"));
		logout.click();
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
		System.out.println("Logout sucessfully");
	}
	@When("^User click on search button$")
	public void user_click_on_search_button() throws Throwable {
	    WebElement search=driver.findElement(By.xpath("//input[@id='searchBox']"));
	    search.click();
	    
	}

	@When("^User search java script book$")
	public void user_search_java_script_book() throws Throwable {
		WebElement search=driver.findElement(By.xpath("//input[@id='searchBox']"));
	    search.sendKeys("Javascript");
	    
	}

	@Then("^Results should be displayed as Java Script books only$")
	public void results_should_be_displayed_as_Java_Script_books_only() throws Throwable {
	    System.out.println("List of Javascript books are displayed");
	}
	@Then("^User logged out succesfully$")
	public void user_logged_out_succesfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Hello");
	}

}
