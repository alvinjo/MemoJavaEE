package frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {

    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/input[1]")
    private WebElement userInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/input[2]")
    private WebElement passInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/button")
    private WebElement registerButton;


    public WebElement getUserInput(){
        return userInput;
    }

    public WebElement getPassInput(){
        return passInput;
    }

    public WebElement getRegisterButton(){
        return registerButton;
    }

}
