package stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestImplementation  {
  public WebDriver driver;
    @Given("user should navigate on homepage")
    public void user_should_navigate_on_homepage() throws Throwable {
       System.out.println("home page");
       driver =  new ChromeDriver();
       driver.get("https://demoblaze.com/index.html#");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @When("user click on login link and enter username and password and click")
    public void user_click_on_login_link_and_enter_username_and_password_and_click() throws Throwable {
    System.out.println("user enter user name and password and click on login button");
    driver.findElement(By.xpath("//a[@id='login2']")).click();
    Thread.sleep(4000);
    driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("testacc3");
    driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("test");
    driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

    }
    @Then("user logged in applicaion")
    public void user_logged_in_applicaion() throws Throwable {
    System.out.println("user is logged in");  
    Thread.sleep(4000);
    String status = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
    System.out.println(status);
    Assert.assertEquals(status,"Welcome testacc3");
    }
   
    @When("click on samsung galaxy s6")
    public void click_on_samsung_galaxy_s6() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]")).click();
    }
    @When("click on lumia1520")
    public void click_on_lumia1520() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Nokia lumia 1520')]")).click();	
    }
    @When("click on Nexus6")
    public void click_on_nexus6() throws InterruptedException {
    Thread.sleep(5000);
    driver.findElement(By.xpath("//a[contains(text(),'Nexus 6')]")).click();
    }
    @When("when user click on phone")
    public void when_user_click_on_phone() throws InterruptedException {
    	 Thread.sleep(5000);
 	     driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
 	
    }

 
    @When("when user click on phones")
    public void when_user_click_on_phones() throws InterruptedException {
    	 Thread.sleep(5000);
    	 driver.findElement(By.xpath("//a[contains(text(),'Phones')]")).click();
    	   
    }
    @When("click on add to cart")
    public void click_on_add_to_cart() throws InterruptedException {
    Thread.sleep(7000);
    driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]")).click();
    Thread.sleep(5000);
    }
    
    @Then("it show product added text on popup")
    public void it_show_product_added_text_on_popup() throws InterruptedException {
    String status = driver.switchTo().alert().getText();
    Thread.sleep(5000);
    Assert.assertEquals(status, "Product added");
    Thread.sleep(5000);
	}
    
	@Then("click on ok on popup")
    public void click_on_ok_on_popup() throws InterruptedException {
		Thread.sleep(5000);
        driver.switchTo().alert().accept();
    }
	@When("user click on login link")
	public void user_click_on_login_link() throws Throwable {
	    driver.findElement(By.xpath("//a[@id='login2']")).click();
          Thread.sleep(5000);
	}
	@When("enter username as {string} and enter password as{string}")
	public void enter_username_as_and_enter_password_as_test(String username, String password) {
		 driver.findElement(By.xpath("//input[@id='loginusername']")).sendKeys("username");
		    driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("password");
		   
	}
	@When("click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

	}
	 @Then("user logged in applicaion and showing{string}")
	    public void user_logged_in_applicaion_and_showing(String status1) throws Throwable {
	    System.out.println("user is logged in");  
	    Thread.sleep(4000);
	    String status = driver.findElement(By.xpath("//a[@id='nameofuser']")).getText();
	    System.out.println(status);
	    Assert.assertEquals(status,"Welcome testacc4");
	    }
	   

}