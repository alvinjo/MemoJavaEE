package frontend;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class FrontSteps {

    WebDriver driver;
    String URL = "http://localhost:3000";
    LoginPage login;
    RegisterPage register;
    UserPage userPage;
    FrontTest runner = new FrontTest();
    String GECKO_DRIVER_PATH = "C:\\Users\\Alvin\\IdeaProjects\\Memo\\src\\test\\resources";
    String USER_IN = "one";
    String PASS_IN = "two";

    @Before
    public void setup(){
        System.setProperty("webdriver.gecko.driver", GECKO_DRIVER_PATH);
        driver = new FirefoxDriver();
    }

    @Given("^the correct web address$")
    public void the_correct_web_address(){
        driver.get(URL);
        login = PageFactory.initElements(driver, LoginPage.class);
        register = PageFactory.initElements(driver, RegisterPage.class);
        userPage = PageFactory.initElements(driver, UserPage.class);
    }

    @When("^I enter my user credentials and press login$")
    public void i_enter_my_user_credentials_and_press_login(){
        login.getUserInput().sendKeys(USER_IN);
        login.getPasswordInput().sendKeys(PASS_IN);
        login.loginClick();
    }

    @Then("^I am taken to my user page$")
    public void i_am_taken_to_my_user_page(){
        Assert.assertEquals(USER_IN, userPage.getUserHeader().getText());
    }

    @When("^I enter value in field and press add button$")
    public void i_enter_value_in_field_and_press_add_button(){
        userPage.getAddNoteField().sendKeys("New note");
        userPage.getAddButton().click();
    }

    @Then("^This note is added$")
    public void this_note_is_added(){
        Assert.assertEquals("New note",userPage.getNoteContainer().getText());
    }

    @When("^I press delete button$")
    public void i_press_delete_button(){
        userPage.getDeleteButton().click();
    }

    @Then("^The note is deleted$")
    public void the_note_is_deleted(){
        Assert.assertTrue(userPage.getNoteContainer().getText().equals("New note"));
    }

    @When("^I change the value and press update button$")
    @Ignore
    public void i_change_the_value_and_press_update_button(){

    }

    @Then("^The note is updated$")
    @Ignore
    public void the_note_is_updated(){

    }

    @After
    public void tearDown(){
        runner.report.endTest(runner.test);
        driver.quit();
    }

}
