package frontend;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {


    //LOGIN
    @FindBy(xpath = "/html/body/div/div/header/div/div/form/button")
    private WebElement login_button;

    @FindBy(xpath = "/html/body/div/div/header/div/div/button")
    private WebElement login_registerButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[1]")
    private WebElement login_userInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/form/input[2]")
    private WebElement login_passwordInput;


    //USERPAGE
    @FindBy(xpath = "/html/body/div/div/header/div/div/h1")
    private WebElement notep_userHeader;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[1]/form/textarea")
    private WebElement notep_addNoteField;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[1]/form/button")
    private WebElement notep_addButton;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[2]")
    private WebElement notep_container;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div[2]/div[1]/form/button[2]")
    private WebElement notep_deleteButton;

//    @FindBy(xpath = "//*[@id=\"11\"]")
//    private WebElement updateButton;

    //Register
    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/input[1]")
    private WebElement register_userInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/input[2]")
    private WebElement register_passInput;

    @FindBy(xpath = "/html/body/div/div/header/div/div/div/form/button")
    private WebElement register_registerButton;


    //LOGIN
    public WebElement getLoginButton() { return login_button; }

    public WebElement getUserInput(){
        return login_userInput;
    }

    public WebElement getPasswordInput(){
        return login_passwordInput;
    }




    //USERPAGE
    public WebElement getUserHeader(){
        return notep_userHeader;
    }

    public WebElement getAddNoteField(){
        return notep_addNoteField;
    }

    public WebElement getAddButton(){
        return notep_addButton;
    }

    public WebElement getNoteContainer() {
        return notep_container;
    }

    public WebElement getDeleteButton() {
        return notep_deleteButton;
    }

    //Register
    public WebElement getRegisterUserInput(){
        return register_userInput;
    }

    public WebElement getRegisterPassInput(){
        return register_passInput;
    }

    public WebElement getRegisterButton(){
        return register_registerButton;
    }

}
