package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestImplementation  {

    @Given("user should navigate on homepage")
    public void user_should_navigate_on_homepage() throws Throwable {
       System.out.println("home page");
    }

    @When("user click on login link and enter username and password and click")
    public void user_click_on_login_link_and_enter_username_and_password_and_click() throws Throwable {
        System.out.println("enter a valid credential");
    }

    @Then("user logged in applicaion")
    public void user_logged_in_applicaion() throws Throwable {
      System.out.println("logged in");  
    }

}