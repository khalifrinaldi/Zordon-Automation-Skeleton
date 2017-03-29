#Zordon Automation

Please read [this](ReadMe.md) before read this section.
If you already read [this](ReadMe.md) , now you're ready to do this section

How to run your project :

1. Create your `.feature` under package `features`
```java
+-- src
    +-- main
        +-- java
            +-- features
                +-- yourfiles.feature //this is your feature files
```

2. Write your scenario on `yourfiles.feature` , check my example on `Login.feature`

```bash
Feature: Login feature

  Scenario: Login with unregistered number
    Given On Homepage tap existing user
    When On Register Page tap number field and fill 818234123
    And On Register Page tap password field and fill 1234
    Then On Register Page tap Sign In after fill the requirement
```

3. Create your steps definition under package `steps` using java class

```java
+--- src
     +--- main
          +--- java
               +-- steps
                   +--- yoursteps.java //this is your steps definition
```

4. Write your steps definition on `yoursteps.java` , check my example on `LoginSteps.java`

```java
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
```

5. Check on `ZordonSetup.java` before try to running your project

```java
capabilities.setCapability("deviceName", "your deviceID"); //Fill with your device ID
capabilities.setCapability(CapabilityType.BROWSER_NAME, "Android"); //Don't Change this
capabilities.setCapability(CapabilityType.VERSION, "Your Android version"); //Fill with your Android version
capabilities.setCapability("platformName", "Android"); //Don't change this
capabilities.setCapability("app", "your .apk path"); //Fill your .apk path
capabilities.setCapability("appPackage", "your package"); //Fill your package apps
capabilities.setCapability("appActivity", "your launchable activity apps"); //Fill your launchable activity apps
driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities); //Don't change this
```

6. After all done then you can run project

If you have any specific queries reach out to me at [Github](https://github.com/raixa) or [E-Mail](mailto:khalif.rinaldi@gmail.com)

