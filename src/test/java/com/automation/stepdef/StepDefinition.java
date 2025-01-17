package com.automation.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Then("user opens website")
    public void openWebSite() {

    }

    @When("user is on login page")
    public void verifyLoginPage() {

    }

    @When("user enters username {string} and password {string}")
    public void doLogin(String username, String password) {
        System.out.println(username + "   "+ password);
    }

    @When("click on login button")
    public void click_on_login_button() {

    }

    @When("verify user is navigated to homepage")
    public void verifyHomePage() {

    }

    @Given("user clicks on user badge icon")
    public void clickOnUserBadge() {

    }

    @When("select on logout option")
    public void selectLogoutOption() {

    }

    @Then("user close the browser")
    public void user_close_the_browser() {

    }

    @Then("verify invalid login error message is displayed")
    public void verify_invalid_login_error_message_is_displayed() {

    }

    @When("user hover mouse on PIM menu")
    public void user_hover_mouse_on_pim_menu() {
        
        
    }
    @When("click on Add Employee link")
    public void click_on_add_employee_link() {
        
        
    }
    @Then("verify user is navigated to add employee page")
    public void verify_user_is_navigated_to_add_employee_page() {
        
        
    }
    @When("user enters valid details on add employee page")
    public void user_enters_valid_details_on_add_employee_page() {

    }

    @When("click on save button")
    public void click_on_save_button() {
        
    }

    @Then("verify user is navigated to personal details page")
    public void verify_user_is_navigated_to_personal_details_page() {

    }

    @Then("verify error message for missing first name and last name")
    public void verify_error_message_for_missing_first_name_and_last_name() {

     }
}
