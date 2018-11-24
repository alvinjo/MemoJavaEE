package frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/button")
    private WebElement registerButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[1]")
    private WebElement userInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[2]")
    private WebElement passwordInput;

    public void loginClick(){
        loginButton.click();
    }

    public void registerClick(){
        registerButton.click();
    }

    public WebElement getUserInput(){
        return userInput;
    }

    public WebElement getPasswordInput(){
        return passwordInput;
    }


}
