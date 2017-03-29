package steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import setups.ZordonSetup;

public class LoginStep extends ZordonSetup{

    @Before
    public void setup() throws Exception {
        PrepareAutomation();
    }

    @Given("^On Homepage tap existing user$")
    public void onHomepageTapExistingUserAndFill() throws Throwable {
        driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
    }

    @When("^On Register Page tap number field and fill (\\d+)$")
    public void onRegisterPageTapNumberFieldAndFill(String number) throws Throwable {
        driver.findElement(By.id("com.flipkart.android:id/mobileNo")).clear();
        driver.findElement(By.id("com.flipkart.android:id/mobileNo")).sendKeys(number);
    }

    @And("^On Register Page tap password field and fill (\\d+)$")
    public void onRegisterPageTapPasswordFieldAndFill(String pass) throws Throwable {
        driver.findElement(By.id("com.flipkart.android:id/et_password")).sendKeys(pass);
    }

    @Then("^On Register Page tap Sign In after fill the requirement$")
    public void onRegisterPageTapSignInAfterFillTheRequirement() throws Throwable {
        driver.findElement(By.id("com.flipkart.android:id/btn_mlogin")).click();
    }
}
